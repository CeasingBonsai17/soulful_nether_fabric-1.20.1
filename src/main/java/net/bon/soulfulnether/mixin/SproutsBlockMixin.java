package net.bon.soulfulnether.mixin;

import net.bon.soulfulnether.block.SoulfulBlocks;
import net.bon.soulfulnether.util.SoulfulBlockTags;
import net.minecraft.block.BlockState;
import net.minecraft.block.SproutsBlock;
import net.minecraft.util.math.BlockPos;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(SproutsBlock.class)
public class SproutsBlockMixin {

    @Inject(
            method = "canPlantOnTop",
            at = @At(value = "TAIL"),
            cancellable = true
    )
    private void soulfulnether$changeCanPlantOnTop(BlockState floor, net.minecraft.world.BlockView world, BlockPos pos, CallbackInfoReturnable<Boolean> cir) {
        if (floor.isOf(SoulfulBlocks.LICHOSS_BLOCK)) {
            cir.setReturnValue(true);
        }
    }
}
