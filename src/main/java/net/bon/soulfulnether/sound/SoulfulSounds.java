package net.bon.soulfulnether.sound;


import net.bon.soulfulnether.SoulfulNether;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class SoulfulSounds {
    public static final SoundEvent BLOCK_SOULROOT_PICKED = SoulfulSounds.registerSoundEvent("block.soulroot_picked");

    public static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(SoulfulNether.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSoulfulSounds() {
        SoulfulNether.LOGGER.info("Registering Sounds for " + SoulfulNether.MOD_ID);
    }
}