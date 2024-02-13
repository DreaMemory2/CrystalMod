package com.stalight.crystal.datagen;

import com.stalight.crystal.block.BlockList;
import com.stalight.crystal.register.ModBlockRegistry;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGeneration extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagGeneration(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        this.getOrCreateTagBuilder(BlockTags.STONE_BRICKS)
                .add(BlockList.whiteStoneBrick)
                .add(BlockList.lightGrayStoneBrick)
                .add(BlockList.grayStoneBrick)
                .add(BlockList.blackStoneBrick)
                .add(BlockList.brownStoneBrick)
                .add(BlockList.redStoneBrick)
                .add(BlockList.orangeStoneBrick)
                .add(BlockList.yellowStoneBrick)
                .add(BlockList.limeStoneBrick)
                .add(BlockList.greenStoneBrick)
                .add(BlockList.cyanStoneBrick)
                .add(BlockList.lightBlueStoneBrick)
                .add(BlockList.blueStoneBrick)
                .add(BlockList.purpleStoneBrick)
                .add(BlockList.magentaStoneBrick)
                .add(BlockList.pinkStoneBrick);
        this.getOrCreateTagBuilder(BlockTags.STONE_ORE_REPLACEABLES)
                .add(ModBlockRegistry.whiteStone)
                .add(ModBlockRegistry.lightGrayStone)
                .add(ModBlockRegistry.grayStone)
                .add(ModBlockRegistry.blackStone)
                .add(ModBlockRegistry.brownStone)
                .add(ModBlockRegistry.redStone)
                .add(ModBlockRegistry.orangeStone)
                .add(ModBlockRegistry.yellowStone)
                .add(ModBlockRegistry.limeStone)
                .add(ModBlockRegistry.greenStone)
                .add(ModBlockRegistry.cyanStone)
                .add(ModBlockRegistry.lightBlueStone)
                .add(ModBlockRegistry.blueStone)
                .add(ModBlockRegistry.purpleStone)
                .add(ModBlockRegistry.magentaStone)
                .add(ModBlockRegistry.pinkStone);
        this.getOrCreateTagBuilder(BlockTags.DIRT)
                .add(ModBlockRegistry.whiteDirt)
                .add(ModBlockRegistry.lightGrayDirt)
                .add(ModBlockRegistry.grayDirt)
                .add(ModBlockRegistry.blackDirt)
                .add(ModBlockRegistry.brownDirt)
                .add(ModBlockRegistry.redDirt)
                .add(ModBlockRegistry.orangeDirt)
                .add(ModBlockRegistry.yellowDirt)
                .add(ModBlockRegistry.limeDirt)
                .add(ModBlockRegistry.greenDirt)
                .add(ModBlockRegistry.cyanDirt)
                .add(ModBlockRegistry.lightBlueDirt)
                .add(ModBlockRegistry.blueDirt)
                .add(ModBlockRegistry.purpleDirt)
                .add(ModBlockRegistry.magentaDirt)
                .add(ModBlockRegistry.pinkDirt);
        this.getOrCreateTagBuilder(BlockTags.LOGS)
                .add(BlockList.whiteLog)
                .add(BlockList.lightGrayLog)
                .add(BlockList.grayLog)
                .add(BlockList.blackLog)
                .add(BlockList.brownLog)
                .add(BlockList.redLog)
                .add(BlockList.orangeLog)
                .add(BlockList.yellowLog)
                .add(BlockList.limeLog)
                .add(BlockList.greenLog)
                .add(BlockList.cyanLog)
                .add(BlockList.lightBlueLog)
                .add(BlockList.blueLog)
                .add(BlockList.purpleLog)
                .add(BlockList.magentaLog)
                .add(BlockList.pinkLog);
        this.getOrCreateTagBuilder(BlockTags.LEAVES)
                .add(BlockList.whiteLeaves)
                .add(BlockList.lightGrayLeaves)
                .add(BlockList.grayLeaves)
                .add(BlockList.blackLeaves)
                .add(BlockList.brownLeaves)
                .add(BlockList.redLeaves)
                .add(BlockList.orangeLeaves)
                .add(BlockList.yellowLeaves)
                .add(BlockList.limeLeaves)
                .add(BlockList.greenLeaves)
                .add(BlockList.cyanLeaves)
                .add(BlockList.lightBlueLeaves)
                .add(BlockList.blueLeaves)
                .add(BlockList.purpleLeaves)
                .add(BlockList.magentaLeaves)
                .add(BlockList.pinkLeaves);
        this.getOrCreateTagBuilder(BlockTags.SAPLINGS)
                .add(BlockList.whiteSapling)
                .add(BlockList.lightGraySapling)
                .add(BlockList.graySapling)
                .add(BlockList.blackSapling)
                .add(BlockList.brownSapling)
                .add(BlockList.redSapling)
                .add(BlockList.orangeSapling)
                .add(BlockList.yellowSapling)
                .add(BlockList.limeSapling)
                .add(BlockList.greenSapling)
                .add(BlockList.cyanSapling)
                .add(BlockList.lightBlueSapling)
                .add(BlockList.blueSapling)
                .add(BlockList.purpleSapling)
                .add(BlockList.magentaSapling)
                .add(BlockList.pinkSapling);
    }
}
