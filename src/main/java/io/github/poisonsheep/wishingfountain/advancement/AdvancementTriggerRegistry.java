package io.github.poisonsheep.wishingfountain.advancement;

import io.github.poisonsheep.wishingfountain.WishingFountain;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.resources.ResourceLocation;

public class AdvancementTriggerRegistry {

    public static AdvancementTrigger SET_SAIL = new AdvancementTrigger(new ResourceLocation(WishingFountain.MODID, "set_sail"));

    public static void register() {
        CriteriaTriggers.register(SET_SAIL);
    }
}
