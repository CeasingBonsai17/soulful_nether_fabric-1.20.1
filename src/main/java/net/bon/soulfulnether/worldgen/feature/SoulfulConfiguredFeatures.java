package net.bon.soulfulnether.worldgen.feature;

import net.bon.soulfulnether.SoulfulNether;
import net.minecraft.registry.*;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.*;

public class SoulfulConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> FRIGHT_FUNGUS_PLANTED = registerKey("fright_forest/fright_fungus_planted");
    public static final RegistryKey<ConfiguredFeature<?, ?>> FRIGHT_FUNGUS = registerKey("fright_forest/fright_fungus");
    public static final RegistryKey<ConfiguredFeature<?, ?>> LICHOSS_PATCH_BONEMEAL = registerKey("fright_forest/lichoss_patch_bonemeal");
    public static final RegistryKey<ConfiguredFeature<?, ?>> LICHOSS_PATCH = registerKey("fright_forest/lichoss_patch");
    public static final RegistryKey<ConfiguredFeature<?, ?>> SPIRALING_VINES = registerKey("fright_forest/spiraling_vines");
    public static final RegistryKey<ConfiguredFeature<?, ?>> FRIGHT_FUNGUS_VEGETATION = registerKey("fright_forest/fright_fungus_vegetation");
    public static final RegistryKey<ConfiguredFeature<?, ?>> HANGING_EMBER_ROOTS = registerKey("fright_forest/hanging_hanging_ember_roots");
    public static final RegistryKey<ConfiguredFeature<?, ?>> BASALT_VEGETATION = registerKey("fright_forest/basalt_vegetation");
    public static final RegistryKey<ConfiguredFeature<?, ?>> SOUL_FIRE_PATCH_LICHOSS = registerKey("fright_forest/patch_soul_fire_lichoss");
    public static final RegistryKey<ConfiguredFeature<?, ?>> BASALT_ROCK = registerKey("fright_forest/basalt_rock");



    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(SoulfulNether.MOD_ID, name));
    }
}