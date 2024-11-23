package net.bon.soulfulnether.item;

import net.bon.soulfulnether.SoulfulNether;
import net.bon.soulfulnether.block.SoulfulBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class SoulfulItemGroups {
    public static final ItemGroup SOULFULNETHER = Registry.register(Registries.ITEM_GROUP,
            new Identifier(SoulfulNether.MOD_ID, "soulfulnether"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.soulfulnether"))
                    .icon(() -> new ItemStack(SoulfulItems.SOULROOT)).entries((displayContext, entries) -> {
                        entries.add(SoulfulBlocks.FRIGHT_STEM);
                        entries.add(SoulfulBlocks.FRIGHT_HYPHAE);
                        entries.add(SoulfulBlocks.STRIPPED_FRIGHT_STEM);
                        entries.add(SoulfulBlocks.STRIPPED_FRIGHT_HYPHAE);
                        entries.add(SoulfulBlocks.FRIGHT_PLANKS);
                        entries.add(SoulfulBlocks.FRIGHT_STAIRS);
                        entries.add(SoulfulBlocks.FRIGHT_SLAB);
                        entries.add(SoulfulBlocks.FRIGHT_FENCE);
                        entries.add(SoulfulBlocks.FRIGHT_FENCE_GATE);
                        entries.add(SoulfulBlocks.FRIGHT_DOOR);
                        entries.add(SoulfulBlocks.FRIGHT_TRAPDOOR);
                        entries.add(SoulfulBlocks.FRIGHT_PRESSURE_PLATE);
                        entries.add(SoulfulBlocks.FRIGHT_BUTTON);
                        entries.add(SoulfulBlocks.LICHOSS_BLOCK);
                        entries.add(SoulfulBlocks.LICHOSS_CARPET);
                        entries.add(SoulfulBlocks.EMBER_ROOTS);
                        entries.add(SoulfulBlocks.FRIGHT_WART_BLOCK);
                        entries.add(SoulfulBlocks.FRIGHT_FUNGUS);
                        entries.add(SoulfulBlocks.FRIGHT_ROOTS);
                        entries.add(SoulfulItems.FRIGHT_SIGN);
                        entries.add(SoulfulItems.FRIGHT_HANGING_SIGN);
                        entries.add(SoulfulBlocks.SPIRALING_VINES);
                        entries.add(SoulfulItems.SOULROOT_SEEDS);
                        entries.add(SoulfulItems.SOULROOT);
                        entries.add(SoulfulItems.CHARRED_SOULROOT);
                        entries.add(SoulfulItems.SOULROOT_PIE);

                    }).build());

    public static void registerSoulfulItemGroups() {
        SoulfulNether.LOGGER.info("Registering Item Groups for " + SoulfulNether.MOD_ID);
    }
}