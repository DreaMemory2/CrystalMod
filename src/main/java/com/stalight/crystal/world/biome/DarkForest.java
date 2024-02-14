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

public class DarkForest extends Region {
    public DarkForest() {
        super(new Identifier(CrystalMod.MODID, "black_forest"), RegionType.OVERWORLD, 0);
    }

    @Override
    public void addBiomes(Registry<Biome> registry, Consumer<Pair<MultiNoiseUtil.NoiseHypercube, RegistryKey<Biome>>> mapper) {
        VanillaParameterOverlayBuilder builder = new VanillaParameterOverlayBuilder();
        new ParameterUtils.ParameterPointListBuilder()
                .temperature(ParameterUtils.Temperature.NEUTRAL)
                .humidity(ParameterUtils.Humidity.HUMID)
                .continentalness(ParameterUtils.Continentalness.MID_INLAND)
                .erosion(ParameterUtils.Erosion.EROSION_1)
                .weirdness(MultiNoiseUtil.ParameterRange.of(-0.85F, -0.2F))
                .build().forEach(point -> builder.add(point, ModBiomes.darkTree));

        builder.build().forEach(mapper);
    }
}
