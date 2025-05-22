package net.bon.soulfulnether.block.type;

import net.bon.soulfulnether.worldgen.feature.SoulfulConfiguredFeatures;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Fertilizable;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;
import net.minecraft.world.gen.feature.ConfiguredFeature;

public class LichossBlock extends Block implements Fertilizable {
    public LichossBlock(AbstractBlock.Settings settings) {
        super(settings);
    }

    public boolean isFertilizable(WorldView world, BlockPos pos, BlockState state, boolean isClient) {
        return world.getBlockState(pos.up()).isAir() || world.getBlockState(pos.down()).isAir();
    }

    public boolean canGrow(World world, Random random, BlockPos pos, BlockState state) {
        return true;
    }

    public void grow(ServerWorld world, Random source, BlockPos pos, BlockState state) {
        world.getRegistryManager().getOptional(RegistryKeys.CONFIGURED_FEATURE).flatMap((registry) -> {
            return registry.getEntry(SoulfulConfiguredFeatures.LICHOSS_PATCH_BONE_MEAL);

        }).ifPresent((reference) -> {
            ((ConfiguredFeature)reference.value()).generate(world, world.getChunkManager().getChunkGenerator(), source, pos.up());
        });
        world.getRegistryManager().getOptional(RegistryKeys.CONFIGURED_FEATURE).flatMap((registry) -> {
            return registry.getEntry(SoulfulConfiguredFeatures.LICHOSS_PATCH_CEILING);

        }).ifPresent((reference) -> {
            ((ConfiguredFeature)reference.value()).generate(world, world.getChunkManager().getChunkGenerator(), source, pos.up());
        });
        world.getRegistryManager().getOptional(RegistryKeys.CONFIGURED_FEATURE).flatMap((registry) -> {
            return registry.getEntry(SoulfulConfiguredFeatures.LICHOSS_PATCH_CEILING_BONE_MEAL);

        }).ifPresent((reference) -> {
            ((ConfiguredFeature)reference.value()).generate(world, world.getChunkManager().getChunkGenerator(), source, pos.up());
        });
    }
}
