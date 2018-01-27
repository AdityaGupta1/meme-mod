package org.sdoaj.meme.block;

import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.sdoaj.meme.item.ModItems;

import java.util.HashMap;

public class ModBlocks {
    public static BlockBasic meme_machine = new BlockBasic("meme_machine", Material.IRON, 3, 20, "pickaxe", 3);
    public static BlockBasic meme_ore = new BlockOre("meme_ore", Material.ROCK, 4, 25, "pickaxe", 3, new HashMap<Item, int[]>() {{
        put(ModItems.lesser_meme_essence, new int[]{2, 5});
        put(ModItems.greater_meme_essence, new int[]{0, 2});
    }});

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        meme_machine.initModel();
        meme_ore.initModel();
    }
}
