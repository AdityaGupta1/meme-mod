package org.sdoaj.meme;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.sdoaj.meme.proxy.CommonProxy;

@Mod(modid = Main.MODID, name = Main.MODNAME, version = Main.VERSION, useMetadata = true)
public class Main {

    public static final String MODID = "meme";
    public static final String MODNAME = "Meme Mod";
    public static final String VERSION = "1.12.x-0.1";

    @SidedProxy(clientSide = "org.sdoaj.meme.proxy.ClientProxy", serverSide = "org.sdoaj.meme.proxy.ServerProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static Main instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }
}