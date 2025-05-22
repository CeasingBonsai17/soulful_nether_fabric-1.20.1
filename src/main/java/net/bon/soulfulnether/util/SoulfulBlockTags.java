package net.bon.soulfulnether.util;

import net.bon.soulfulnether.SoulfulNether;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public final class SoulfulBlockTags {
    public static final TagKey<Block> SOUL_CONVERTING_BLOCKS = createTag("soul_converting_blocks");
    public static final TagKey<Block> VALID_ROOT_BASES = createTag("valid_root_bases");

    private SoulfulBlockTags() {
    }

    private static TagKey<Block> createTag(String name) {
        return TagKey.of(RegistryKeys.BLOCK, new Identifier(SoulfulNether.MOD_ID, name));
    }
}
