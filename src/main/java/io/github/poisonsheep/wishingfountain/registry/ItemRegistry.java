package io.github.poisonsheep.wishingfountain.registry;

import io.github.poisonsheep.wishingfountain.WishingFountain;
import io.github.poisonsheep.wishingfountain.item.MonokumaHardDiskItem;
import io.github.poisonsheep.wishingfountain.item.WFBiomeMapItem;
import io.github.poisonsheep.wishingfountain.item.WFStructureMap;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, WishingFountain.MODID);
    public static final RegistryObject<Item> WF_BIOME_MAP = ITEMS.register("wf_biome_map", WFBiomeMapItem::new);
    public static final RegistryObject<Item> WF_STRUCTURE_MAP = ITEMS.register("wf_structure_map", WFStructureMap::new);
    public static final RegistryObject<Item> MONOKUMA_HARD_DISK = ITEMS.register("monokuma_hard_disk", MonokumaHardDiskItem::new);
}
