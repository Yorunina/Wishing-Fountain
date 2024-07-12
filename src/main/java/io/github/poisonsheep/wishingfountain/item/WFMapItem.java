package io.github.poisonsheep.wishingfountain.item;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.MapItem;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.saveddata.maps.MapDecoration;
import net.minecraft.world.level.saveddata.maps.MapItemSavedData;
import net.minecraft.world.phys.Vec3;

abstract class WFMapItem extends Item {

    protected static final Direction[] DIRECTIONS = new Direction[] { Direction.EAST, Direction.SOUTH, Direction.WEST, Direction.NORTH };
    protected static final String IS_SEARCHING = "isSearching";
    protected static final String SOURCE_X = "searchSourceX";
    protected static final String SOURCE_Z = "searchSourceZ";
    protected static final String POS_X = "searchPosX";
    protected static final String POS_Z = "searchPosZ";
    protected static final String POS_LEG = "searchPosLeg";
    protected static final String POS_LEG_INDEX = "searchPosLegIndex";
    protected static final String DISTANCE = "distance";
    protected static final String COLOR = "targetColor";
    protected static final String TARGET = "target";
    protected static int SEARCHING_RADIUS = 6400;

    public WFMapItem() {
        super(new Item.Properties().stacksTo(1));
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level worldIn, Player player, InteractionHand hand) {
        ItemStack handStack = player.getItemInHand(hand);
        ItemStack searchingMap = getSearchingMap(player);
        if(searchingMap != null) {
            player.displayClientMessage(Component.translatable("wishing_fountain.misc.only_one_map_searching"), true);
            return InteractionResultHolder.fail(handStack);
        }
        //不清楚getTag()和getOrCreateTag()有啥区别
        Vec3 pos = player.getPosition(1F);
        handStack.getOrCreateTag().putBoolean(IS_SEARCHING, true);
        handStack.getOrCreateTag().putDouble(SOURCE_X, pos.x);
        handStack.getOrCreateTag().putDouble(SOURCE_Z, pos.z);
        handStack.getOrCreateTag().putDouble(DISTANCE, Double.MAX_VALUE);
        return InteractionResultHolder.sidedSuccess(handStack, worldIn.isClientSide);
    }

    @Override
    public void inventoryTick(ItemStack stack, Level worldIn, Entity entity, int slot, boolean hand) {
        if (stack.getTag() != null && stack.getTag().getBoolean(IS_SEARCHING) && entity instanceof Player player) {
            if(worldIn instanceof ServerLevel server) {
                ItemStack runningStack = search(stack, server, player, slot);
                if(player.getOffhandItem() == stack){
                    player.setItemInHand(InteractionHand.OFF_HAND, runningStack);
                } else {
                    player.getInventory().setItem(slot, runningStack);
                }
            } else {
                if((stack.equals(player.getMainHandItem()) || stack.equals(player.getOffhandItem())) && worldIn.getGameTime() % 20 == 0 ) {
                    RandomSource rand = worldIn.getRandom();
                    player.playSound(SoundEvents.BOAT_PADDLE_WATER,1.0F, 1.2F + (rand.nextFloat() - rand.nextFloat()) * 0.2F);
                }
            }
        }
    }

    protected static BlockPos nextPos(ItemStack stack, int step) {
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

    public ItemStack createMap(ServerLevel level, BlockPos targetPos, ResourceLocation target, ItemStack original) {
        int color = getOverlayColor(original);
        Component biomeComponent = Component.translatable(target.getNamespace() + "." + target.getPath());
        ItemStack stack = MapItem.create(level, targetPos.getX(), targetPos.getZ(), (byte) 2, true, true);
        MapItem.renderBiomePreviewMap(level, stack);
        MapItemSavedData.addTargetDecoration(stack, targetPos, "+", MapDecoration.Type.RED_X);
        stack.setHoverName(Component.translatable("item.wishing_fountain.map", biomeComponent));
        stack.getOrCreateTagElement("display").putInt("MapColor", color);
        stack.getOrCreateTag().putBoolean(IS_SEARCHING, true);
        return stack;
    }

    public static int getOverlayColor(ItemStack stack) {
        return  stack.getOrCreateTag().getInt(COLOR);
    }

    protected abstract ItemStack search(ItemStack stack, ServerLevel worldIn, Player player, int slot);

}
