package io.github.poisonsheep.wishingfountain.block.multiblock;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;

import java.util.List;

public interface IMultiBlock {

    boolean isCoreBlock(BlockState blockState);

    boolean isMatch(Level world, BlockPos posStart, StructureTemplate template);

    void build(Level worldIn, BlockPos posStart, StructureTemplate template, Direction direction);

    List<BlockPos> getBottomPos();

    StructureTemplate getTemplateStructure(ServerLevel world);

    StructureTemplate getTemplateTarget(ServerLevel world);
}
