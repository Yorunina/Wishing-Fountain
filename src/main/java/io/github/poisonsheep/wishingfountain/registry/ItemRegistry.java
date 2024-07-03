package io.github.poisonsheep.wishingfountain.registry;

import io.github.poisonsheep.wishingfountain.WishingFountain;
import io.github.poisonsheep.wishingfountain.item.WFMapItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, WishingFountain.MODID);
    public static final RegistryObject<Item> WISHING_FOUNTAIN_MAP = ITEMS.register("wishing_fountain_map", WFMapItem::new);
}
