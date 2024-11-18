package net.bon.soulfulnether.mixin;


import net.bon.soulfulnether.block.SoulfulBlocks;
import net.bon.soulfulnether.util.SoulfulBlockTags;
import net.minecraft.block.BeetrootsBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.CropBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;

@SuppressWarnings("deprecation")

@Mixin(BeetrootsBlock.class)
public class BeetrootBlockMixin extends CropBlock {

    public BeetrootBlockMixin(Settings settings) {
        super(settings);
    }

    @Override
    protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        if (this == Blocks.BEETROOTS && floor.isIn(SoulfulBlockTags.SOUL_CONVERTING_BLOCKS)) {
            return true;
        }
        return super.canPlantOnTop(floor, world, pos);
    }

    @Override
    public void onBlockAdded(BlockState state, World world, BlockPos pos, BlockState oldState, boolean notify) {
        BlockState floor = world.getBlockState(pos.down());
        if (state.isOf(Blocks.BEETROOTS) && floor.isIn(SoulfulBlockTags.SOUL_CONVERTING_BLOCKS)) {
            world.setBlockState(pos, SoulfulBlocks.SOULROOTS.getDefaultState(), NOTIFY_ALL);
        }
    }
}