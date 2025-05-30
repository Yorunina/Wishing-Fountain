package io.github.poisonsheep.wishingfountain.loot;

import com.mojang.serialization.Codec;
import io.github.poisonsheep.wishingfountain.WishingFountain;
import net.minecraftforge.common.loot.IGlobalLootModifier;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModGlobalLootModifiers {
    public static final DeferredRegister<Codec<? extends IGlobalLootModifier>> GLM = DeferredRegister.create(ForgeRegistries.Keys.GLOBAL_LOOT_MODIFIER_SERIALIZERS, WishingFountain.MODID);

    public static final RegistryObject<Codec<? extends IGlobalLootModifier>> ADD_ITEM_MODIFIER = GLM.register("add_item_modifier", AddItemModifier.CODEC);
}
