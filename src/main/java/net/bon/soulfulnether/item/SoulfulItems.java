package net.bon.soulfulnether.item;

import net.bon.soulfulnether.SoulfulNether;
import net.bon.soulfulnether.block.SoulfulBlocks;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Blocks;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;

public class SoulfulItems {
    public static final Item SOULROOT_SEEDS = registerItem("soulroot_seeds", new AliasedBlockItem(SoulfulBlocks.SOULROOTS, new FabricItemSettings()));
    public static final Item SOULROOT = registerItem("soulroot", new Item(new FabricItemSettings().food(SoulfulFoodComponents.soulroot)));
   public static final Item CHARRED_SOULROOT = registerItem("charred_soulroot", new Item(new FabricItemSettings().food(SoulfulFoodComponents.charred_soulroot)));
    public static final Item SOULROOT_PIE = registerItem("soulroot_pie", new Item(new FabricItemSettings().food(SoulfulFoodComponents.soulroot_pie)));
    public static final Item FRIGHT_SIGN = registerItem("fright_sign", new SignItem(new FabricItemSettings().maxCount(16), SoulfulBlocks.FRIGHT_SIGN, SoulfulBlocks.FRIGHT_WALL_SIGN));
    public static final Item FRIGHT_HANGING_SIGN = registerItem("fright_hanging_sign", new HangingSignItem(SoulfulBlocks.FRIGHT_HANGING_SIGN, SoulfulBlocks.FRIGHT_WALL_HANGING_SIGN, (new Item.Settings()).maxCount(16)));

    private static void addItemsToIngredientsItemGroup(FabricItemGroupEntries entries) {
    entries.add(SOULROOT);
}

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(SoulfulNether.MOD_ID, name), item);
    }

    public static void registerSoulfulItems() {
        SoulfulNether.LOGGER.info("Registering Items for " + SoulfulNether.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(SoulfulItems::addItemsToIngredientsItemGroup);
    }
}