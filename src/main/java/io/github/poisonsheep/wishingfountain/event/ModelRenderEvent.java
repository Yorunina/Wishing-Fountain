package io.github.poisonsheep.wishingfountain.event;

import io.github.poisonsheep.wishingfountain.WishingFountain;
import io.github.poisonsheep.wishingfountain.client.model.tileentity.WishingFountainModel;
import io.github.poisonsheep.wishingfountain.client.render.WishingFountainRender;
import io.github.poisonsheep.wishingfountain.tileentity.WishingFountainEntity;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = WishingFountain.MODID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModelRenderEvent {
    @SubscribeEvent
    public static void onEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
        BlockEntityRenderers.register(WishingFountainEntity.TYPE, WishingFountainRender::new);
    }
    @SubscribeEvent
    public static void onRegisterLayers(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(WishingFountainModel.LAYER_LOCATION, WishingFountainModel::createBodyLayer);
    }
}
