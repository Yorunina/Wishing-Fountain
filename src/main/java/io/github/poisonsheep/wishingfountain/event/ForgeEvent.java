package io.github.poisonsheep.wishingfountain.event;

import io.github.poisonsheep.wishingfountain.WishingFountain;
import io.github.poisonsheep.wishingfountain.block.multiblock.IMultiBlock;
import io.github.poisonsheep.wishingfountain.block.multiblock.MultiBlockManager;
import io.github.poisonsheep.wishingfountain.registry.AdvancementTriggerRegistry;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.List;

@Mod.EventBusSubscriber(modid = WishingFountain.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ForgeEvent {
    // TickEvent.PlayerTickEvent是服务端和客户端都监听的事件
    @SubscribeEvent
    public void onPlayerTick(TickEvent.PlayerTickEvent event) {
        Player player = event.player;
        Level worldIn = player.level();
        Direction direction = player.getDirection();
        if (!worldIn.isClientSide && event.phase == TickEvent.Phase.END) {
            List<ItemEntity> itemEntityList = worldIn.getEntitiesOfClass(ItemEntity.class, player.getBoundingBox().inflate(32.0F));
            for (ItemEntity itemEntity : itemEntityList) {
                ItemStack itemStack = itemEntity.getItem();
                // 检查物品是否可以用于创建结构
                if (itemStack.getItem() == Items.HEART_OF_THE_SEA) {
                    List<IMultiBlock> multiBlockList = MultiBlockManager.getMultiBlockList();
                    BlockPos pos = itemEntity.blockPosition();
                    BlockState state = worldIn.getBlockState(pos);
                    for (IMultiBlock multiBlock : multiBlockList) {
                        if (multiBlock.isCoreBlock(state)) {
                            //获取结构的初始生成位置
                            for (BlockPos blockPos : multiBlock.getBottomPos()) {
                                BlockPos posStart = pos.subtract(blockPos);
                                StructureTemplate targetTemplate = multiBlock.getTemplateTarget((ServerLevel) worldIn);
                                StructureTemplate structureTemplate = multiBlock.getTemplateStructure((ServerLevel) worldIn);
                                if (multiBlock.isMatch(worldIn, posStart, targetTemplate)) {
                                    multiBlock.build(worldIn, posStart, structureTemplate, direction);
                                    ItemStack stack = itemEntity.getItem();
                                    stack.shrink(1);
                                    itemEntity.setItem(stack);
                                    if (stack.isEmpty()) {
                                        itemEntity.discard();
                                    }
                                    if(player instanceof ServerPlayer serverPlayer){
                                        AdvancementTriggerRegistry.SET_SAIL.trigger(serverPlayer);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
