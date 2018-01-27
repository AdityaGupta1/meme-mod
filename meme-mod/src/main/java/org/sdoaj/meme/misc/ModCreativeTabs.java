package org.sdoaj.meme.misc;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import org.sdoaj.meme.item.ModItems;

public class ModCreativeTabs {
    public static final CreativeTabs tabMeme = (new CreativeTabs("tabMeme") {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(ModItems.thonk);
        }
    });
}
