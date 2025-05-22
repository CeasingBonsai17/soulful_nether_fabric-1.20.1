package net.bon.soulfulnether;

import net.bon.soulfulnether.block.SoulfulBlocks;
import net.bon.soulfulnether.block.entity.SoulfulBlockEntities;
import net.bon.soulfulnether.item.SoulfulItemGroups;
import net.bon.soulfulnether.item.SoulfulItems;
import net.bon.soulfulnether.particle.SoulfulParticleTypes;
import net.bon.soulfulnether.sound.SoulfulSounds;
import net.bon.soulfulnether.worldgen.feature.SoulfulFeature;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.CompostingChanceRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SoulfulNether implements ModInitializer {
	public static final String MOD_ID = "soulfulnether";
	public static final String MOD_NAME = "Soulful Nether";
	public static final Logger LOGGER = LoggerFactory.getLogger("MOD_ID");

	public static Identifier id(String path) {
		return new Identifier(SoulfulNether.MOD_ID, path);
	}
	@Override
	public void onInitialize() {
		SoulfulItemGroups.registerSoulfulItemGroups();
		SoulfulItems.registerSoulfulItems();
		SoulfulBlocks.registerSoulfulBlocks();
		SoulfulParticleTypes.registerSoulfulParticles();
		SoulfulSounds.registerSoulfulSounds();
		SoulfulBlockEntities.registerSoulfulBlockEntities();
		SoulfulFeature.registerSoulfulFeatures();
		registerCompostables();

		StrippableBlockRegistry.register(SoulfulBlocks.FRIGHT_STEM, SoulfulBlocks.STRIPPED_FRIGHT_STEM);
		StrippableBlockRegistry.register(SoulfulBlocks.FRIGHT_HYPHAE, SoulfulBlocks.STRIPPED_FRIGHT_HYPHAE);
	}

	protected void registerCompostables() {
		CompostingChanceRegistry.INSTANCE.add(SoulfulItems.SOULROOT_SEEDS, 0.3f);
		CompostingChanceRegistry.INSTANCE.add(SoulfulItems.SOULROOT, 0.65f);
		CompostingChanceRegistry.INSTANCE.add(SoulfulItems.CHARRED_SOULROOT, 0.85f);
		CompostingChanceRegistry.INSTANCE.add(SoulfulItems.SOULROOT_PIE, 1.0f);
		CompostingChanceRegistry.INSTANCE.add(SoulfulBlocks.LICHOSS_BLOCK, 0.65f);
		CompostingChanceRegistry.INSTANCE.add(SoulfulBlocks.HANGING_LICHOSS, 0.5f);
		CompostingChanceRegistry.INSTANCE.add(SoulfulBlocks.LICHOSS_CARPET, 0.3f);
		CompostingChanceRegistry.INSTANCE.add(SoulfulBlocks.EMBER_ROOTS, 0.65f);
		CompostingChanceRegistry.INSTANCE.add(SoulfulBlocks.FRIGHT_FUNGUS, 0.65f);
		CompostingChanceRegistry.INSTANCE.add(SoulfulBlocks.FRIGHT_ROOTS, 0.65f);
		CompostingChanceRegistry.INSTANCE.add(SoulfulBlocks.SPIRALING_VINES, 0.5f);
	}
}