package io.github.poisonsheep.wishingfountain.recipe;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import net.minecraft.core.NonNullList;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.GsonHelper;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import org.jetbrains.annotations.Nullable;

public class WFRecipeSerializer implements RecipeSerializer<WFRecipe> {

    @Override
    public WFRecipe fromJson(ResourceLocation id, JsonObject json) {
        String biome = GsonHelper.getAsString(json, "biome");
        NonNullList<Ingredient> ingredients = itemsFromJson(GsonHelper.getAsJsonArray(json, "ingredients"));
        return new WFRecipe(id, biome, ingredients);
    }

    @Override
    public @Nullable WFRecipe fromNetwork(ResourceLocation id, FriendlyByteBuf buf) {
        String biome = buf.readUtf();
        int i = buf.readVarInt();
        NonNullList<Ingredient> ingredients = NonNullList.withSize(i, Ingredient.EMPTY);
        ingredients.replaceAll(ignored -> Ingredient.fromNetwork(buf));
        return new WFRecipe(id, biome, ingredients);
    }

    @Override
    public void toNetwork(FriendlyByteBuf buf, WFRecipe recipe) {
        buf.writeUtf(recipe.getBiome());
        buf.writeVarInt(recipe.getIngredients().size());
        for (Ingredient ingredient : recipe.getIngredients()) {
            ingredient.toNetwork(buf);
        }
    }


    private static NonNullList<Ingredient> itemsFromJson(JsonArray p_44276_) {
        NonNullList<Ingredient> nonnulllist = NonNullList.create();
        for(int i = 0; i < p_44276_.size(); ++i) {
            Ingredient ingredient = Ingredient.fromJson(p_44276_.get(i), false);
            nonnulllist.add(ingredient);
        }
        return nonnulllist;
    }
}
