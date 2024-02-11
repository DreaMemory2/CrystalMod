package com.stalight.crystal.datagen;

import com.stalight.crystal.block.BlockList;
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
                .add(BlockList.whiteStone)
                .add(BlockList.lightGrayStone)
                .add(BlockList.grayStone)
                .add(BlockList.blackStone)
                .add(BlockList.brownStone)
                .add(BlockList.redStone)
                .add(BlockList.orangeStone)
                .add(BlockList.yellowStone)
                .add(BlockList.limeStone)
                .add(BlockList.greenStone)
                .add(BlockList.cyanStone)
                .add(BlockList.lightBlueStone)
                .add(BlockList.blueStone)
                .add(BlockList.purpleStone)
                .add(BlockList.magentaStone)
                .add(BlockList.pinkStone);
        this.getOrCreateTagBuilder(BlockTags.DIRT)
                .add(BlockList.whiteDirt)
                .add(BlockList.lightGrayDirt)
                .add(BlockList.grayDirt)
                .add(BlockList.blackDirt)
                .add(BlockList.brownDirt)
                .add(BlockList.redDirt)
                .add(BlockList.orangeDirt)
                .add(BlockList.yellowDirt)
                .add(BlockList.limeDirt)
                .add(BlockList.greenDirt)
                .add(BlockList.cyanDirt)
                .add(BlockList.lightBlueDirt)
                .add(BlockList.blueDirt)
                .add(BlockList.purpleDirt)
                .add(BlockList.magentaDirt)
                .add(BlockList.pinkDirt);
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
