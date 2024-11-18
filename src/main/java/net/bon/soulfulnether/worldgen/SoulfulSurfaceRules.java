package net.bon.soulfulnether.worldgen;

import net.minecraft.block.Blocks;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.noise.NoiseParametersKeys;
import net.minecraft.world.gen.surfacebuilder.MaterialRules;

public class SoulfulSurfaceRules {

    private static final MaterialRules.MaterialRule BEDROCK = MaterialRules.block(Blocks.BEDROCK.getDefaultState());
    private static final MaterialRules.MaterialRule NETHERRACK = MaterialRules.block(Blocks.NETHERRACK.getDefaultState());
    private static final MaterialRules.MaterialRule SOUL_SAND = MaterialRules.block(Blocks.SOUL_SAND.getDefaultState());
    private static final MaterialRules.MaterialRule SOUL_SOIL = MaterialRules.block(Blocks.SOUL_SOIL.getDefaultState());
    private static final MaterialRules.MaterialRule GRAVEL = MaterialRules.block(Blocks.GRAVEL.getDefaultState());

    public static MaterialRules.MaterialRule registerSoulfulSurfaceRules() {
        return MaterialRules.sequence(
                MaterialRules.condition(MaterialRules.verticalGradient("bedrock_floor", YOffset.getBottom(), YOffset.aboveBottom(5)), BEDROCK),
                MaterialRules.condition(MaterialRules.not(MaterialRules.verticalGradient("bedrock_roof", YOffset.belowTop(5), YOffset.getTop())), MaterialRules.condition(MaterialRules.aboveY(YOffset.belowTop(5), 0), BEDROCK)),
                // Fright Forest
                MaterialRules.condition(MaterialRules.biome(SoulfulBiomes.FRIGHT_FOREST), MaterialRules.sequence(
                        MaterialRules.condition(MaterialRules.STONE_DEPTH_CEILING_WITH_SURFACE_DEPTH, MaterialRules.sequence(
                                MaterialRules.condition(MaterialRules.noiseThreshold(NoiseParametersKeys.NETHER_STATE_SELECTOR, 0, 1.7976931348623157e+308), SOUL_SAND),
                                SOUL_SOIL)
                        ),
                        MaterialRules.condition(MaterialRules.STONE_DEPTH_FLOOR_WITH_SURFACE_DEPTH, MaterialRules.sequence(
                                MaterialRules.condition(MaterialRules.noiseThreshold(NoiseParametersKeys.PATCH, -0.012, 1.7976931348623157e+30),
                                        MaterialRules.condition(MaterialRules.aboveYWithStoneDepth(YOffset.fixed(30), 0),
                                                MaterialRules.condition(MaterialRules.not(MaterialRules.aboveYWithStoneDepth(YOffset.fixed(35), 0)), GRAVEL))),
                                MaterialRules.condition(MaterialRules.noiseThreshold(NoiseParametersKeys.NETHER_STATE_SELECTOR, 0, 1.7976931348623157e+308), SOUL_SAND),
                                SOUL_SOIL)
                        ))
                ),
                NETHERRACK
        );
    }
}
