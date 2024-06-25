package io.github.poisonsheep.wishingfountain.client.render;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Axis;
import io.github.poisonsheep.wishingfountain.WishingFountain;
import io.github.poisonsheep.wishingfountain.client.model.WishingFountainModel;
import io.github.poisonsheep.wishingfountain.tileentity.WishingFountainEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

public class WishingFountainRender implements BlockEntityRenderer<WishingFountainEntity> {

    private final WishingFountainModel MODEL;

    private static final ResourceLocation TEXTURE = new ResourceLocation(WishingFountain.MODID, "textures/entity/wishing_fountain.png");

    public WishingFountainRender(BlockEntityRendererProvider.Context render) {
        MODEL = new WishingFountainModel(render.bakeLayer(WishingFountainModel.LAYER_LOCATION));
    }
    @Override
    public void render(WishingFountainEntity entity, float partialTicks, PoseStack stack, MultiBufferSource source, int combinedLightIn, int combinedOverlayIn) {
        if(entity.isRender()) {
            stack.pushPose();
            this.setTranslateAndPose(entity, stack);
            stack.mulPose(Axis.ZN.rotationDegrees(180));
            VertexConsumer buffer = source.getBuffer(RenderType.entityTranslucent(TEXTURE));
            MODEL.renderToBuffer(stack, buffer, combinedLightIn, combinedOverlayIn, 1.0F, 1.0F, 1.0F, 1.0F);
            stack.popPose();
        }
    }

    @Override
    public boolean shouldRenderOffScreen(@NotNull WishingFountainEntity entity) {
        return true;
    }

    private void setTranslateAndPose(WishingFountainEntity entity, PoseStack stack) {
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
