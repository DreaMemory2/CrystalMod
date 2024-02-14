package com.stalight.crystal.register;

import com.stalight.crystal.world.biome.DarkForest;
import com.stalight.crystal.world.biome.EmberDesert;
import com.stalight.crystal.world.biome.EmberPlain;
import com.stalight.crystal.world.biome.FrostForest;
import terrablender.api.Regions;

public class ModRegions {
    public static void registerRegions() {
        Regions.register(new FrostForest());
        Regions.register(new EmberDesert());
        Regions.register(new EmberPlain());
        Regions.register(new DarkForest());
    }
}
