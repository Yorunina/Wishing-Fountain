package io.github.poisonsheep.wishingfountain.tileentity;

import io.github.poisonsheep.wishingfountain.registry.BlockRegistry;
import io.github.poisonsheep.wishingfountain.util.PosListData;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.Tag;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.AABB;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;

public class WishingFountainEntity extends BlockEntity {

    public static final BlockEntityType<WishingFountainEntity> TYPE = BlockEntityType.Builder.of(WishingFountainEntity::new, BlockRegistry.WISHING_FOUNTAIN.get()).build(null);
    private PosListData blockPosList = new PosListData();
    private BlockState storageState = Blocks.AIR.defaultBlockState();
    private static final String STORAGE_STATE_ID = "StorageBlockStateId";
    private static final String STORAGE_BLOCK_LIST = "StorageBlockList";

    private static final String IS_RENDER = "IsRender";

    private boolean isRender = false;

    public WishingFountainEntity(BlockPos pos, BlockState state) {
        super(TYPE, pos, state);

    }

    public BlockState getStorageState() {
        return storageState;
    }
    public PosListData getBlockPosList() {
        return blockPosList;
    }

    public void setForgeData(Boolean isRender, BlockState storageState, PosListData blockPosList) {
        this.isRender = isRender;
        this.storageState = storageState;
        this.blockPosList = blockPosList;
        refresh();
    }

    @Override
    public void saveAdditional(CompoundTag compound) {
        getPersistentData().putBoolean(IS_RENDER, isRender);
        getPersistentData().putInt(STORAGE_STATE_ID, Block.getId(storageState));
        getPersistentData().put(STORAGE_BLOCK_LIST, blockPosList.serialize());
        super.saveAdditional(compound);
    }

    @Override
    public void load(CompoundTag nbt) {
        super.load(nbt);
        isRender = getPersistentData().getBoolean(IS_RENDER);
        storageState = Block.stateById(getPersistentData().getInt(STORAGE_STATE_ID));
        blockPosList.deserialize(getPersistentData().getList(STORAGE_BLOCK_LIST, Tag.TAG_COMPOUND));
    }

    public void refresh() {
        this.setChanged();
        if(level != null) {
            BlockState state = level.getBlockState(worldPosition);
            level.sendBlockUpdated(worldPosition, state, state, Block.UPDATE_ALL);
        }
    }
    public boolean isRender() {
        return isRender;
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public AABB getRenderBoundingBox() {
        return new AABB(worldPosition.offset(-9, -5, -9), worldPosition.offset(9, 5, 9));
    }
    @Override
    public CompoundTag getUpdateTag() {
        return saveWithoutMetadata();
    }

    @Nullable
    @Override
    public Packet<ClientGamePacketListener> getUpdatePacket() {
        return ClientboundBlockEntityDataPacket.create(this);
    }
}
