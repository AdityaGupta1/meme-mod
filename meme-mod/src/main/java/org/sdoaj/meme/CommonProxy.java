package org.sdoaj.meme;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;
import org.sdoaj.meme.block.ModBlocks;
import org.sdoaj.meme.item.ModItems;

import java.util.ArrayList;

@Mod.EventBusSubscriber
public class CommonProxy {
    public void preInit(FMLPreInitializationEvent event) {

    }

    public void init(FMLInitializationEvent event) {

    }

    public void postInit(FMLPostInitializationEvent event) {

    }

    private static ArrayList<Block> blocks = new ArrayList<Block>();

    private static void registerBlock(Block block, IForgeRegistry<Block> registry) {
        registry.register(block);
        blocks.add(block);
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        IForgeRegistry<Block> registry = event.getRegistry();

        registerBlock(ModBlocks.meme_machine, registry);
        registerBlock(ModBlocks.meme_ore, registry);
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        IForgeRegistry<Item> registry = event.getRegistry();

        registerItemBlocks(registry);

        registry.register(ModItems.thonk);
        registry.register(ModItems.lesser_meme_essence);
        registry.register(ModItems.greater_meme_essence);
    }

    private static void registerItemBlocks(IForgeRegistry<Item> registry) {
        System.out.println(blocks);

        for (Block block : blocks) {
            registry.register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
        }
    }
}


