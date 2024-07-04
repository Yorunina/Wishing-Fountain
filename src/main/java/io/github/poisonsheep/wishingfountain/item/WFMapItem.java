package io.github.poisonsheep.wishingfountain.item;

import net.minecraft.core.*;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerChunkCache;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.Mth;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.MapItem;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.BiomeSource;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.biome.Climate;
import net.minecraft.world.level.saveddata.maps.MapDecoration;
import net.minecraft.world.level.saveddata.maps.MapItemSavedData;
import net.minecraft.world.phys.Vec3;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class WFMapItem extends Item {
    private static final Direction[] DIRECTIONS = new Direction[] { Direction.EAST, Direction.SOUTH, Direction.WEST, Direction.NORTH };
    protected static final String BIOME = "targetBiome";
    protected static final String IS_SEARCHING = "isSearchingForBiome";
    protected static final String POS_X = "searchPosX";
    protected static final String POS_Z = "searchPosZ";
    protected static final String SOURCE_X = "searchSourceX";
    protected static final String SOURCE_Z = "searchSourceZ";
    protected static final String POS_LEG = "searchPosLeg";
    protected static final String POS_LEG_INDEX = "searchPosLegIndex";
    public static final String COLOR = "targetBiomeColor";
    public static int SEARCHING_RADIUS = 6400;

    public WFMapItem() {
        super(new Properties().stacksTo(1));
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level worldIn, Player player, InteractionHand hand) {
        ItemStack handStack = player.getItemInHand(hand);
        ItemStack searchingMap = getSearchingMap(player);
        if(searchingMap != null) {
            player.displayClientMessage(Component.translatable("wishing_fountain.misc.only_one_map_searching"), true);
            return InteractionResultHolder.fail(handStack);
        }
        playSound(worldIn, player);
        //不清楚getPosition里面的参数是啥
        Vec3 pos = player.getPosition(1F);
        handStack.getTag().putBoolean(IS_SEARCHING, true);
        handStack.getTag().putDouble(SOURCE_X, pos.x);
        handStack.getTag().putDouble(SOURCE_Z, pos.z);
        return InteractionResultHolder.sidedSuccess(handStack, worldIn.isClientSide);
    }

    @Override
    public void inventoryTick(ItemStack stack, Level worldIn, Entity entity, int slot, boolean hand) {
        if (stack.getTag() != null && worldIn instanceof ServerLevel server && stack.getTag().getBoolean(IS_SEARCHING) && entity instanceof Player player) {
            ItemStack runningStack = search(stack, server, player, slot);
            if(player.getOffhandItem() == stack){
                player.setItemInHand(InteractionHand.OFF_HAND, runningStack);
            } else {
                player.getInventory().setItem(slot, runningStack);
            }
        }
    }

    private static ResourceLocation getTarget(ItemStack stack) {
        String tagBiome = stack.getOrCreateTag().getString(BIOME);
        if(tagBiome.isEmpty()) {
            ResourceKey<Biome> biome = Biomes.MUSHROOM_FIELDS;
            return biome.location();
        }
        return new ResourceLocation(tagBiome);
    }

    private ItemStack getSearchingMap(Player player) {
        for(ItemStack stack : player.getInventory().items) {
            if(stack.getItem() instanceof WFMapItem) {
                boolean searching = stack.getOrCreateTag().getBoolean(IS_SEARCHING);
                if(searching)
                    return stack;
            }
        }
        return null;
    }

    private ItemStack search(ItemStack stack, ServerLevel worldIn, Player player, int slot) {
        ResourceLocation targetBiome = getTarget(stack);
        if(targetBiome == null) {
            return ItemStack.EMPTY;
        }
        InteractionResultHolder<BlockPos> result = searchConcurrent(targetBiome, worldIn, stack, player);
        if(result.getResult() == InteractionResult.FAIL) {
            return ItemStack.EMPTY;
        } else if(result.getResult() == InteractionResult.PASS) {
            return stack;
        } else {
            BlockPos corner = result.getObject();
            BlockPos found = calculateBiomeCenter(worldIn, corner, targetBiome);
            return this.createMap(worldIn, found, targetBiome, stack);
        }
    }

    //并发搜索模式
    protected InteractionResultHolder<BlockPos> searchConcurrent(ResourceLocation targetBiome, ServerLevel worldIn, ItemStack stack, Player player) {
        int centerX = stack.getOrCreateTag().getInt(SOURCE_X);
        int centerZ = stack.getOrCreateTag().getInt(SOURCE_Z);
        BlockPos centerPos = new BlockPos(centerX, 64, centerZ);
        //这部分没看懂
        Key key = new Key(GlobalPos.of(worldIn.dimension(), centerPos), targetBiome);
        if(COMPUTING.contains(key)) {
            return InteractionResultHolder.pass(BlockPos.ZERO);
        } else if(RESULTS.containsKey(key)) {
            //we could use remove here instead but this serves as a cache since the result is always the same
            var ret = RESULTS.get(key);
            //EXECUTORS.submit(() -> RESULTS.remove(key)); //lmao. no lag spikes allowed. write is slow
            if(ret.getResult() == InteractionResult.PASS) {
                //this should never happen
                return InteractionResultHolder.fail(BlockPos.ZERO);
            }
            return ret;
        } else {
            //we don't want to alter the original stack here
            ItemStack dummy = stack.copy();
            EXECUTORS.submit(() -> {
                COMPUTING.add(key);
                RESULTS.put(key, searchIterative(targetBiome, dummy, worldIn, player, Integer.MAX_VALUE));
                COMPUTING.remove(key);
            });
            return InteractionResultHolder.pass(BlockPos.ZERO);
        }
    }

    //basically the old search method
    //pass = not done
    //fail = failed
    //present = success
    protected InteractionResultHolder<BlockPos> searchIterative(ResourceLocation targetBiome, ItemStack stack, ServerLevel worldIn, Player player, int maxIter) {
        int y = player.getBlockY();
        for(int i = 0; i < maxIter; i++) {

            final int height = 64;

            BlockPos nextPos = nextPos(stack);
            if(nextPos == null) {
                return InteractionResultHolder.fail(BlockPos.ZERO);
            }
            int[] searchedHeights = Mth.outFromOrigin(y, worldIn.getMinBuildHeight() + 1, worldIn.getMaxBuildHeight(), height).toArray();

            int testX = nextPos.getX();
            int testZ = nextPos.getZ();
            int quartX = QuartPos.fromBlock(testX);
            int quartZ = QuartPos.fromBlock(testZ);

            for(int testY : searchedHeights) {
                int quartY = QuartPos.fromBlock(testY);

                ServerChunkCache cache = worldIn.getChunkSource();
                BiomeSource source = cache.getGenerator().getBiomeSource();
                Climate.Sampler sampler = cache.randomState().sampler();

                Holder<Biome> holder = source.getNoiseBiome(quartX, quartY, quartZ, sampler);

                if(holder.is(targetBiome)) {
                    BlockPos mapPos = new BlockPos(testX, testY, testZ);
                    return InteractionResultHolder.sidedSuccess(mapPos, worldIn.isClientSide);
                }
            }
        }
        return InteractionResultHolder.pass(BlockPos.ZERO);
    }

    protected static BlockPos nextPos(ItemStack stack) {
        final int step = 32;

        int sourceX = stack.getOrCreateTag().getInt(SOURCE_X);
        int sourceZ = stack.getOrCreateTag().getInt(SOURCE_Z);

        int x = stack.getOrCreateTag().getInt(POS_X);
        int z = stack.getOrCreateTag().getInt(POS_Z);
        int leg = stack.getOrCreateTag().getInt(POS_LEG);
        int legIndex = stack.getOrCreateTag().getInt(POS_LEG_INDEX);

        BlockPos cursor = new BlockPos(x, 0, z).relative(DIRECTIONS[(leg + 4) % 4]);

        int newX = cursor.getX();
        int newZ = cursor.getZ();

        int legSize = leg / 2 + 1;
        int maxLegs = 4 * Math.floorDiv(SEARCHING_RADIUS, step);

        if(legIndex >= legSize) {
            if(leg > maxLegs)
                return null;

            leg++;
            legIndex = 0;
        }

        legIndex++;

        stack.getOrCreateTag().putInt(POS_X, newX);
        stack.getOrCreateTag().putInt(POS_Z, newZ);
        stack.getOrCreateTag().putInt(POS_LEG, leg);
        stack.getOrCreateTag().putInt(POS_LEG_INDEX, legIndex);

        int retX = sourceX + newX * step;
        int retZ = sourceZ + newZ * step;

        return new BlockPos(retX, 0, retZ);
    }

    private BlockPos calculateBiomeCenter(ServerLevel worldIn, BlockPos biomeCorner, ResourceLocation biome) {
        ServerChunkCache cache = worldIn.getChunkSource();
        BiomeSource source = cache.getGenerator().getBiomeSource();
        Climate.Sampler sampler = cache.randomState().sampler();
        int biomeNorth = 0;
        int biomeSouth = 0;
        int biomeEast = 0;
        int biomeWest = 0;
        BlockPos yCentered;
        int biomeUp = 0;
        int biomeDown = 0;
        while (biomeUp < 32 && getNoiseBiomeAtPos(source, biomeCorner.above(biomeUp), sampler).is(biome)) {
            biomeUp += 8;
        }
        while (biomeDown < 64 && getNoiseBiomeAtPos(source, biomeCorner.below(biomeDown), sampler).is(biome)) {
            biomeDown += 8;
        }
        yCentered = biomeCorner.atY((int) (Math.floor(biomeUp * 0.25F)) - biomeDown);
        while (biomeNorth < 800 && getNoiseBiomeAtPos(source, yCentered.north(biomeNorth), sampler).is(biome)) {
            biomeNorth += 8;
        }
        while (biomeSouth < 800 && getNoiseBiomeAtPos(source, yCentered.south(biomeSouth), sampler).is(biome)) {
            biomeSouth += 8;
        }
        while (biomeEast < 800 && getNoiseBiomeAtPos(source, yCentered.east(biomeEast), sampler).is(biome)) {
            biomeEast += 8;
        }
        while (biomeWest < 800 && getNoiseBiomeAtPos(source, yCentered.west(biomeWest), sampler).is(biome)) {
            biomeWest += 8;
        }
        return yCentered.offset(biomeEast - biomeWest, 0, biomeSouth - biomeNorth);
    }

    private Holder<Biome> getNoiseBiomeAtPos(BiomeSource source, BlockPos pos, Climate.Sampler sampler){
        return source.getNoiseBiome(pos.getX() >> 2, pos.getY() >> 2, pos.getZ() >> 2, sampler);
    }

    public ItemStack createMap(ServerLevel level, BlockPos targetPos, ResourceLocation target, ItemStack original) {
        int color = getOverlayColor(original);
        Component biomeComponent = Component.translatable("biome." + target.getNamespace() + "." + target.getPath());

        ItemStack stack = MapItem.create(level, targetPos.getX(), targetPos.getZ(), (byte) 2, true, true);

        MapItem.renderBiomePreviewMap(level, stack);
        MapItemSavedData.addTargetDecoration(stack, targetPos, "+", MapDecoration.Type.RED_X);
        stack.setHoverName(Component.translatable("item.wishing_fountain.map", biomeComponent));

        stack.getOrCreateTagElement("display").putInt("MapColor", color);
        stack.getOrCreateTag().putBoolean(IS_SEARCHING, true);

        return stack;
    }

    public static void setBiome(ItemStack itemStack, String biome) {
        itemStack.getOrCreateTag().putString(BIOME, biome);
    }

    public static int getOverlayColor(ItemStack stack) {
        return  stack.getOrCreateTag().getInt(COLOR);
    }

    private void playSound(Level worldIn, Player player) {}

    /*Key：这是一个记录类，它包含一个全局位置（GlobalPos）和一个结构的资源位置（ResourceLocation）。这个记录类被用作在并发搜索中唯一标识一个搜索任务的键。
    RESULTS：这是一个并发哈希映射，它用于存储已经完成的搜索任务的结果。每个搜索任务的键是一个 Key 对象，值是一个 InteractionResultHolder<BlockPos> 对象，表示搜索的结果。
    COMPUTING：这是一个并发哈希集合，它用于存储正在计算的搜索任务的键。当一个搜索任务开始时，它的键会被添加到这个集合中；当搜索任务完成时，它的键会被从这个集合中移除。
    EXECUTORS：这是一个执行器服务，它用于执行并发搜索任务。这个执行器服务使用了一个缓存的线程池，这意味着它会为每个任务创建一个新的线程，如果有空闲的线程，它会重用这些线程。*/
    private record Key(GlobalPos pos, ResourceLocation structure) {}

    private static final Map<Key, InteractionResultHolder<BlockPos>> RESULTS = new ConcurrentHashMap<>();
    private static final Set<Key> COMPUTING = ConcurrentHashMap.newKeySet();
    protected static final ExecutorService EXECUTORS = Executors.newCachedThreadPool();

}