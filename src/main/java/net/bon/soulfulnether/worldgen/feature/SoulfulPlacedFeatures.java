package net.bon.soulfulnether.worldgen.feature;

import net.bon.soulfulnether.SoulfulNether;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.PlacedFeature;

public class SoulfulPlacedFeatures {

    public static final RegistryKey<PlacedFeature> FRIGHT_FUNGUS = registerKey("fright_forest/fright_fungus");
    public static final RegistryKey<PlacedFeature> LICHOSS_PATCH = registerKey("fright_forest/lichoss_patch");
    public static final RegistryKey<PlacedFeature> SPIRALING_VINES = registerKey("fright_forest/spiraling_vines");
    public static final RegistryKey<PlacedFeature> FRIGHT_FOREST_VEGETATION = registerKey("fright_forest/fright_forest_vegetation");
    public static final RegistryKey<PlacedFeature> SOUL_FIRE_PATCH_LICHOSS = registerKey("fright_forest/patch_soul_fire_lichoss");
    public static final RegistryKey<PlacedFeature> BASALT_ROCK = registerKey("fright_forest/basalt_rock");



    public static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(SoulfulNether.MOD_ID, name));
    }
}
