package net.bon.soulfulnether.block.sapling;

import net.bon.soulfulnether.worldgen.feature.SoulfulConfiguredFeatures;
import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.gen.feature.ConfiguredFeature;

public class HugeFrightFungusGenerator extends SaplingGenerator {
    public HugeFrightFungusGenerator() {
    }
    protected RegistryKey<ConfiguredFeature<?, ?>> getTreeFeature(Random random, boolean bees) {
        return SoulfulConfiguredFeatures.FRIGHT_FUNGUS_PLANTED;
    }
}