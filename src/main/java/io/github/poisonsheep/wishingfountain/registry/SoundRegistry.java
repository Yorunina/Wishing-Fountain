package io.github.poisonsheep.wishingfountain.registry;

import io.github.poisonsheep.wishingfountain.WishingFountain;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class SoundRegistry {
    public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, WishingFountain.MODID);

    public static final RegistryObject<SoundEvent> BUILD = register("wishing_fountain_build");

    protected static RegistryObject<SoundEvent> register(String key) {
        return SOUNDS.register(key, () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(WishingFountain.MODID, key)));
    }
}
