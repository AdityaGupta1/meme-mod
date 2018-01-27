package org.sdoaj.meme.item;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModItems {
    public static BasicItem thonk = new BasicItem("thonk");

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        thonk.initModel();
    }
}
