package com.authorname.modid.proxy;

import com.authorname.modid.MainModClass;
import com.authorname.modid.blocks.ModBlocks;
import com.authorname.modid.client.render.IHasModel;
import com.authorname.modid.items.ModItems;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {
    public void registerItemRenderer(Item item, int meta, String id)
    {

    }


    public void preInit(FMLPreInitializationEvent event)
    {

    }

    public void init(FMLInitializationEvent event)
    {
        // some example code
        MainModClass.info(String.format("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName()));
    }

    public void registerBlocks(RegistryEvent.Register<Block> event)
    {
        event.getRegistry().registerAll(ModBlocks.BLOCKS.toArray(new Block[0]));
        MainModClass.info("Registered blocks.");
    }

    public void registerItems(RegistryEvent.Register<Item> event)
    {
        event.getRegistry().registerAll(ModItems.ITEMS.toArray(new Item[0]));
        MainModClass.info("Registered items.");
    }

    public void registerModels(ModelRegistryEvent event)
    {
        for (Block block : ModBlocks.BLOCKS) {
            if (block instanceof IHasModel)
            {
                ((IHasModel) block).registerModels();
            }
        }
        for (Item item : ModItems.ITEMS) {
            if (item instanceof IHasModel)
            {
                ((IHasModel) item).registerModels();
            }
        }
    }
}
