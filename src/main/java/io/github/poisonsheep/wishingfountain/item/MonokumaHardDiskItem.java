package io.github.poisonsheep.wishingfountain.item;

import io.github.poisonsheep.wishingfountain.registry.AdvancementTriggerRegistry;
import net.minecraft.server.level.ServerPlayer;

public class MonokumaHardDiskItem extends ModelChangedItem {

    public MonokumaHardDiskItem(){
        super();
        this.textureIndex = 1;
    }

    @Override
    public void triggerAdvancement(ServerPlayer serverPlayer) {
        AdvancementTriggerRegistry.DESPAIR_DISEASE.trigger(serverPlayer);
    }
}
