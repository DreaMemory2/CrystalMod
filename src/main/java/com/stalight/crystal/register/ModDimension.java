package com.stalight.crystal.register;

import com.stalight.crystal.CrystalMod;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;

public class ModDimension {
    public static final RegistryKey<World> WHITE = RegistryKey.of(RegistryKeys.WORLD,
            new Identifier(CrystalMod.MODID, "white_dimension"));
    public static final RegistryKey<World> LIGHT_GRAY = RegistryKey.of(RegistryKeys.WORLD,
            new Identifier(CrystalMod.MODID, "light_gray_dimension"));
    public static final RegistryKey<World> GRAY = RegistryKey.of(RegistryKeys.WORLD,
            new Identifier(CrystalMod.MODID, "gray_dimension"));
    public static final RegistryKey<World> BLACK = RegistryKey.of(RegistryKeys.WORLD,
            new Identifier(CrystalMod.MODID, "black_dimension"));

    public static void registerDimensions() {
        registerDimensionTypes(WHITE);
        registerDimensionTypes(LIGHT_GRAY);
        registerDimensionTypes(GRAY);
        registerDimensionTypes(BLACK);
    }

    private static void registerDimensionTypes(RegistryKey<World> world) {
        RegistryKey.of(RegistryKeys.DIMENSION_TYPE, world.getValue());
    }
}
