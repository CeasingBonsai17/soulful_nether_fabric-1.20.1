package net.bon.soulfulnether.worldgen.feature.custom;

import com.mojang.serialization.Codec;
import net.bon.soulfulnether.block.SoulfulBlocks;
import net.bon.soulfulnether.block.custom.EmberRootsBlock;
import net.minecraft.block.AbstractPlantStemBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.StructureWorldAccess;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.gen.feature.DefaultFeatureConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.util.FeatureContext;

public class HangingEmberRootsFeature  extends Feature<DefaultFeatureConfig> {
    private static final Direction[] DIRECTIONS = Direction.values();

    public HangingEmberRootsFeature(Codec<DefaultFeatureConfig> codec) {
        super(codec);
    }

    public boolean generate(FeatureContext<DefaultFeatureConfig> context) {
        StructureWorldAccess structureWorldAccess = context.getWorld();
        BlockPos blockPos = context.getOrigin();
        Random random = context.getRandom();
        if (!structureWorldAccess.isAir(blockPos)) {
            return true;
        } else {
            BlockState blockState = structureWorldAccess.getBlockState(blockPos.up());
            if (!blockState.isOf(SoulfulBlocks.FRIGHT_WART_BLOCK)) {
                return false;
            } else {
                this.generateNetherWartBlocksInArea(structureWorldAccess, random, blockPos);
                return true;
            }
        }
    }

    private void generateNetherWartBlocksInArea(WorldAccess world, Random random, BlockPos pos) {
        world.setBlockState(pos, SoulfulBlocks.EMBER_ROOTS.getDefaultState().with(Properties.HANGING, true), 2);
        BlockPos.Mutable mutable = new BlockPos.Mutable();
        BlockPos.Mutable mutable2 = new BlockPos.Mutable();

        for(int i = 0; i < 200; ++i) {
            mutable.set(pos, random.nextInt(6) - random.nextInt(6), random.nextInt(2) - random.nextInt(5), random.nextInt(6) - random.nextInt(6));
            if (world.isAir(mutable)) {
                int j = 0;
                Direction[] var8 = DIRECTIONS;
                int var9 = var8.length;

                for(int var10 = 0; var10 < var9; ++var10) {
                    Direction direction = var8[var10];
                    BlockState blockState = world.getBlockState(mutable2.set(mutable, direction));
                    if (blockState.isOf(SoulfulBlocks.FRIGHT_WART_BLOCK)) {
                        ++j;
                    }

                    if (j > 1) {
                        break;
                    }
                }

                if (j == 1) {
                    world.setBlockState(mutable, SoulfulBlocks.EMBER_ROOTS.getDefaultState().with(Properties.HANGING, true), 2);
                }
            }
        }
    }
}
