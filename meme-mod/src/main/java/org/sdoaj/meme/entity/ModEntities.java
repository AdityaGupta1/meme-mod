package org.sdoaj.meme.entity;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.sdoaj.meme.Main;

public class ModEntities {
    public static void init() {
        int id = 1;

        EntityRegistry.registerModEntity(new ResourceLocation(Main.MODID + ":knuckles"),
                EntityKnuckles.class, "knuckles", id++, Main.instance, 64, 3,
                true, 0xD1161D, 0xDAA97E);
    }

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        RenderingRegistry.registerEntityRenderingHandler(EntityKnuckles.class, RenderKnuckles.FACTORY);
    }
}