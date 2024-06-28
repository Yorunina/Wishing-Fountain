package io.github.poisonsheep.wishingfountain;


import io.github.poisonsheep.wishingfountain.block.multiblock.MultiBlockManager;
import io.github.poisonsheep.wishingfountain.event.ForgeEvent;
import io.github.poisonsheep.wishingfountain.registry.BlockEntityRegistry;
import io.github.poisonsheep.wishingfountain.registry.BlockRegistry;
import io.github.poisonsheep.wishingfountain.registry.ItemRegistry;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(WishingFountain.MODID)
public class WishingFountain {
    public static final IEventBus modBusEvent = FMLJavaModLoadingContext.get().getModEventBus();

    public final static String MODID = "wishing_fountain";
    public static final String VERSION = "1.20.1-1.0.0";

    public WishingFountain(){
        MinecraftForge.EVENT_BUS.register(new ForgeEvent());
        modBusEvent.addListener(this::setup);
        modBusEvent.addListener(this::enqueueIMC);
        modBusEvent.addListener(this::processIMC);
        MinecraftForge.EVENT_BUS.register(this);
        ItemRegistry.ITEMS.register(modBusEvent);
        BlockRegistry.BLOCKS.register(modBusEvent);
        BlockEntityRegistry.BLOCK_ENTITY.register(modBusEvent);
    }
    private void setup(final FMLCommonSetupEvent event) {}

    private void enqueueIMC(final InterModEnqueueEvent event) {}

    private void processIMC(final InterModProcessEvent event) {}

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        MultiBlockManager.init();
    }
}
