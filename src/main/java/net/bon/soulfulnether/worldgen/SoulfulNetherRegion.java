package net.bon.soulfulnether.worldgen;

import com.mojang.datafixers.util.Pair;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.biome.source.util.MultiNoiseUtil;
import terrablender.api.Region;
import terrablender.api.RegionType;

import java.util.function.Consumer;

public class SoulfulNetherRegion extends Region {
    public SoulfulNetherRegion(Identifier name, int weight) {
        super(name, RegionType.NETHER, weight);
    }

    @Override
    public void addBiomes(Registry<Biome> registry, Consumer<Pair<MultiNoiseUtil.NoiseHypercube, RegistryKey<Biome>>> mapper) {
        this.addBiome(mapper,
                MultiNoiseUtil.ParameterRange.of(-0.4F),
                MultiNoiseUtil.ParameterRange.of(0.0F),
                MultiNoiseUtil.ParameterRange.of(0.0F),
                MultiNoiseUtil.ParameterRange.of(0.0F),
                MultiNoiseUtil.ParameterRange.of(0.0F),
                MultiNoiseUtil.ParameterRange.of(0.0F),
                0.0F, SoulfulBiomes.FRIGHT_FOREST);
    }
}
