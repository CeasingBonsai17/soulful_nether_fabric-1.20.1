package net.bon.soulfulnether.particle;

import net.bon.soulfulnether.SoulfulNether;
import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class SoulfulParticleTypes {
    public static final DefaultParticleType FRIGHT_EMBER = FabricParticleTypes.simple();
    public static final DefaultParticleType FRIGHT_SPORE = FabricParticleTypes.simple();

    public static void registerSoulfulParticles() {
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(SoulfulNether.MOD_ID, "fright_ember"),
                FRIGHT_EMBER);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(SoulfulNether.MOD_ID, "fright_spore"),
                FRIGHT_SPORE);
    }
}