package com.stalight.crystal;

import com.stalight.crystal.block.BlockList;
import com.stalight.crystal.register.ModBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class CrystalModClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		BlockRenderLayerMap.INSTANCE.putBlock(BlockList.whiteLeaves, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockList.lightGrayLeaves, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockList.grayLeaves, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockList.blackLeaves, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockList.brownLeaves, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockList.redLeaves, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockList.orangeLeaves, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockList.yellowLeaves, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockList.limeLeaves, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockList.greenLeaves, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockList.cyanLeaves, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockList.lightBlueLeaves, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockList.blueLeaves, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockList.purpleLeaves, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockList.magentaLeaves, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockList.pinkLeaves, RenderLayer.getCutout());

		BlockRenderLayerMap.INSTANCE.putBlock(BlockList.whiteSapling, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockList.lightGraySapling, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockList.graySapling, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockList.blackSapling, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockList.brownSapling, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockList.redSapling, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockList.orangeSapling, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockList.yellowSapling, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockList.limeSapling, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockList.greenSapling, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockList.cyanSapling, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockList.lightBlueSapling, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockList.blueSapling, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockList.purpleSapling, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockList.magentaSapling, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockList.pinkSapling, RenderLayer.getCutout());

		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.whiteShortGrassBlock, RenderLayer.getCutout());
	}
}