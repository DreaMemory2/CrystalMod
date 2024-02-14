package com.stalight.crystal.datagen;

import com.stalight.crystal.block.BlockList;
import com.stalight.crystal.register.ModBlocks;
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
                .add(ModBlocks.whiteStone)
                .add(ModBlocks.lightGrayStone)
                .add(ModBlocks.grayStone)
                .add(ModBlocks.blackStone)
                .add(ModBlocks.brownStone)
                .add(ModBlocks.redStone)
                .add(ModBlocks.orangeStone)
                .add(ModBlocks.yellowStone)
                .add(ModBlocks.limeStone)
                .add(ModBlocks.greenStone)
                .add(ModBlocks.cyanStone)
                .add(ModBlocks.lightBlueStone)
                .add(ModBlocks.blueStone)
                .add(ModBlocks.purpleStone)
                .add(ModBlocks.magentaStone)
                .add(ModBlocks.pinkStone);
        this.getOrCreateTagBuilder(BlockTags.DIRT)
                .add(ModBlocks.whiteDirt)
                .add(ModBlocks.lightGrayDirt)
                .add(ModBlocks.grayDirt)
                .add(ModBlocks.blackDirt)
                .add(ModBlocks.brownDirt)
                .add(ModBlocks.redDirt)
                .add(ModBlocks.orangeDirt)
                .add(ModBlocks.yellowDirt)
                .add(ModBlocks.limeDirt)
                .add(ModBlocks.greenDirt)
                .add(ModBlocks.cyanDirt)
                .add(ModBlocks.lightBlueDirt)
                .add(ModBlocks.blueDirt)
                .add(ModBlocks.purpleDirt)
                .add(ModBlocks.magentaDirt)
                .add(ModBlocks.pinkDirt)

                .add(ModBlocks.whiteGrassBlock)
                .add(ModBlocks.lightGrayGrassBlock)
                .add(ModBlocks.grayGrassBlock)
                .add(ModBlocks.blackGrassBlock)
                .add(ModBlocks.brownGrassBlock)
                .add(ModBlocks.redGrassBlock)
                .add(ModBlocks.orangeGrassBlock)
                .add(ModBlocks.yellowGrassBlock)
                .add(ModBlocks.limeGrassBlock)
                .add(ModBlocks.greenGrassBlock)
                .add(ModBlocks.cyanGrassBlock)
                .add(ModBlocks.lightBlueGrassBlock)
                .add(ModBlocks.blueGrassBlock)
                .add(ModBlocks.purpleGrassBlock)
                .add(ModBlocks.magentaGrassBlock)
                .add(ModBlocks.pinkGrassBlock);
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
