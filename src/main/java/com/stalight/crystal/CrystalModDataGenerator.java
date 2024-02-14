package com.stalight.crystal;

import com.stalight.crystal.datagen.*;
import com.stalight.crystal.world.feature.TreeConfiguredFeatures;
import com.stalight.crystal.world.feature.TreePlacedFeatures;
import com.stalight.crystal.world.feature.VegetationConfiguredFeatures;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;

public class CrystalModDataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
        pack.addProvider(ModLanguageGenerator::new);
        pack.addProvider(ModModelGenerator::new);
        pack.addProvider(ModBlockLootTables::new);
        pack.addProvider(ModBlockTagGeneration::new);
        pack.addProvider(ModWorldGenerator::new);
    }

    @Override
    public void buildRegistry(RegistryBuilder registryBuilder) {
        registryBuilder.addRegistry(RegistryKeys.CONFIGURED_FEATURE, TreeConfiguredFeatures::bootstrap);
        registryBuilder.addRegistry(RegistryKeys.CONFIGURED_FEATURE, VegetationConfiguredFeatures::bootstrap);
        registryBuilder.addRegistry(RegistryKeys.PLACED_FEATURE, TreePlacedFeatures::bootstrap);

    }
}
