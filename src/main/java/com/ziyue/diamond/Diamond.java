package com.ziyue.diamond;

import com.ziyue.diamond.proxy.CommonProxy;
import com.ziyue.diamond.recipes.CraftingRecipes;
import com.ziyue.diamond.recipes.SmeltingRecipes;
import com.ziyue.diamond.util.Reference;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class Diamond
{
    @Instance
    public static Diamond instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
    public static CommonProxy proxy;

    private static Logger logger;

    @EventHandler
    public void PreInit(FMLPreInitializationEvent event)
    {
    }

    @EventHandler
    public void Init(FMLInitializationEvent event)
    {
        SmeltingRecipes.init();
        CraftingRecipes.init();
    }

    @EventHandler
    public void PostInit(FMLPostInitializationEvent event)
    {
    }
}
