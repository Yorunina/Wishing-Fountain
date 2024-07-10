package io.github.poisonsheep.wishingfountain.item;

import net.minecraft.core.BlockPos;
import net.minecraft.core.GlobalPos;
import net.minecraft.core.Holder;
import net.minecraft.core.QuartPos;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerChunkCache;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.Mth;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.BiomeSource;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.biome.Climate;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class WFBiomeMapItem extends WFMapItem {

    protected ResourceLocation getTarget(ItemStack stack) {
        String tagBiome = stack.getOrCreateTag().getString(TARGET);
        if(tagBiome.isEmpty()) {
            ResourceKey<Biome> biome = Biomes.MUSHROOM_FIELDS;
            return biome.location();
        }
        return new ResourceLocation(tagBiome);
    }

    @Override
    protected ItemStack search(ItemStack stack, ServerLevel worldIn, Player player, int slot) {
        ResourceLocation target = getTarget(stack);
        if(target == null) {
            return ItemStack.EMPTY;
        }
        InteractionResultHolder<BlockPos> result = searchConcurrent(target, worldIn, stack, player);
        if(result.getResult() == InteractionResult.FAIL) {
            return ItemStack.EMPTY;
        } else if(result.getResult() == InteractionResult.PASS) {
            return stack;
        } else {
            BlockPos corner = result.getObject();
            BlockPos found = calculateBiomeCenter(worldIn, corner, target);
            worldIn.playSound(null, player.getX(), player.getY(), player.getZ(), SoundEvents.BOTTLE_EMPTY, SoundSource.PLAYERS, 1F, 1F);
            return createMap(worldIn, found, target, stack);
        }
    }

    //并发搜索模式
    protected InteractionResultHolder<BlockPos> searchConcurrent(ResourceLocation targetBiome, ServerLevel worldIn, ItemStack stack, Player player) {
        int centerX = stack.getOrCreateTag().getInt(SOURCE_X);
        int centerZ = stack.getOrCreateTag().getInt(SOURCE_Z);
        BlockPos centerPos = new BlockPos(centerX, 64, centerZ);
        Key key = new Key(GlobalPos.of(worldIn.dimension(), centerPos), targetBiome);
        if(COMPUTING.contains(key)) {
            return InteractionResultHolder.pass(BlockPos.ZERO);
        } else if(RESULTS.containsKey(key)) {
            var ret = RESULTS.get(key);
            if(ret.getResult() == InteractionResult.PASS) {
                return InteractionResultHolder.fail(BlockPos.ZERO);
            }
            return ret;
        } else {
            ItemStack dummy = stack.copy();
            EXECUTORS.submit(() -> {
                COMPUTING.add(key);
                RESULTS.put(key, searchIterative(targetBiome, dummy, worldIn, player));
                COMPUTING.remove(key);
            });
            return InteractionResultHolder.pass(BlockPos.ZERO);
        }
    }

    protected InteractionResultHolder<BlockPos> searchIterative(ResourceLocation targetBiome, ItemStack stack, ServerLevel worldIn, Player player) {
        int y = player.getBlockY();
        for(int i = 0; i < Integer.MAX_VALUE; i++) {
            final int height = 64;
            BlockPos nextPos = nextPos(stack, 32);
            System.out.println(nextPos);
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

    public static void setTarget(ItemStack itemStack, String target) {
        itemStack.getOrCreateTag().putString(TARGET, target);
    }

    /*Key：这是一个记录类，它包含一个全局位置（GlobalPos）和一个结构的资源位置（ResourceLocation）。这个记录类被用作在并发搜索中唯一标识一个搜索任务的键。
    RESULTS：这是一个并发哈希映射，它用于存储已经完成的搜索任务的结果。每个搜索任务的键是一个 Key 对象，值是一个 InteractionResultHolder<BlockPos> 对象，表示搜索的结果。
    COMPUTING：这是一个并发哈希集合，它用于存储正在计算的搜索任务的键。当一个搜索任务开始时，它的键会被添加到这个集合中；当搜索任务完成时，它的键会被从这个集合中移除。
    EXECUTORS：这是一个执行器服务，它用于执行并发搜索任务。这个执行器服务使用了一个缓存的线程池，这意味着它会为每个任务创建一个新的线程，如果有空闲的线程，它会重用这些线程。*/
    private record Key(GlobalPos pos, ResourceLocation target) {}

    private static final Map<Key, InteractionResultHolder<BlockPos>> RESULTS = new ConcurrentHashMap<>();
    private static final Set<Key> COMPUTING = ConcurrentHashMap.newKeySet();
    protected static final ExecutorService EXECUTORS = Executors.newCachedThreadPool();
}