package net.bon.soulfulnether.worldgen.feature;

import net.bon.soulfulnether.SoulfulNether;
import net.minecraft.registry.*;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.*;

public class SoulfulConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> FRIGHT_FUNGUS_PLANTED = registerKey("fright_forest/fright_fungus_planted");
    public static final RegistryKey<ConfiguredFeature<?, ?>> LICHOSS_PATCH_BONE_MEAL = registerKey("fright_forest/lichoss_patch_bone_meal");
    public static final RegistryKey<ConfiguredFeature<?, ?>> LICHOSS_PATCH_CEILING = registerKey("fright_forest/lichoss_patch_ceiling");
    public static final RegistryKey<ConfiguredFeature<?, ?>> LICHOSS_PATCH_CEILING_BONE_MEAL = registerKey("fright_forest/lichoss_patch_ceiling_bone_meal");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ASHEN_SNOW_LAYERS = registerKey("ashen_deltas/ashen_snow_layers");
    public static final RegistryKey<ConfiguredFeature<?, ?>> HUGE_GLOOM_FUNGUS = registerKey("gloom_forest/huge_gloom_fungus");
    public static final RegistryKey<ConfiguredFeature<?, ?>> LARGE_GLOOM_FUNGUS = registerKey("gloom_forest/large_gloom_fungus");


    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(SoulfulNether.MOD_ID, name));
    }
}