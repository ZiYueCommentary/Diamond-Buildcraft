package com.ziyue.diamond;

import com.ziyue.diamond.lists.BlockList;
import com.ziyue.diamond.lists.PaintingList;
import com.ziyue.diamond.world.biome.DiamondLandType;
import com.ziyue.diamond.world.gen.DryDiamondOreGen;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.world.WorldType;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.stream.Collectors;

/**
 * @author ZiYueCommentary
 */

@Mod(Main.MOD_ID)
public class Main
{
    public static final Logger LOGGER = LogManager.getLogger();
    public static Main instance;
    public static final String MOD_ID = "diamond";
    public static final WorldType DIAMOND_LAND_TYPE = new DiamondLandType();

    public Main()
    {
        instance = this;

        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::enqueueIMC);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::processIMC);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);
        MinecraftForge.EVENT_BUS.register(this);
        PaintingList.PAINTING_TYPE.register(modEventBus);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        DryDiamondOreGen.generate();
    }

    private void clientSetup(final FMLClientSetupEvent event)
    {
        RenderTypeLookup.setRenderLayer(BlockList.dry_diamond_door.getBlock(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockList.diamond_door.getBlock(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockList.diamond_ladder.getBlock(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockList.dry_diamond_ladder.getBlock(), RenderType.getCutout());
        //在部分视频教学中，此处为.get()，但似乎存在问题
        //你可以适用.getBlock()来解决问题，例如本模组
    }

    private void onServerStarting(FMLServerStartingEvent event)
    {

    }

    private void enqueueIMC(final InterModEnqueueEvent event)
    {
        LOGGER.info("Hello from Diamond Buildcraft!");
    }

    private void processIMC(final InterModProcessEvent event)
    {
        LOGGER.info("Got IMC {}", event.getIMCStream().
                map(m->m.getMessageSupplier().get()).
                collect(Collectors.toList()));
    }

    @Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> blockRegistryEvent) {
        }
    }
}
