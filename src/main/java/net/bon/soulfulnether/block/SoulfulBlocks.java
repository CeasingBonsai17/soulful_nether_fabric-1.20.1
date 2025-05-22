package net.bon.soulfulnether.block;

import net.bon.soulfulnether.SoulfulNether;
import net.bon.soulfulnether.block.type.*;
import net.bon.soulfulnether.worldgen.feature.SoulfulConfiguredFeatures;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.block.enums.Instrument;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;

@SuppressWarnings("unused")

public class SoulfulBlocks {

    public static final Block SOULROOTS = registerBlockWithoutItem("soulroots",
            new SoulrootsBlock(FabricBlockSettings.copyOf(Blocks.BEETROOTS).mapColor(MapColor.CYAN).replaceable().noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block SPIRALING_VINES = registerBlock("spiraling_vines",
            new SpiralingVinesBlock(FabricBlockSettings.copyOf(Blocks.TWISTING_VINES).mapColor(MapColor.BLACK).ticksRandomly().noCollision().breakInstantly().sounds(BlockSoundGroup.WEEPING_VINES).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block SPIRALING_VINES_PLANT = registerBlockWithoutItem("spiraling_vines_plant",
            new SpiralingVinesPlantBlock(FabricBlockSettings.copyOf(Blocks.TWISTING_VINES_PLANT).mapColor(MapColor.BLACK).noCollision().breakInstantly().sounds(BlockSoundGroup.WEEPING_VINES).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block FRIGHT_STEM = registerBlock("fright_stem",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.WARPED_STEM).mapColor((state) -> {
                return state.get(PillarBlock.AXIS) == Direction.Axis.Y ? MapColor.LIGHT_BLUE_GRAY : MapColor.BLUE;
            })));
    public static final Block FRIGHT_HYPHAE = registerBlock("fright_hyphae",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.WARPED_HYPHAE).mapColor(MapColor.BLUE)));
    public static final Block STRIPPED_FRIGHT_STEM = registerBlock("stripped_fright_stem",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_WARPED_STEM).mapColor(MapColor.LIGHT_BLUE_GRAY)));
    public static final Block STRIPPED_FRIGHT_HYPHAE = registerBlock("stripped_fright_hyphae",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_WARPED_HYPHAE).mapColor(MapColor.LIGHT_BLUE_GRAY)));
    public static final Block FRIGHT_PLANKS = registerBlock("fright_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.WARPED_PLANKS).mapColor(MapColor.LIGHT_BLUE_GRAY)));
    public static final Block FRIGHT_SLAB = registerBlock("fright_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.WARPED_SLAB).mapColor(MapColor.LIGHT_BLUE_GRAY)));
    public static final Block FRIGHT_STAIRS = registerBlock("fright_stairs",
            new StairsBlock(FRIGHT_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.WARPED_STAIRS).mapColor(MapColor.LIGHT_BLUE_GRAY)));
    public static final Block FRIGHT_FENCE = registerBlock("fright_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.WARPED_FENCE).mapColor(MapColor.LIGHT_BLUE_GRAY)));
    public static final Block FRIGHT_FENCE_GATE = registerBlock("fright_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.WARPED_FENCE_GATE).mapColor(MapColor.LIGHT_BLUE_GRAY),SoulfulWoodType.FRIGHT));
    public static final Block FRIGHT_DOOR = registerBlock("fright_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(FRIGHT_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS).strength(3.0F).nonOpaque().pistonBehavior(PistonBehavior.DESTROY).mapColor(MapColor.LIGHT_BLUE_GRAY), SoulfulBlockSetType.FRIGHT));
    public static final Block FRIGHT_TRAPDOOR = registerBlock("fright_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.create().mapColor(FRIGHT_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS).strength(3.0F).nonOpaque().allowsSpawning(Blocks::never).mapColor(MapColor.LIGHT_BLUE_GRAY), SoulfulBlockSetType.FRIGHT));
    public static final Block FRIGHT_PRESSURE_PLATE = registerBlock("fright_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.WARPED_PRESSURE_PLATE).mapColor(MapColor.LIGHT_BLUE_GRAY),SoulfulBlockSetType.FRIGHT));
    public static final Block FRIGHT_BUTTON = registerBlock("fright_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.WARPED_BUTTON),SoulfulBlockSetType.FRIGHT,25,true));
    public static final Block FRIGHT_SIGN = registerBlockWithoutItem("fright_sign",
            new SignBlock(FabricBlockSettings.create().mapColor(MapColor.LIGHT_BLUE_GRAY).instrument(Instrument.BASS).solid().noCollision().strength(1.0F), SoulfulWoodType.FRIGHT));
    public static final Block FRIGHT_WALL_SIGN = registerBlockWithoutItem("fright_wall_sign",
            new WallSignBlock(FabricBlockSettings.create().mapColor(MapColor.LIGHT_BLUE_GRAY).instrument(Instrument.BASS).solid().noCollision().strength(1.0F), SoulfulWoodType.FRIGHT));
    public static final Block FRIGHT_HANGING_SIGN = registerBlockWithoutItem("fright_hanging_sign",
            new HangingSignBlock(FabricBlockSettings.create().mapColor(MapColor.LIGHT_BLUE_GRAY).instrument(Instrument.BASS).solid().noCollision().strength(1.0F), SoulfulWoodType.FRIGHT));
    public static final Block FRIGHT_WALL_HANGING_SIGN = registerBlockWithoutItem("fright_wall_hanging_sign",
            new WallHangingSignBlock(FabricBlockSettings.create().mapColor(MapColor.LIGHT_BLUE_GRAY).instrument(Instrument.BASS).solid().noCollision().strength(1.0F), SoulfulWoodType.FRIGHT));
    public static final Block LICHOSS_BLOCK = registerBlock("lichoss_block",
            new LichossBlock(FabricBlockSettings.copyOf(Blocks.MOSS_BLOCK).mapColor(MapColor.CYAN)));
    public static final Block HANGING_LICHOSS = registerBlock("hanging_lichoss",
            new HangingLichossBlock(FabricBlockSettings.copyOf(Blocks.WEEPING_VINES).mapColor(MapColor.CYAN).ticksRandomly().noCollision().breakInstantly().sounds(BlockSoundGroup.WEEPING_VINES).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block HANGING_LICHOSS_PLANT = registerBlockWithoutItem("hanging_lichoss_plant",
            new HangingLichossPlantBlock(FabricBlockSettings.copyOf(Blocks.TWISTING_VINES_PLANT).mapColor(MapColor.CYAN).noCollision().breakInstantly().sounds(BlockSoundGroup.WEEPING_VINES).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block LICHOSS_CARPET = registerBlock("lichoss_carpet",
            new LichossCarpetBlock(FabricBlockSettings.create().mapColor(MapColor.CYAN).strength(0.1F).sounds(BlockSoundGroup.MOSS_CARPET).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block EMBER_ROOTS = registerBlock("ember_roots",
            new EmberRootsBlock(FabricBlockSettings.copyOf(Blocks.WARPED_ROOTS).mapColor(MapColor.CYAN).replaceable().noCollision().breakInstantly().sounds(BlockSoundGroup.ROOTS).offset(AbstractBlock.OffsetType.XZ).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block FRIGHT_WART_BLOCK = registerBlock("fright_wart_block",
            new Block(FabricBlockSettings.copyOf(Blocks.WARPED_WART_BLOCK).mapColor(MapColor.BLACK)));
    public static final Block FRIGHT_FUNGUS = registerBlock("fright_fungus",
            new FrightFungusBlock(SoulfulConfiguredFeatures.FRIGHT_FUNGUS_PLANTED, FabricBlockSettings.create().mapColor(MapColor.BLACK).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.FUNGUS).pistonBehavior(PistonBehavior.DESTROY), LICHOSS_BLOCK));
    public static final Block FRIGHT_ROOTS = registerBlock("fright_roots",
            new FrightRootsBlock(FabricBlockSettings.copyOf(Blocks.WARPED_ROOTS).mapColor(MapColor.BLACK).replaceable().noCollision().breakInstantly().sounds(BlockSoundGroup.ROOTS).offset(AbstractBlock.OffsetType.XZ).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block POTTED_FRIGHT_FUNGUS = registerBlockWithoutItem ("potted_fright_fungus",
            new FlowerPotBlock(FRIGHT_FUNGUS, (FabricBlockSettings.create().breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY))));
    public static final Block POTTED_EMBER_ROOTS = registerBlockWithoutItem ("potted_ember_roots",
            new FlowerPotBlock(EMBER_ROOTS, (FabricBlockSettings.create().breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY))));
    public static final Block POTTED_FRIGHT_ROOTS = registerBlockWithoutItem ("potted_fright_roots",
            new FlowerPotBlock(FRIGHT_ROOTS, (FabricBlockSettings.create().breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY))));



    private static Block registerBlockWithoutItem(String name, Block block) {
        return Registry.register(Registries.BLOCK, new Identifier(SoulfulNether.MOD_ID, name), block);
    }
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(SoulfulNether.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, new Identifier(SoulfulNether.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerSoulfulBlocks() {
        SoulfulNether.LOGGER.info("Registering Blocks for " + SoulfulNether.MOD_ID);
    }
}