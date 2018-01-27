package org.sdoaj.meme.item;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModItems {
    public static BasicItem thonk = new BasicItem("thonk");
    public static BasicItem lesser_meme_essence = new BasicItem("lesser_meme_essence");
    public static BasicItem greater_meme_essence = new BasicItem("greater_meme_essence");

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        thonk.initModel();
        lesser_meme_essence.initModel();
        greater_meme_essence.initModel();
    }
}
