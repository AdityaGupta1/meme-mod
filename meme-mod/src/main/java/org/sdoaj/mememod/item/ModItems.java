package org.sdoaj.mememod.item;

import net.minecraft.item.Item;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.ArrayList;

public class ModItems {
    public static ArrayList<Item> items = new ArrayList<Item>();

    public static Item testItem;

    public static void initializeItems() {
        testItem = new BasicItem("testItem");
        items.add(testItem);
    }

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        for (Item item : items) {
            if (item instanceof BasicItem) {
                ((BasicItem) item).initModel();
            }
        }
    }
}
