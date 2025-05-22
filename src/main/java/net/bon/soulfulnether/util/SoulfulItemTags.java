package net.bon.soulfulnether.util;

import net.bon.soulfulnether.SoulfulNether;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public final class SoulfulItemTags {
    public static final TagKey<Item> FRIGHT_STEMS = createTag("fright_stems");

    private SoulfulItemTags() {
    }

    private static TagKey<Item> createTag(String name) {
        return TagKey.of(RegistryKeys.ITEM, new Identifier(SoulfulNether.MOD_ID, name));
    }
}