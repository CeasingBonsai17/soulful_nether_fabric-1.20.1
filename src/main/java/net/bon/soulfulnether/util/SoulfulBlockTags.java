package net.bon.soulfulnether.util;

import net.bon.soulfulnether.SoulfulNether;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public final class SoulfulBlockTags {
        public static final TagKey<Block> SOUL_CONVERTING_BLOCKS = createTag("soul_converting_blocks");
        public static final TagKey<Block> FRIGHT_STEMS = createTag("fright_stems");
        public static final TagKey<Block> FRIGHT_WART_BLOCKS = createTag("fright_wart_blocks");
        public static final TagKey<Block> LICHOSS = createTag("lichoss");
        public static final TagKey<Block> LICHOSS_REPLACEABLE = createTag("lichoss_replaceable");
        public static final TagKey<Block> FRIGHT_FOREST_GROUND_BLOCKS = createTag("fright_forest_ground_blocks");

    private SoulfulBlockTags() {
    }

    private static TagKey<Block> createTag(String name) {
        return TagKey.of(RegistryKeys.BLOCK, new Identifier(SoulfulNether.MOD_ID, name));
    }
}
