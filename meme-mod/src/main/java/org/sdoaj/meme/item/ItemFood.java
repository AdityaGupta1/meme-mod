package org.sdoaj.meme.item;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.sdoaj.meme.misc.ModCreativeTabs;

import java.util.HashMap;

public class ItemFood extends net.minecraft.item.ItemFood {
    private HashMap<PotionEffect, Float> effects;

    public ItemFood(String name, int amount, float saturation, boolean isWolfFood, boolean alwaysEdible) {
        super(amount, saturation, isWolfFood);
        if (alwaysEdible) {
            setAlwaysEdible();
        }

        setRegistryName(name);
        setUnlocalizedName(name);
        setCreativeTab(ModCreativeTabs.tabMeme);
    }

    public ItemFood(String name, int amount, float saturation, boolean isWolfFood, boolean alwaysEdible, HashMap<PotionEffect, Float> effects) {
        this(name, amount, saturation, isWolfFood, alwaysEdible);
        this.effects = effects;
    }

    protected void onFoodEaten(ItemStack stack, World world, EntityPlayer player) {
        if (!world.isRemote && effects != null) {
            for (PotionEffect effect : effects.keySet()) {
                if (world.rand.nextFloat() < effects.get(effect)) {
                    player.addPotionEffect(new PotionEffect(effect));
                }
            }
        }
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}
