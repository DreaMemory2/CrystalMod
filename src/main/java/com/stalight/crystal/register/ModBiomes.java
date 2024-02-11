package com.stalight.crystal.register;

import com.stalight.crystal.CrystalMod;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.Biome;

public class ModBiomes {
    public static RegistryKey<Biome> frostForest = register("frost_forest");

    public static void registerBiomes() {

    }

    private static RegistryKey<Biome> register(String name) {
        return RegistryKey.of(RegistryKeys.BIOME, new Identifier(CrystalMod.MODID, name));
    }
}
