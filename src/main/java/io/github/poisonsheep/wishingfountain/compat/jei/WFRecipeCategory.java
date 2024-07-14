package io.github.poisonsheep.wishingfountain.compat.jei;

import io.github.poisonsheep.wishingfountain.WishingFountain;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.gui.drawable.IDrawableStatic;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.RecipeType;
import mezz.jei.api.recipe.category.IRecipeCategory;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;

import java.util.Collections;
import java.util.List;

public class WFRecipeCategory implements IRecipeCategory<WFRecipeWrapper> {
    public static final RecipeType<WFRecipeWrapper> WISHING_FOUNTAIN = RecipeType.create(WishingFountain.MODID, "wishing_fountain", WFRecipeWrapper.class);
    private static final MutableComponent TITLE = Component.translatable("jei.wishing_fountain.wf_recipe.title");
    private static final ResourceLocation WF_ICON = new ResourceLocation(WishingFountain.MODID, "textures/gui/wishing_fountain_icon.png");
    protected static final ResourceLocation BACKGROUND = new ResourceLocation(WishingFountain.MODID, "textures/gui/sea.png");
    private final IDrawableStatic bgDraw;
    private final IDrawableStatic wfDraw;

    public WFRecipeCategory(IGuiHelper helper) {
        this.wfDraw = helper.drawableBuilder(WF_ICON, 0, 0, 16, 16).setTextureSize(16, 16).build();
        this.bgDraw = helper.drawableBuilder(BACKGROUND, 0, 0, 160, 125).setTextureSize(160, 125).build();
    }

    @Override
    public void setRecipe(IRecipeLayoutBuilder builder, WFRecipeWrapper recipe, IFocusGroup focuses) {
        List<List<ItemStack>> inputs = recipe.getInputs();
        ItemStack output = recipe.getOutput();
        // 8个位置的坐标，尽量像一个圆形
        int[][] positions = {{57, 20}, {84, 20}, {30, 56}, {114, 58}, {36, 85}, {115, 85}, {53, 98}, {99, 99}};
        for (int i = 0; i < positions.length; i++) {
            int[] pos = positions[i];
            builder.addSlot(RecipeIngredientRole.INPUT, pos[0], pos[1])
                    .addItemStacks(getInput(inputs, i));
        }
        builder.addSlot(RecipeIngredientRole.OUTPUT, 72, 70).addItemStack(output);
    }

    @Override
    public RecipeType<WFRecipeWrapper> getRecipeType() {
        return WISHING_FOUNTAIN;
    }

    @Override
    public Component getTitle() {
        return TITLE;
    }

    @Override
    public IDrawable getBackground() {
        return bgDraw;
    }

    @Override
    public IDrawable getIcon() {
        return wfDraw;
    }

    private List<ItemStack> getInput(List<List<ItemStack>> inputs, int index) {
        if (index < inputs.size()) {
            return inputs.get(index);
        }
        return Collections.singletonList(ItemStack.EMPTY);
    }
}
