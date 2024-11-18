package net.bon.soulfulnether.worldgen.feature;

import net.bon.soulfulnether.SoulfulNether;
import net.bon.soulfulnether.worldgen.feature.custom.SpiralingVinesFeature;
import net.bon.soulfulnether.worldgen.feature.custom.SpiralingVinesFeatureConfig;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.*;

public class SoulfulFeature {

    public static Feature<SpiralingVinesFeatureConfig> SPIRALING_VINES = registerFeature("spiraling_vines",
            new SpiralingVinesFeature(SpiralingVinesFeatureConfig.CODEC));


    public static <C extends FeatureConfig, F extends Feature<C>> F registerFeature(String name, F feature) {
        return Registry.register(Registries.FEATURE, new Identifier(SoulfulNether.MOD_ID, name), feature);
    }

    public static void registerSoulfulFeatures() {
        SoulfulNether.LOGGER.info("Registering Features for " + SoulfulNether.MOD_ID);
    }
}
