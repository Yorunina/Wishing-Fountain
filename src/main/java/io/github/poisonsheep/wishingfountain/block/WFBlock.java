package io.github.poisonsheep.wishingfountain.block;

import io.github.poisonsheep.wishingfountain.inventory.WFRecipeInventory;
import io.github.poisonsheep.wishingfountain.recipe.WFRecipe;
import io.github.poisonsheep.wishingfountain.registry.RecipeRegistry;
import io.github.poisonsheep.wishingfountain.tileentity.WFEntity;
import io.github.poisonsheep.wishingfountain.util.PosListData;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraftforge.items.ItemHandlerHelper;
import org.jetbrains.annotations.Nullable;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class WFBlock extends BaseEntityBlock implements SimpleWaterloggedBlock {

    public static final IntegerProperty FOUNTAIN = IntegerProperty.create("fountain", 1, 2);
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
    protected static final VoxelShape DEFAULT_SHAPE = Block.box(0.0D, 0.0D, 0.0D, 16.0D, 16.0D, 16.0D);
    protected static final VoxelShape BOTTOM_AABB = Block.box(0.0D, 0.0D, 0.0D, 16.0D, 8.0D, 16.0D);

    public WFBlock() {
        super(BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(2, 2).noOcclusion());
        this.registerDefaultState(this.stateDefinition.any().setValue(FOUNTAIN, Integer.valueOf(1)).setValue(WATERLOGGED, Boolean.valueOf(false)));
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new WFEntity(pos, state);
    }

    protected Optional<WFEntity> getEntity(BlockGetter world, BlockPos pos) {
        BlockEntity te = world.getBlockEntity(pos);
        if (te instanceof WFEntity) {
            return Optional.of((WFEntity) te);
        }
        return Optional.empty();
    }

    @Override
    public InteractionResult use(BlockState state, Level worldIn, BlockPos pos, Player player, InteractionHand handIn, BlockHitResult hit) {
        return this.getEntity(worldIn, pos).filter(wishingFountain -> handIn == InteractionHand.MAIN_HAND).map(wishingFountain -> {
            if (wishingFountain.isCanPlaceItem()) {
                if (player.getMainHandItem().isEmpty()) {
                    return takeOutItem(worldIn, wishingFountain, player);
                } else {
                    return takeInItem(worldIn, wishingFountain, player);
                }
            }
            return InteractionResult.FAIL;
        }).orElse(super.use(state, worldIn, pos, player, handIn, hit));
    }

    private InteractionResult takeOutItem(Level worldIn, WFEntity wishingFountain, Player player) {
        ItemStack stack = wishingFountain.handler.getStackInSlot(0);
        if(!stack.isEmpty()) {
            if (player.isShiftKeyDown()) {
                ItemStack extractItem = wishingFountain.handler.extractItem(0, stack.getCount(), false);
                ItemHandlerHelper.giveItemToPlayer(player, extractItem);
            } else {
                ItemStack extractItem = wishingFountain.handler.extractItem(0, 1, false);
                ItemHandlerHelper.giveItemToPlayer(player, extractItem);
            }
            craft(worldIn, wishingFountain, player);
            wishingFountain.refresh();
            return InteractionResult.sidedSuccess(worldIn.isClientSide);
        }
        return InteractionResult.FAIL;
    }

    private InteractionResult takeInItem(Level worldIn, WFEntity wishingFountain, Player playerIn) {
        ItemStack playerItem = playerIn.getMainHandItem();
        ItemStack stack = wishingFountain.handler.getStackInSlot(0);
        if ((stack.isEmpty() || stack.getItem().equals(playerItem.getItem())) && stack.getCount() < 8 && stack.getCount() < playerItem.getMaxStackSize()) {
            ItemStack singleItemStack = playerItem.split(1);
            wishingFountain.handler.insertItem(0, singleItemStack, false);
            craft(worldIn, wishingFountain, playerIn);
            wishingFountain.refresh();
            return InteractionResult.sidedSuccess(worldIn.isClientSide);
        }
        return InteractionResult.FAIL;
    }

    @Override
    //弃用方法，不知道非弃用方法怎么搞
    public void entityInside(BlockState state, Level worldIn, BlockPos pos, Entity entity) {
        if (!worldIn.isClientSide() && entity instanceof ItemEntity itemEntity && worldIn.getBlockEntity(pos) instanceof WFEntity wishingFountain) {
            if(wishingFountain.isCanPlaceItem()) {
                wishingFountain.addItem(itemEntity);
                Entity thrower = itemEntity.getOwner();
                if(thrower instanceof Player player) {
                    craft(worldIn, wishingFountain, player);
                }
                wishingFountain.refresh();
            }
        }
    }

    @Override
    public void onRemove(BlockState state, Level worldIn, BlockPos pos, BlockState newState, boolean isMoving) {
        if (!worldIn.isClientSide) {
            this.getEntity(worldIn, pos).ifPresent(altar -> {
                ItemStack stack = altar.handler.getStackInSlot(0);
                if (!stack.isEmpty()) {
                    Block.popResource(worldIn, pos.offset(0, 1, 0), stack);
                }
            });
        }
        super.onRemove(state, worldIn, pos, newState, isMoving);
    }

    @Override
    public void playerWillDestroy(Level worldIn, BlockPos pos, BlockState state, Player player) {
        if (!worldIn.isClientSide) {
            this.getEntity(worldIn, pos).ifPresent(entity -> {
                this.restoreStorageBlock(worldIn, pos, entity.getBlockPosList());
                ItemStack mainHandItem = player.getMainHandItem();
                if (!player.isCreative() && mainHandItem.getItem() instanceof PickaxeItem) {
                    Block block = entity.getStorageState().getBlock();
                    Block.popResource(worldIn, pos, new ItemStack(block));
                }
            });
        }
        super.playerWillDestroy(worldIn, pos, state, player);
    }

    @Override
    public void onBlockExploded(BlockState state, Level worldIn, BlockPos pos, Explosion explosion) {
        if (!worldIn.isClientSide) {
            this.getEntity(worldIn, pos).ifPresent(altar -> this.restoreStorageBlock(worldIn, pos, altar.getBlockPosList()));
        }
        super.onBlockExploded(state, worldIn, pos, explosion);
    }

    private void restoreStorageBlock(Level worldIn, BlockPos currentPos, PosListData posList) {
        for (BlockPos storagePos : posList.getData()) {
            if (storagePos.equals(currentPos)) {
                continue;
            }
            this.getEntity(worldIn, storagePos).ifPresent(entity -> worldIn.setBlock(storagePos, entity.getStorageState(), Block.UPDATE_ALL));
        }
    }

    //在喷泉里有物品实体将持续调用
    private void craft(Level worldIn, WFEntity entity, Player player) {
        final WFRecipeInventory inv = new WFRecipeInventory();
        List<BlockPos> posList = entity.getBlockPosList().getData();
        int j = 0;
        Set<Item> addedItems = new HashSet<>(); // 创建一个HashSet来存储已经添加的物品
        for (BlockPos blockPos : posList) {
            BlockEntity te = worldIn.getBlockEntity(blockPos);
            if (te instanceof WFEntity wfEntity) {
                if (wfEntity.isCanPlaceItem()) {
                    ItemStack storageItem = wfEntity.getStorageItem();
                    if (!storageItem.isEmpty() && !addedItems.contains(storageItem.getItem())) { // 检查物品是否已经被添加
                        inv.setItem(j, storageItem);
                        j++;
                        addedItems.add(storageItem.getItem()); // 将物品添加到HashSet中
                    }
                }
            }
        }
        Optional<WFRecipe> optionalRecipe = worldIn.getRecipeManager().getAllRecipesFor(RecipeRegistry.WF_RECIPE_TYPE).stream().filter(r -> r.matches(inv, worldIn)).findFirst();
        optionalRecipe.ifPresent(r -> r.spawnOutputEntity(worldIn, player.getOnPos()));
        optionalRecipe.ifPresent(r -> removeIngredients(worldIn, inv, posList));
    }

    private void removeIngredients(Level worldIn, WFRecipeInventory inv, List<BlockPos> posList) {
        for (ItemStack item : inv.items) {
            if(!item.isEmpty()) {
                for (BlockPos pos : posList) {
                    BlockEntity te = worldIn.getBlockEntity(pos);
                    if (te instanceof WFEntity wfEntity) {
                        if(wfEntity.isCanPlaceItem()) {
                            ItemStack storage = wfEntity.getStorageItem();
                            if(item.equals(storage)) {
                                wfEntity.handler.extractItem(0, 1, false);
                                wfEntity.refresh();
                                break;
                            }
                        }
                    }
                }
            }
        }
        for (BlockPos pos : posList) {
            if(worldIn instanceof ServerLevel server) {
                server.sendParticles(ParticleTypes.END_ROD, pos.getX() + 0.5, pos.getY() + 1.2, pos.getZ() + 0.5, 10, 0, 0, 0, 0.1);
            }
        }
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> stateBuilder) {
        stateBuilder.add(FOUNTAIN, WATERLOGGED);
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter getter, BlockPos pos, CollisionContext context) {
        if(state.getValue(FOUNTAIN) == 2) {
            return BOTTOM_AABB;
        }
        return DEFAULT_SHAPE;
    }

    @Override
    public FluidState getFluidState(BlockState state) {
        return (Boolean)state.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(state);
    }

    @Override
    public boolean canPlaceLiquid(BlockGetter getter, BlockPos pos, BlockState state, Fluid fluid) {
        if(!(state.getValue(FOUNTAIN) == 2)) {
            return false;
        }
        return SimpleWaterloggedBlock.super.canPlaceLiquid(getter, pos, state, fluid);
    }

    @Override
    public ItemStack pickupBlock(LevelAccessor accessor, BlockPos pos, BlockState state) {
        if(state.getValue(FOUNTAIN) == 2) {
            return new ItemStack(Items.WATER_BUCKET);
        }
        return ItemStack.EMPTY;
    }

    @Override
    public RenderShape getRenderShape(BlockState state) {
        return RenderShape.ENTITYBLOCK_ANIMATED;
    }

    @Override
    public void updateEntityAfterFallOn(BlockGetter worldIn, Entity entity) {
        super.updateEntityAfterFallOn(worldIn, entity);
    }
}
