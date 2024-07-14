package io.github.poisonsheep.wishingfountain.item;

import io.github.poisonsheep.wishingfountain.tileentity.WFEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.BlockParticleOption;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.entity.BlockEntity;
import org.jetbrains.annotations.Nullable;

import java.util.List;

abstract class ModelChangedItem extends Item {

    int textureIndex;

    public ModelChangedItem() {
        super(new Item.Properties().stacksTo(1));
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {
        BlockPos blockPos = context.getClickedPos();
        Player player = context.getPlayer();
        Level worldIn = context.getLevel();
        if (context.getHand() == InteractionHand.MAIN_HAND && worldIn.getBlockEntity(blockPos) instanceof WFEntity wfEntity) {
            if(worldIn instanceof ServerLevel server) {
                List<BlockPos> list = wfEntity.getBlockPosList().getData();
                if(wfEntity.getTextureIndex() != this.textureIndex) {
                    for (BlockPos pos : list) {
                        BlockEntity te = server.getBlockEntity(pos);
                        if(te instanceof WFEntity wfEntity1) {
                            setTextureIndex(wfEntity1);
                        }
                        spawnParticles(server, pos);
                    }
                    if (player != null) {
                        playSound(server, player.getOnPos());
                    }
                    if(!player.isCreative()) {
                        ItemStack stack = context.getItemInHand();
                        stack.shrink(1);
                    }
                    if(player instanceof ServerPlayer serverPlayer) {
                        triggerAdvancement(serverPlayer);
                    }
                    return InteractionResult.SUCCESS;
                }
            }
        }
        return super.useOn(context);
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level worldIn, List<Component> list, TooltipFlag flag) {
        list.add(Component.translatable("wishing_fountain.misc." + this + "_description"));
    }

    protected void setTextureIndex(WFEntity entity) {
        entity.setTextureIndex(this.textureIndex);
    }

    protected void playSound(ServerLevel worldIn, BlockPos pos) {
        worldIn.playSound(null, pos, SoundEvents.STONE_BREAK, SoundSource.BLOCKS, 1.0F, 1.0F);
    }

    protected void spawnParticles(ServerLevel worldIn, BlockPos pos) {
        worldIn.sendParticles(new BlockParticleOption(ParticleTypes.BLOCK, Blocks.QUARTZ_BLOCK.defaultBlockState()), pos.getX() + 0.5, pos.getY() + 1, pos.getZ() + 0.5, 20, 0.5D, 0.5D, 0.5D, 0.0D);
    }

    public abstract void triggerAdvancement(ServerPlayer serverPlayer);
}
