package net.bon.soulfulnether.block;

import net.bon.soulfulnether.SoulfulNether;
import net.fabricmc.fabric.api.object.builder.v1.block.type.WoodTypeBuilder;
import net.minecraft.block.WoodType;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;

public class SoulfulWoodType {
    public static final WoodType FRIGHT = new WoodTypeBuilder().soundGroup(BlockSoundGroup.NETHER_WOOD).hangingSignSoundGroup(BlockSoundGroup.NETHER_WOOD_HANGING_SIGN).fenceGateCloseSound(SoundEvents.BLOCK_NETHER_WOOD_FENCE_GATE_CLOSE).fenceGateOpenSound(SoundEvents.BLOCK_NETHER_WOOD_FENCE_GATE_OPEN).register(new Identifier(SoulfulNether.MOD_ID, "fright"), SoulfulBlockSetType.FRIGHT);
    public static void registerWoodType() {
        SoulfulNether.LOGGER.debug("Registering WoodType for " + SoulfulNether.MOD_ID);
    }
}