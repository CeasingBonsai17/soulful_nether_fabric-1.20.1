package net.bon.soulfulnether.block.type;

import net.bon.soulfulnether.block.SoulfulBlocks;
import net.minecraft.block.*;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;

public class SpiralingVinesPlantBlock extends AbstractPlantBlock {
    public static final VoxelShape SHAPE = Block.createCuboidShape(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);
    public SpiralingVinesPlantBlock(AbstractBlock.Settings settings) {
        super(settings, Direction.UP, SHAPE, false);
    }

    protected AbstractPlantStemBlock getStem() {
        return (AbstractPlantStemBlock)SoulfulBlocks.SPIRALING_VINES;
    }
}
