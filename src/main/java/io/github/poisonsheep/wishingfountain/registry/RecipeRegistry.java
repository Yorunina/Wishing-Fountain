package io.github.poisonsheep.wishingfountain.registry;

import io.github.poisonsheep.wishingfountain.WishingFountain;
import io.github.poisonsheep.wishingfountain.recipe.WFRecipe;
import io.github.poisonsheep.wishingfountain.recipe.WFRecipeSerializer;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegisterEvent;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class RecipeRegistry {
    public static final DeferredRegister<RecipeSerializer<?>> DEF_REG = DeferredRegister.create(Registries.RECIPE_SERIALIZER, WishingFountain.MODID);
    public static final RegistryObject<RecipeSerializer<?>> WF_RECIPE_SERIALIZER = DEF_REG.register("wishing_fountain_recipe", WFRecipeSerializer::new);
    public static RecipeType<WFRecipe> WF_RECIPE_TYPE;
    @SubscribeEvent
    public static void register(RegisterEvent evt) {
        if (evt.getRegistryKey().equals(Registries.RECIPE_SERIALIZER)) {
            WF_RECIPE_TYPE = RecipeType.simple(new ResourceLocation(WishingFountain.MODID, "wishing_fountain_recipe"));
        }
    }
}
