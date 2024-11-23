package net.bon.soulfulnether.block.custom;

import net.bon.soulfulnether.util.SoulfulBlockTags;
import net.minecraft.block.*;
import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldView;

public class FrightFungusBlock extends SaplingBlock implements Fertilizable {
    private final Block nylium;
    public FrightFungusBlock(SaplingGenerator generator, Settings settings, Block nylium) {
        super(generator, settings);
        this.nylium = nylium;
    }

    protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        return floor.isIn(BlockTags.NYLIUM) || floor.isIn(SoulfulBlockTags.LICHOSS) || floor.isOf(Blocks.MYCELIUM) || floor.isOf(Blocks.SOUL_SOIL) || super.canPlantOnTop(floor, world, pos);
    }
    public boolean isFertilizable(WorldView world, BlockPos pos, BlockState state, boolean isClient) {
        BlockState blockState = world.getBlockState(pos.down());
        return blockState.isOf(this.nylium);
    }

}
