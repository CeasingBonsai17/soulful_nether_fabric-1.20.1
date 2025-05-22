package net.bon.soulfulnether.item;

import net.bon.soulfulnether.SoulfulNether;
import net.bon.soulfulnether.block.SoulfulBlocks;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class  SoulfulItems {
    public static final Item SOULROOT_SEEDS = registerItem("soulroot_seeds", new AliasedBlockItem(SoulfulBlocks.SOULROOTS, new FabricItemSettings()));
    public static final Item SOULROOT = registerItem("soulroot", new Item(new FabricItemSettings().food(SoulfulFoodComponents.SOULROOT)));
    public static final Item CHARRED_SOULROOT = registerItem("charred_soulroot", new Item(new FabricItemSettings().food(SoulfulFoodComponents.CHARRED_SOULROOT)));
    public static final Item SOULROOT_PIE = registerItem("soulroot_pie", new Item(new FabricItemSettings().food(SoulfulFoodComponents.SOULROOT_PIE)));
    public static final Item FRIGHT_SIGN = registerItem("fright_sign", new SignItem(new FabricItemSettings().maxCount(16), SoulfulBlocks.FRIGHT_SIGN, SoulfulBlocks.FRIGHT_WALL_SIGN));
    public static final Item FRIGHT_HANGING_SIGN = registerItem("fright_hanging_sign", new HangingSignItem(SoulfulBlocks.FRIGHT_HANGING_SIGN, SoulfulBlocks.FRIGHT_WALL_HANGING_SIGN, (new Item.Settings()).maxCount(16)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(SoulfulNether.MOD_ID, name), item);
    }

    public static void registerSoulfulItems() {
        SoulfulNether.LOGGER.info("Registering Items for " + SoulfulNether.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries ->{
            entries.addAfter(Items.BEETROOT, SOULROOT);
            entries.addAfter(SOULROOT, CHARRED_SOULROOT);
            entries.addAfter(Items.PUMPKIN_PIE, SOULROOT_PIE);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries ->{
            entries.addAfter(Items.BEETROOT_SEEDS, SOULROOT_SEEDS);
            entries.addAfter(Items.CRIMSON_STEM, SoulfulBlocks.FRIGHT_STEM);
            entries.addAfter(Items.NETHER_WART_BLOCK, SoulfulBlocks.FRIGHT_WART_BLOCK);
            entries.addAfter(Items.CRIMSON_FUNGUS, SoulfulBlocks.FRIGHT_FUNGUS);
            entries.addAfter(Items.CRIMSON_ROOTS, SoulfulBlocks.FRIGHT_ROOTS);
            entries.addAfter(Items.WARPED_ROOTS, SoulfulBlocks.EMBER_ROOTS);
            entries.addAfter(Items.WEEPING_VINES, SoulfulBlocks.SPIRALING_VINES);
            entries.addAfter(Items.WARPED_NYLIUM, SoulfulBlocks.LICHOSS_BLOCK);
            entries.addAfter(SoulfulBlocks.LICHOSS_BLOCK, SoulfulBlocks.LICHOSS_CARPET);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries ->{
            entries.addAfter(Items.CRIMSON_BUTTON, SoulfulBlocks.FRIGHT_STEM);
            entries.addAfter(SoulfulBlocks.FRIGHT_STEM, SoulfulBlocks.FRIGHT_HYPHAE);
            entries.addAfter(SoulfulBlocks.FRIGHT_HYPHAE, SoulfulBlocks.STRIPPED_FRIGHT_STEM);
            entries.addAfter(SoulfulBlocks.STRIPPED_FRIGHT_STEM, SoulfulBlocks.STRIPPED_FRIGHT_HYPHAE);
            entries.addAfter(SoulfulBlocks.STRIPPED_FRIGHT_HYPHAE, SoulfulBlocks.FRIGHT_PLANKS);
            entries.addAfter(SoulfulBlocks.FRIGHT_PLANKS, SoulfulBlocks.FRIGHT_STAIRS);
            entries.addAfter(SoulfulBlocks.FRIGHT_STAIRS, SoulfulBlocks.FRIGHT_SLAB);
            entries.addAfter(SoulfulBlocks.FRIGHT_SLAB, SoulfulBlocks.FRIGHT_FENCE);
            entries.addAfter(SoulfulBlocks.FRIGHT_FENCE, SoulfulBlocks.FRIGHT_FENCE_GATE);
            entries.addAfter(SoulfulBlocks.FRIGHT_FENCE_GATE, SoulfulBlocks.FRIGHT_DOOR);
            entries.addAfter(SoulfulBlocks.FRIGHT_DOOR, SoulfulBlocks.FRIGHT_TRAPDOOR);
            entries.addAfter(SoulfulBlocks.FRIGHT_TRAPDOOR, SoulfulBlocks.FRIGHT_PRESSURE_PLATE);
            entries.addAfter(SoulfulBlocks.FRIGHT_PRESSURE_PLATE, SoulfulBlocks.FRIGHT_BUTTON);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(entries -> {
            entries.addAfter(Items.CRIMSON_HANGING_SIGN, FRIGHT_SIGN);
            entries.addAfter(FRIGHT_SIGN, FRIGHT_HANGING_SIGN);
        });
    }
}