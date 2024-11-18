package net.bon.soulfulnether.worldgen;

import net.bon.soulfulnether.SoulfulNether;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.world.biome.Biome;

public class SoulfulBiomes {
    public static final RegistryKey<Biome> FRIGHT_FOREST = RegistryKey.of(RegistryKeys.BIOME, SoulfulNether.id("fright_forest"));
}
