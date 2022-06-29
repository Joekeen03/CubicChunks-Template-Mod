package com.authorname.modid;

import com.authorname.modid.proxy.CommonProxy;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(modid = MainModClass.MODID, name = MainModClass.NAME, version = MainModClass.VERSION,
dependencies = "required:cubicchunks@[0.0.1244.0,)")
public class MainModClass
{
    public static final String MODID = "modid";
    public static final String NAME = "Example CC Mod";
    public static final String VERSION = "0.0.1";
    public static final String packageName = "com.authorname.modid";

    private static Logger logger;

    @Mod.Instance
    public static MainModClass instance;

    @SidedProxy (clientSide=packageName+".proxy.ClientProxy", serverSide=packageName+".proxy.CommonProxy")
    public static CommonProxy proxy;

    public MainModClass()
    {
        MinecraftForge.EVENT_BUS.register(this);
        logger = LogManager.getLogger(NAME);
    }

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init(event);
    }

    @SubscribeEvent
    public void registerBlocks(RegistryEvent.Register<Block> event)
    {
        proxy.registerBlocks(event);
    }

    @SubscribeEvent
    public void registerItems(RegistryEvent.Register<Item> event)
    {
        proxy.registerItems(event);
    }

    @SubscribeEvent
    public void registerModels(ModelRegistryEvent event)
    {
        proxy.registerModels(event);
    }

    public static void info(String message) {
        logger.info(message);
    }

    public static void debug(String message) {
        logger.debug(message);
    }

    public static void error(String message) {
        logger.error(message);
    }

    public static void fatal(String message) {
        logger.fatal(message);
    }

    public static void warn(String message) {
        logger.warn(message);
    }
}
