package io.github.poisonsheep.wishingfountain.registry;

import io.github.poisonsheep.wishingfountain.WishingFountain;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(modid = WishingFountain.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class TabRegistry {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, WishingFountain.MODID);
    public static final RegistryObject<CreativeModeTab> BLUEPRINT_TAB = TABS.register("wishing_fountain", () -> CreativeModeTab.builder()
            .icon(() -> new ItemStack(ItemRegistry.WF_STRUCTURE_MAP.get()))
            .title(Component.translatable("itemGroup.wishing_fountain.main"))
            .build());

    @SubscribeEvent
    public static void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTab() == TabRegistry.BLUEPRINT_TAB.get()) {
            event.accept(new ItemStack(ItemRegistry.WF_STRUCTURE_MAP.get()));
            event.accept(new ItemStack(ItemRegistry.WF_BIOME_MAP.get()));
            event.accept(new ItemStack(ItemRegistry.MONOKUMA_HARD_DISK.get()));
            event.accept(new ItemStack(ItemRegistry.NEPS_DECORATION.get()));
        }
    }
}
