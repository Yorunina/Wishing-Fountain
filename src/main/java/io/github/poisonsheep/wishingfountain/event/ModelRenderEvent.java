package io.github.poisonsheep.wishingfountain.event;

import io.github.poisonsheep.wishingfountain.WishingFountain;
import io.github.poisonsheep.wishingfountain.client.model.tileentity.WFDefaultModel;
import io.github.poisonsheep.wishingfountain.client.model.tileentity.WFMonokumaModel;
import io.github.poisonsheep.wishingfountain.client.model.tileentity.WFNepModel;
import io.github.poisonsheep.wishingfountain.client.render.tileentity.WFRender;
import io.github.poisonsheep.wishingfountain.tileentity.WFEntity;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = WishingFountain.MODID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModelRenderEvent {

    @SubscribeEvent
    public static void onEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
        BlockEntityRenderers.register(WFEntity.TYPE, WFRender::new);
    }

    @SubscribeEvent
    public static void onRegisterLayers(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(WFDefaultModel.LAYER_LOCATION, WFDefaultModel::createBodyLayer);
        event.registerLayerDefinition(WFMonokumaModel.LAYER_LOCATION, WFMonokumaModel::createBodyLayer);
        event.registerLayerDefinition(WFNepModel.LAYER_LOCATION, WFNepModel::createBodyLayer);
    }
}
