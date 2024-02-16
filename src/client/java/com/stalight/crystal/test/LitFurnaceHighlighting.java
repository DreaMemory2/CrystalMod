package com.stalight.crystal.test;

import com.google.gson.JsonSyntaxException;
import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import com.stalight.crystal.CrystalMod;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.WorldRenderContext;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gl.PostEffectProcessor;
import net.minecraft.client.render.BufferBuilder;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.VertexFormat;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;

import java.io.IOException;
import java.util.HashMap;
import java.util.Objects;

@Environment(EnvType.CLIENT)
public class LitFurnaceHighlighting {
    private int framebufferWidth = -1;
    private int framebufferHeight = -1;

    public PostEffectProcessor shaders = null;
    private final BufferBuilder bufferBuilder = new BufferBuilder(256);

    private void onModelRegistry() {
        if (this.shaders != null) this.shaders.close();

        this.framebufferWidth = this.framebufferHeight = -1;

        var resourceLocation = new Identifier(CrystalMod.MODID, "shaders/post/furnace_outline.json");

        try {
            var mc = MinecraftClient.getInstance();
            var mainFramebuffer = mc.getFramebuffer();
            var textureManager = mc.getTextureManager();
            var resourceManager = mc.getResourceManager();
            this.shaders = new PostEffectProcessor(textureManager, resourceManager, mainFramebuffer, resourceLocation);
        } catch (IOException | JsonSyntaxException e) {
            CrystalMod.LOGGER.warn("Failed to load shader: {}", resourceLocation, e);
            this.shaders = null;
        }
    }

    private void onRenderWorldLast(WorldRenderContext event) {
        // step 0: check if shaders are supported
        if (this.shaders == null) return;

        // step 1: collect furnaces
        var mc = MinecraftClient.getInstance();
        var world = Objects.requireNonNull(mc.world);
        var furnaceCollection = new HashMap<BlockPos, BlockState>();
        for (var tileEntity : world.getEntities()) {
            var blockState = tileEntity.getSteppingBlockState();
            if (Blocks.FURNACE.equals(blockState.getBlock()) && blockState.get(Properties.LIT)) {
                furnaceCollection.put(tileEntity.getBlockPos(), blockState);
            }
            if (Blocks.BLAST_FURNACE.equals(blockState.getBlock()) && blockState.get(Properties.LIT)) {
                furnaceCollection.put(tileEntity.getBlockPos(), blockState);
            }
        }
        if (furnaceCollection.isEmpty()) return;

        // step 2: resize our framebuffer
        var mainWindow = mc.getWindow();
        var width = mainWindow.getFramebufferWidth();
        var height = mainWindow.getFramebufferHeight();
        if (width != this.framebufferWidth || height != this.framebufferHeight) {
            this.framebufferHeight = width;
            this.framebufferWidth = height;
            this.shaders.setupDimensions(width, height);
        }

        // step 3: prepare block faces
        var matrixStack = event.matrixStack();
        var dispatcher = mc.getBlockRenderManager();
        var view = mc.gameRenderer.getCamera().getBlockPos();
        this.bufferBuilder.begin(VertexFormat.DrawMode.QUADS, VertexFormats.POSITION);
        for (var entry : furnaceCollection.entrySet()) {
            var blockPos = entry.getKey();
            var blockState = entry.getValue();
            var model = dispatcher.getModel(blockState);

            matrixStack.translate(-view.getX(), -view.getY(), -view.getZ());
            matrixStack.translate(blockPos.getX(), blockPos.getY(), blockPos.getZ());

            dispatcher.getModelRenderer().render(matrixStack.peek(), this.bufferBuilder, blockState, model,
                    1.0F, 1.0F, 1.0F, 0XFFFFFFFF,
                    OverlayTexture.DEFAULT_UV);
            matrixStack.pop();
        }
        this.bufferBuilder.end();

        // step 4: bind our framebuffer
        var framebuffer = this.shaders.getSecondaryTarget(CrystalMod.MODID + ":final");
        framebuffer.clear(MinecraftClient.IS_SYSTEM_MAC);
        framebuffer.beginWrite(false);

        // step 5: render block faces to our framebuffer
        RenderSystem.disableBlend();
        RenderSystem.disableCull();
        RenderSystem.depthMask(false);
        RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
        // BufferRenderer.draw(this.bufferBuilder.end());
        // WorldVertexBufferUploader.draw(this.bufferBuilder);

        // step 6: apply shaders
        this.shaders.render(event.tickDelta());

        // step 7: bind main framebuffer
        mc.getFramebuffer().beginWrite(false);

        // step 8: render our framebuffer to main framebuffer
        RenderSystem.enableBlend();
        RenderSystem.blendFuncSeparate(
                GlStateManager.SrcFactor.SRC_ALPHA,
                GlStateManager.DstFactor.ONE_MINUS_SRC_ALPHA,
                GlStateManager.SrcFactor.ZERO,
                GlStateManager.DstFactor.ONE
        );
        framebuffer.resize(width, height, false);

        // step 9: clean up
        RenderSystem.disableBlend();
        RenderSystem.enableCull();
        RenderSystem.depthMask(false);
    }
}
