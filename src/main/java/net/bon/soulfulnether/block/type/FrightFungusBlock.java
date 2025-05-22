package net.bon.soulfulnether.block.type;

import net.bon.soulfulnether.block.SoulfulBlocks;
import net.bon.soulfulnether.util.SoulfulBlockTags;
import net.bon.soulfulnether.worldgen.feature.SoulfulConfiguredFeatures;
import net.minecraft.block.*;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldView;
import net.minecraft.world.gen.feature.ConfiguredFeature;

public class FrightFungusBlock extends FungusBlock implements Fertilizable {
    public FrightFungusBlock(RegistryKey<ConfiguredFeature<?, ?>> feature, Settings settings, Block requiredBlock) {
        super(settings,feature,  requiredBlock);
    }

    protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        return floor.isIn(BlockTags.NYLIUM) || floor.isOf(SoulfulBlocks.LICHOSS_BLOCK) || floor.isOf(Blocks.MYCELIUM) || floor.isOf(Blocks.SOUL_SOIL) || super.canPlantOnTop(floor, world, pos);
    }
    public boolean isFertilizable(WorldView world, BlockPos pos, BlockState state, boolean isClient) {
        BlockState blockState = world.getBlockState(pos.down());
        return state.isOf(Blocks.SOUL_SOIL) || state.isOf(SoulfulBlocks.LICHOSS_BLOCK);
    }

    public void grow(ServerWorld level, Random source, BlockPos pos, BlockState state) {
        level.getRegistryManager().getOptional(RegistryKeys.CONFIGURED_FEATURE).flatMap((registry) -> {
            return registry.getEntry(SoulfulConfiguredFeatures.FRIGHT_FUNGUS_PLANTED);

        }).ifPresent((reference) -> {
            ((ConfiguredFeature)reference.value()).generate(level, level.getChunkManager().getChunkGenerator(), source, pos.up());
        });
    }
}
