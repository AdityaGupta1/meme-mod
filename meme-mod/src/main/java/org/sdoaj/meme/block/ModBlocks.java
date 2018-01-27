package org.sdoaj.meme.block;

import net.minecraft.block.material.Material;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModBlocks {
    public static BasicBlock meme_machine = new BasicBlock("meme_machine", Material.IRON);
    public static BasicBlock meme_ore = new BasicBlock("meme_ore", Material.ROCK);

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        meme_machine.initModel();
        meme_ore.initModel();
    }
}
