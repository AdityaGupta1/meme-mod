package org.sdoaj.meme.item;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModItems {
    public static ItemBasic thonk = new ItemBasic("thonk");
    public static ItemBasic lesser_meme_essence = new ItemBasic("lesser_meme_essence");
    public static ItemBasic greater_meme_essence = new ItemBasic("greater_meme_essence");

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        thonk.initModel();
        lesser_meme_essence.initModel();
        greater_meme_essence.initModel();
    }
}
