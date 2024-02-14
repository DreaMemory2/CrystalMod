package com.stalight.crystal;

import com.stalight.crystal.register.*;
import com.stalight.crystal.world.SurfaceRuleData;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import terrablender.api.SurfaceRuleManager;
import terrablender.api.TerraBlenderApi;

public class CrystalMod implements ModInitializer, TerraBlenderApi {
	public static String MODID = "crystal";
    public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

	@Override
	public void onInitialize() {
		/* Block and Item */
		ModBlocks.registerBlocks();

		/* Registry */
		ModItemGroup.registerItemGroup();
		ModPortal.registerPortals();
		ModDimension.registerDimensions();
		ModBiomes.registerBiomes();
		ModGeneration.registerGeneration();
	}

	@Override
	public void onTerraBlenderInitialized() {
		/* Region Registry */
		ModRegions.registerRegions();
		/* Register our surface rules */
		SurfaceRuleManager.addSurfaceRules(SurfaceRuleManager.RuleCategory.OVERWORLD, MODID, SurfaceRuleData.makeRules());
	}
}