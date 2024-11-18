package net.bon.soulfulnether.block;

import net.bon.soulfulnether.SoulfulNether;
import net.fabricmc.fabric.api.object.builder.v1.block.type.BlockSetTypeBuilder;
import net.minecraft.block.BlockSetType;
import net.minecraft.util.Identifier;

public class SoulfulBlockSetType {

    public static final BlockSetType FRIGHT = new BlockSetTypeBuilder().register(new Identifier(SoulfulNether.MOD_ID, "fright"));
    public static void registerBlockSetType() {
        SoulfulNether.LOGGER.debug("Registering BlockSetType for " + SoulfulNether.MOD_ID);
    }
}
