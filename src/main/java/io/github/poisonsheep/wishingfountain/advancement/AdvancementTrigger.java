package io.github.poisonsheep.wishingfountain.advancement;

import com.google.gson.JsonObject;
import net.minecraft.advancements.critereon.AbstractCriterionTriggerInstance;
import net.minecraft.advancements.critereon.ContextAwarePredicate;
import net.minecraft.advancements.critereon.DeserializationContext;
import net.minecraft.advancements.critereon.SimpleCriterionTrigger;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;

public class AdvancementTrigger extends SimpleCriterionTrigger<AdvancementTrigger.TriggerInstance> {
    public final ResourceLocation ID;

    public AdvancementTrigger(ResourceLocation id) {
        this.ID = id;
    }

    public ResourceLocation getId() {
        return ID;
    }

    public void trigger(ServerPlayer player) {
        this.trigger(player, TriggerInstance::test);
    }

    @Override
    protected TriggerInstance createInstance(JsonObject json, ContextAwarePredicate player, DeserializationContext p_66250_) {
        return new TriggerInstance(player, ID);
    }

    public static class TriggerInstance extends AbstractCriterionTriggerInstance
    {
        public TriggerInstance(ContextAwarePredicate player, ResourceLocation res) {
            super(res, player);
        }
        public boolean test() {
            return true;
        }
    }
}
