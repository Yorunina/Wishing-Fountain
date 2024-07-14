package io.github.poisonsheep.wishingfountain.compat.jei;

import com.google.common.collect.Lists;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.List;

public class WFRecipeWrapper {
    private final List<List<ItemStack>> inputs;
    private final ItemStack output;
    private final String langKey;

    WFRecipeWrapper(List<Ingredient> inputs, ItemStack output, String langKey) {
        this.inputs = Lists.newArrayList();
        this.output = output;
        for (Ingredient input : inputs) {
            if (!input.isEmpty()) {
                this.inputs.add(Lists.newArrayList(input.getItems()));
            }
        }
        this.langKey = langKey;
    }

    public List<List<ItemStack>> getInputs() {
        return inputs;
    }

    public ItemStack getOutput() {
        return output;
    }

    public String getLangKey() {
        return langKey;
    }
}
