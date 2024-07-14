package io.github.poisonsheep.wishingfountain.item;

import io.github.poisonsheep.wishingfountain.registry.AdvancementTriggerRegistry;
import net.minecraft.server.level.ServerPlayer;

public class NepsDecoration extends ModelChangedItem {

    public NepsDecoration(){
        super();
        this.textureIndex = 2;
    }

    @Override
    public void triggerAdvancement(ServerPlayer serverPlayer) {
        AdvancementTriggerRegistry.DIMENSION_TRIPPER.trigger(serverPlayer);
    }
}
