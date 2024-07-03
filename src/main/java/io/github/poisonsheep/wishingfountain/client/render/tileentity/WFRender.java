package io.github.poisonsheep.wishingfountain.client.render.tileentity;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Axis;
import io.github.poisonsheep.wishingfountain.WishingFountain;
import io.github.poisonsheep.wishingfountain.client.model.tileentity.WFModel;
import io.github.poisonsheep.wishingfountain.tileentity.WFEntity;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.entity.ItemRenderer;
import net.minecraft.client.resources.model.BakedModel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.ItemDisplayContext;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;

public class WFRender implements BlockEntityRenderer<WFEntity> {

    private final ItemRenderer itemRenderer;

    private final WFModel MODEL;

    private static final ResourceLocation TEXTURE = new ResourceLocation(WishingFountain.MODID, "textures/entity/wishing_fountain.png");

    public WFRender(BlockEntityRendererProvider.Context render) {
        MODEL = new WFModel(render.bakeLayer(WFModel.LAYER_LOCATION));
        Minecraft minecraft = Minecraft.getInstance();
        itemRenderer = minecraft.getItemRenderer();
    }
    @Override
    public void render(WFEntity entity, float partialTicks, PoseStack poseStack, MultiBufferSource source, int combinedLightIn, int combinedOverlayIn) {
        if(entity.isRender()) {
            poseStack.pushPose();
            this.setTranslateAndPose(entity, poseStack);
            poseStack.mulPose(Axis.ZN.rotationDegrees(180));
            VertexConsumer buffer = source.getBuffer(RenderType.entityTranslucent(TEXTURE));
            MODEL.renderToBuffer(poseStack, buffer, combinedLightIn, combinedOverlayIn, 1.0F, 1.0F, 1.0F, 1.0F);
            poseStack.popPose();
        }
        if (!entity.handler.getStackInSlot(0).isEmpty()) {
            ItemStack stack = entity.handler.getStackInSlot(0);
            long r = entity.getBlockPos().asLong();
            RandomSource rand = RandomSource.create(r);
            poseStack.pushPose();
            poseStack.translate(0.5, 0.5, 0.5);
            poseStack.mulPose(Axis.XN.rotationDegrees(90));
            float scale = 8f / 14f;
            poseStack.scale(scale, scale, scale);
            for (int i = 0; i < stack.getCount(); i++) {
                poseStack.mulPose(Axis.ZP.rotationDegrees(rand.nextInt(360)));
                poseStack.translate(0, 0, 0.5 / (16f * scale));
                BakedModel model = itemRenderer.getModel(stack, null, null, 0);
                itemRenderer.render(stack, ItemDisplayContext.FIXED, true, poseStack, source, combinedLightIn,
                        combinedOverlayIn, model);
            }
            poseStack.popPose();
        }
    }

    @Override
    public boolean shouldRenderOffScreen(@NotNull WFEntity entity) {
        return true;
    }

    private void setTranslateAndPose(WFEntity entity, PoseStack stack) {
        stack.translate(0.5, -0.5, 0.5);
        switch (entity.getDirection()) {
            case SOUTH:
                stack.mulPose(Axis.YP.rotationDegrees(90));
                break;
            case EAST:
                stack.mulPose(Axis.YP.rotationDegrees(180));
                break;
            case NORTH:
                stack.mulPose(Axis.YP.rotationDegrees(270));
                break;
        }
    }
}
