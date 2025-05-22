package net.bon.soulfulnether;

import net.bon.soulfulnether.worldgen.SoulfulNetherRegion;
import net.bon.soulfulnether.worldgen.SoulfulSurfaceRules;
import terrablender.api.Regions;
import terrablender.api.SurfaceRuleManager;
import terrablender.api.TerraBlenderApi;

public class SoulfulTerraBlender implements TerraBlenderApi {
    @Override
    public void onTerraBlenderInitialized()
    {
        Regions.register(new SoulfulNetherRegion(SoulfulNether.id("nether"), 4));
        SurfaceRuleManager.addSurfaceRules(SurfaceRuleManager.RuleCategory.NETHER, SoulfulNether.MOD_ID, SoulfulSurfaceRules.registerSoulfulSurfaceRules());
    }
}