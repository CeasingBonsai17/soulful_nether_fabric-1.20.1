package net.bon.soulfulnether.particle;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.particle.*;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.particle.DefaultParticleType;

public class SoulfulSuspendParticle extends SpriteBillboardParticle {
    SoulfulSuspendParticle(ClientWorld world, SpriteProvider spriteProvider, double x, double y, double z) {
        super(world, x, y - 0.125, z);
        this.setBoundingBoxSpacing(0.01F, 0.01F);
        this.setSprite(spriteProvider);
        this.scale *= this.random.nextFloat() * 0.6F + 0.2F;
        this.maxAge = (int) (16.0 / (Math.random() * 0.8 + 0.2));
        this.collidesWithWorld = false;
        this.velocityMultiplier = 1.0F;
        this.gravityStrength = 0.0F;
    }

    SoulfulSuspendParticle(ClientWorld world, SpriteProvider spriteProvider, double x, double y, double z, double velocityX, double velocityY, double velocityZ) {
        super(world, x, y - 0.125, z, velocityX, velocityY, velocityZ);
        this.setBoundingBoxSpacing(0.01F, 0.01F);
        this.setSprite(spriteProvider);
        this.scale *= this.random.nextFloat() * 0.6F + 0.6F;
        this.maxAge = (int) (16.0 / (Math.random() * 0.8 + 0.2));
        this.collidesWithWorld = false;
        this.velocityMultiplier = 1.0F;
        this.gravityStrength = 0.0F;
    }

    public ParticleTextureSheet getType() {
        return ParticleTextureSheet.PARTICLE_SHEET_OPAQUE;
    }

    @Environment(EnvType.CLIENT)
    public static class FrightEmberFactory implements ParticleFactory<DefaultParticleType> {
        private final SpriteProvider spriteProvider;

        public FrightEmberFactory(SpriteProvider spriteProvider) {
            this.spriteProvider = spriteProvider;
        }

        public Particle createParticle(DefaultParticleType defaultParticleType, ClientWorld clientWorld, double d, double e, double f, double g, double h, double i) {
            double j = (double) clientWorld.random.nextFloat() * -1.9 * (double) clientWorld.random.nextFloat() * 0.1;
            SoulfulSuspendParticle SoulfulSuspendParticle = new SoulfulSuspendParticle(clientWorld, this.spriteProvider, d, e, f, 0.0, j, 0.0);
            SoulfulSuspendParticle.setColor(0.0F, 1.0F, 1.9F);
            SoulfulSuspendParticle.setBoundingBoxSpacing(0.001F, 0.001F);
            return SoulfulSuspendParticle;
        }
    }
    public static class FrightSporeFactory implements ParticleFactory<DefaultParticleType> {
        private final SpriteProvider spriteProvider;

        public FrightSporeFactory(SpriteProvider spriteProvider) {
            this.spriteProvider = spriteProvider;
        }

        public Particle createParticle(DefaultParticleType defaultParticleType, ClientWorld clientWorld, double d, double e, double f, double g, double h, double i) {
            double j = (double) clientWorld.random.nextFloat() * -1.9 * (double) clientWorld.random.nextFloat() * 0.1;
            SoulfulSuspendParticle SoulfulSuspendParticle = new SoulfulSuspendParticle(clientWorld, this.spriteProvider, d, e, f, 0.0, j, 0.0);
            SoulfulSuspendParticle.setColor(0.5F, 0.6F, 1.0F);
            SoulfulSuspendParticle.setBoundingBoxSpacing(0.001F, 0.001F);
            return SoulfulSuspendParticle;
        }
    }
}
