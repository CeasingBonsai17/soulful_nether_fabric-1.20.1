package net.bon.soulfulnether.block.type;

import net.bon.soulfulnether.block.SoulfulBlocks;
import net.bon.soulfulnether.util.SoulfulBlockTags;
import net.minecraft.block.BlockState;
import net.minecraft.block.RootsBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

public class FrightRootsBlock extends RootsBlock {
    public FrightRootsBlock(Settings settings) {
        super(settings);
    }
    protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        return floor.isOf(SoulfulBlocks.FRIGHT_WART_BLOCK) || floor.isIn(SoulfulBlockTags.VALID_ROOT_BASES) || super.canPlantOnTop(floor, world, pos);
    }
}
