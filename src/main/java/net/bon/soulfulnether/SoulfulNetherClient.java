package net.bon.soulfulnether;

import net.bon.soulfulnether.block.SoulfulBlocks;
import net.bon.soulfulnether.item.SoulfulItems;
import net.bon.soulfulnether.particle.SoulfulParticleTypes;
import net.bon.soulfulnether.particle.SoulfulSuspendParticle;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.fabricmc.fabric.api.registry.CompostingChanceRegistry;
import net.minecraft.client.render.RenderLayer;

public class SoulfulNetherClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {


        BlockRenderLayerMap.INSTANCE.putBlock(SoulfulBlocks.FRIGHT_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SoulfulBlocks.FRIGHT_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SoulfulBlocks.FRIGHT_FUNGUS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SoulfulBlocks.HANGING_LICHOSS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SoulfulBlocks.HANGING_LICHOSS_PLANT, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SoulfulBlocks.EMBER_ROOTS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SoulfulBlocks.FRIGHT_ROOTS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SoulfulBlocks.POTTED_FRIGHT_FUNGUS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SoulfulBlocks.POTTED_EMBER_ROOTS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SoulfulBlocks.POTTED_FRIGHT_ROOTS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SoulfulBlocks.SPIRALING_VINES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SoulfulBlocks.SPIRALING_VINES_PLANT, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SoulfulBlocks.SOULROOTS, RenderLayer.getCutout());

        ParticleFactoryRegistry.getInstance().register(SoulfulParticleTypes.FRIGHT_SPORE, SoulfulSuspendParticle.FrightSporeFactory::new);
        ParticleFactoryRegistry.getInstance().register(SoulfulParticleTypes.FRIGHT_EMBER, SoulfulSuspendParticle.FrightEmberFactory::new);
    }


}