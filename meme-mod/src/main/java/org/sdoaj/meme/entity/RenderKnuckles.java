package org.sdoaj.meme.entity;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

import javax.annotation.Nonnull;

public class RenderKnuckles extends RenderLiving<EntityKnuckles> {
    private ResourceLocation mobTexture = new ResourceLocation("meme:textures/entity/knuckles.png");

    public static final Factory FACTORY = new Factory();

    public RenderKnuckles(RenderManager manager) {
        super(manager, new ModelKnuckles(), 0.5F);
    }

    @Override
    @Nonnull
    protected ResourceLocation getEntityTexture(@Nonnull EntityKnuckles entity) {
        return mobTexture;
    }

    public static class Factory implements IRenderFactory<EntityKnuckles> {
        @Override
        public Render<? super EntityKnuckles> createRenderFor(RenderManager manager) {
            return new RenderKnuckles(manager);
        }
    }
}