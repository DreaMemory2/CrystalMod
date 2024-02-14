package com.stalight.crystal.world.biome;

import com.mojang.datafixers.util.Pair;
import com.stalight.crystal.CrystalMod;
import com.stalight.crystal.register.ModBiomes;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.source.util.MultiNoiseUtil;
import terrablender.api.ParameterUtils;
import terrablender.api.Region;
import terrablender.api.RegionType;
import terrablender.api.VanillaParameterOverlayBuilder;

import java.util.function.Consumer;

public class EmberDesert extends Region {
    public EmberDesert() {
        super(new Identifier(CrystalMod.MODID, "ember_desert"), RegionType.OVERWORLD, 0);
    }

    @Override
    public void addBiomes(Registry<Biome> registry, Consumer<Pair<MultiNoiseUtil.NoiseHypercube, RegistryKey<Biome>>> mapper) {
        VanillaParameterOverlayBuilder builder = new VanillaParameterOverlayBuilder();
        new ParameterUtils.ParameterPointListBuilder()
                .temperature(ParameterUtils.Temperature.HOT)
                .humidity(ParameterUtils.Humidity.HUMID)
                .continentalness(ParameterUtils.Continentalness.NEAR_INLAND)
                .erosion(ParameterUtils.Erosion.EROSION_2)
                .weirdness(MultiNoiseUtil.ParameterRange.of(0.2F, 0.7F))
                .build().forEach(point -> builder.add(point, ModBiomes.emberDesert));

        builder.build().forEach(mapper);
    }
}
