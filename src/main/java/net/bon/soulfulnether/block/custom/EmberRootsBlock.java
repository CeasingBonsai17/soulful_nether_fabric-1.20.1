package net.bon.soulfulnether.block.custom;

import net.bon.soulfulnether.util.SoulfulBlockTags;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.RootsBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

public class EmberRootsBlock extends RootsBlock {
    public EmberRootsBlock(Settings settings) {
        super(settings);
    }
    protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        return floor.isOf(Blocks.BASALT) || floor.isIn(SoulfulBlockTags.VALID_ROOT_BASES) || super.canPlantOnTop(floor, world, pos);
    }
}
