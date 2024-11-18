package net.bon.soulfulnether.block.custom;

import net.bon.soulfulnether.block.SoulfulBlocks;
import net.minecraft.block.*;

public class SpiralingVinesBlock extends TwistingVinesBlock {
    public SpiralingVinesBlock(Settings settings) {
        super(settings);
    }
    protected Block getPlant() {
        return SoulfulBlocks.SPIRALING_VINES_PLANT;
    }
    protected boolean chooseStemState(BlockState state) {
        return VineLogic.isValidForWeepingStem(state);
    }
}
