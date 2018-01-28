package org.sdoaj.meme.item;

import net.minecraft.init.MobEffects;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.HashMap;

public class ModItems {
    public static ItemBasic thonk = new ItemBasic("thonk");
    public static ItemBasic lesser_meme_essence = new ItemBasic("lesser_meme_essence");
    public static ItemBasic greater_meme_essence = new ItemBasic("greater_meme_essence");
    public static ItemFood tide_pod = new ItemFood("tide_pod", 1, 0.1f, false,
            true, new HashMap<PotionEffect, Float>() {{
                put(new PotionEffect(MobEffects.NAUSEA, 1000000, 100), 1f);
                put(new PotionEffect(MobEffects.HUNGER, 1000000, 100), 1f);
                put(new PotionEffect(MobEffects.POISON, 1000000, 100), 1f);
                put(new PotionEffect(MobEffects.WITHER, 1000000, 100), 1f);
            }});

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        thonk.initModel();
        lesser_meme_essence.initModel();
        greater_meme_essence.initModel();
        tide_pod.initModel();
    }
}
