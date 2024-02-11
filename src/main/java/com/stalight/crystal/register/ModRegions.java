package com.stalight.crystal.register;

import com.stalight.crystal.world.biome.FrostForest;
import terrablender.api.Regions;

public class ModRegions {
    public static void registerRegions() {
        Regions.register(new FrostForest());
    }
}
