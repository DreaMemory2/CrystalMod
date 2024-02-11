package com.stalight.crystal.register;

import com.stalight.crystal.CrystalMod;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;

public class ModDimension {
    public static final RegistryKey<World> WHITE = RegistryKey.of(RegistryKeys.WORLD,
            new Identifier(CrystalMod.MODID, "white_dimension"));

    public static void registerDimensions() {
        registerDimensionTypes(WHITE);
    }

    private static void registerDimensionTypes(RegistryKey<World> world) {
        RegistryKey.of(RegistryKeys.DIMENSION_TYPE, world.getValue());
    }
}
