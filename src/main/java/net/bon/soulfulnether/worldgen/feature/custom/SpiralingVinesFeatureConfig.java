package net.bon.soulfulnether.worldgen.feature.custom;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.util.dynamic.Codecs;
import net.minecraft.world.gen.feature.FeatureConfig;

public record SpiralingVinesFeatureConfig(int spreadWidth, int spreadHeight, int maxHeight) implements FeatureConfig {
    public static final Codec<net.bon.soulfulnether.worldgen.feature.custom.SpiralingVinesFeatureConfig> CODEC = RecordCodecBuilder.create((instance) -> {
        return instance.group(Codecs.POSITIVE_INT.fieldOf("spread_width").forGetter(net.bon.soulfulnether.worldgen.feature.custom.SpiralingVinesFeatureConfig::spreadWidth), Codecs.POSITIVE_INT.fieldOf("spread_height").forGetter(net.bon.soulfulnether.worldgen.feature.custom.SpiralingVinesFeatureConfig::spreadHeight), Codecs.POSITIVE_INT.fieldOf("max_height").forGetter(net.bon.soulfulnether.worldgen.feature.custom.SpiralingVinesFeatureConfig::maxHeight)).apply(instance, net.bon.soulfulnether.worldgen.feature.custom.SpiralingVinesFeatureConfig::new);
    });

    public int spreadWidth() {
        return this.spreadWidth;
    }

    public int spreadHeight() {
        return this.spreadHeight;
    }

    public int maxHeight() {
        return this.maxHeight;
    }
}
