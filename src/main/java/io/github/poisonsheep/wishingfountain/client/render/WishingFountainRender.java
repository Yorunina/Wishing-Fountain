package io.github.poisonsheep.wishingfountain.client.render;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Axis;
import io.github.poisonsheep.wishingfountain.WishingFountain;
import io.github.poisonsheep.wishingfountain.client.model.WishingFountainModel;
import io.github.poisonsheep.wishingfountain.tileentity.WishingFountainEntity;
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

import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Supplier;

public class WishingFountainRender implements BlockEntityRenderer<WishingFountainEntity> {

    private final ItemRenderer itemRenderer;

    private final WishingFountainModel MODEL;

    private static final ResourceLocation TEXTURE = new ResourceLocation(WishingFountain.MODID, "textures/entity/wishing_fountain.png");

    public WishingFountainRender(BlockEntityRendererProvider.Context render) {
        MODEL = new WishingFountainModel(render.bakeLayer(WishingFountainModel.LAYER_LOCATION));
        Minecraft minecraft = Minecraft.getInstance();
        itemRenderer = minecraft.getItemRenderer();
    }
    @Override
    public void render(WishingFountainEntity entity, float partialTicks, PoseStack poseStack, MultiBufferSource source, int combinedLightIn, int combinedOverlayIn) {
        if(entity.isRender()) {
            poseStack.pushPose();
            this.setTranslateAndPose(entity, poseStack);
            poseStack.mulPose(Axis.ZN.rotationDegrees(180));
            VertexConsumer buffer = source.getBuffer(RenderType.entityTranslucent(TEXTURE));
            MODEL.renderToBuffer(poseStack, buffer, combinedLightIn, combinedOverlayIn, 1.0F, 1.0F, 1.0F, 1.0F);
            poseStack.popPose();
        }
        if (!entity.handler.getStackInSlot(0).isEmpty()) {
            long r = entity.getBlockPos().asLong();
            RandomSource rand = RandomSource.create(r);
            AtomicInteger i = new AtomicInteger();
            renderCookies(itemRenderer, poseStack, source, rand, combinedLightIn, combinedOverlayIn,
                    () -> {
                        int j = i.getAndIncrement();
                        return j < entity.handler.getSlots() ? entity.handler.getStackInSlot(0) : ItemStack.EMPTY;
                    });
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

    public static void renderCookies(ItemRenderer itemRenderer, PoseStack poseStack, MultiBufferSource buffer, RandomSource rand,
                                     int light, int overlay, Supplier<ItemStack> itemIterator) {

        ItemStack cookieStack = itemIterator.get();
        if (!cookieStack.isEmpty()) {
            poseStack.pushPose();
            poseStack.translate(0.5, 0.5, 0.5);
            poseStack.mulPose(Axis.XN.rotationDegrees(90));
            float scale = 8f / 14f;
            poseStack.scale(scale, scale, scale);
            do {
                poseStack.mulPose(Axis.ZP.rotationDegrees(rand.nextInt(360)));
                poseStack.translate(0, 0, 1 / (16f * scale));
                BakedModel model = itemRenderer.getModel(cookieStack, null, null, 0);
                itemRenderer.render(cookieStack, ItemDisplayContext.FIXED, true, poseStack, buffer, light,
                        overlay, model);
                cookieStack = itemIterator.get();
            } while (!cookieStack.isEmpty());
            poseStack.popPose();
        }
    }
}
