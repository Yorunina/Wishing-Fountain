package io.github.poisonsheep.wishingfountain.registry;

import io.github.poisonsheep.wishingfountain.WishingFountain;
import io.github.poisonsheep.wishingfountain.tileentity.WFEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockEntityRegistry {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, WishingFountain.MODID);
    public static final RegistryObject<BlockEntityType<WFEntity>> WISHING_FOUNTAIN_ENTITY = BLOCK_ENTITY.register("wishing_fountain_entity", ()-> WFEntity.TYPE);
}
