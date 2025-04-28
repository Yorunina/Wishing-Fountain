package io.github.poisonsheep.wishingfountain.registry;

import io.github.poisonsheep.wishingfountain.advancement.AdvancementTrigger;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.resources.ResourceLocation;

public class AdvancementTriggerRegistry {
    public static AdvancementTrigger SET_SAIL = new AdvancementTrigger(new ResourceLocation("wishing_fountain", "set_sail"));
    public static AdvancementTrigger DESPAIR_DISEASE = new AdvancementTrigger(new ResourceLocation("wishing_fountain", "despair_disease"));
    public static AdvancementTrigger DIMENSION_TRIPPER = new AdvancementTrigger(new ResourceLocation("wishing_fountain", "dimension_tripper"));

    public AdvancementTriggerRegistry() {
    }

    public static void register() {
        CriteriaTriggers.register(SET_SAIL);
        CriteriaTriggers.register(DESPAIR_DISEASE);
        CriteriaTriggers.register(DIMENSION_TRIPPER);
    }
}
