package io.github.poisonsheep.wishingfountain.recipe;

import io.github.poisonsheep.wishingfountain.inventory.WFRecipeInventory;
import io.github.poisonsheep.wishingfountain.item.WFMapItem;
import io.github.poisonsheep.wishingfountain.registry.ItemRegistry;
import io.github.poisonsheep.wishingfountain.registry.RecipeRegistry;
import net.minecraft.core.BlockPos;
import net.minecraft.core.NonNullList;
import net.minecraft.core.RegistryAccess;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.Level;
import net.minecraftforge.common.util.RecipeMatcher;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

public class WFRecipe implements Recipe<WFRecipeInventory> {
    private final ResourceLocation id;
    private final String biome;
    private final NonNullList<Ingredient> ingredients;

    public WFRecipe(ResourceLocation id, String biome, NonNullList<Ingredient> ingredients) {
        this.id = id;
        this.biome = biome;
        this.ingredients = ingredients;
    }

    public void spawnOutputEntity(Level worldIn, BlockPos pos, @Nullable WFRecipeInventory inv) {
        if(worldIn instanceof ServerLevel server) {
            ItemStack stack = new ItemStack(ItemRegistry.WISHING_FOUNTAIN_MAP.get());
            WFMapItem.setBiome(stack, biome);
            ItemEntity itemEntity = new ItemEntity(worldIn, pos.getX(), pos.getY()+1, pos.getZ(), stack);
            itemEntity.setDefaultPickUpDelay();
            server.addFreshEntity(itemEntity);
        }
    }

    @Override
    public boolean matches(WFRecipeInventory inv, Level worldIn) {
        List<ItemStack> inputs = new ArrayList();
        int i = 0;
        for(int j = 0; j < inv.getContainerSize(); ++j) {
            ItemStack itemstack = inv.getItem(j);
            if (!itemstack.isEmpty()) {
                ++i;
                inputs.add(itemstack);
            }
        }
        boolean var10000;
        label43: {
            if (i == this.ingredients.size()) {
                if (RecipeMatcher.findMatches(inputs, this.ingredients) != null) {
                    break label43;
                }
            }
            var10000 = false;
            return var10000;
        }
        var10000 = true;
        return var10000;
    }

    @Override
    public ItemStack assemble(WFRecipeInventory inv, RegistryAccess registryAccess) {
        return getResultItem(registryAccess).copy();
    }

    @Override
    public boolean canCraftInDimensions(int width, int height) {
        return false;
    }

    @Override
    public ItemStack getResultItem(RegistryAccess registryAccess) {
        ItemStack stack = new ItemStack(ItemRegistry.WISHING_FOUNTAIN_MAP.get());
        WFMapItem.setBiome(stack, biome);
        return stack;
    }

    @Override
    public ResourceLocation getId() {
        return this.id;
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return RecipeRegistry.WF_RECIPE_SERIALIZER.get();
    }

    @Override
    public RecipeType<?> getType() {
        return RecipeRegistry.WF_RECIPE_TYPE;
    }

    public String getBiome() {
        return this.biome;
    }
}
