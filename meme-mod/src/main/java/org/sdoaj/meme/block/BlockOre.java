package org.sdoaj.meme.block;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import java.util.HashMap;
import java.util.Random;

public class BlockOre extends BlockBasic {
    private HashMap<Item, int[]> drops;

    public BlockOre(String name, Material material, float hardness, float resistance, String toolClass, int harvestLevel, HashMap<Item, int[]> drops) {
        super(name, material, hardness, resistance, toolClass, harvestLevel);
        this.drops = drops;
    }

    @Override
    public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
        Random random = world instanceof World ? ((World) world).rand : RANDOM;

        for (Item item : this.drops.keySet()) {
            int min = this.drops.get(item)[0];
            int max = this.drops.get(item)[1];
            int amountToDrop = random.nextInt(max - min + 1) + min;

            for (int i = 0; i < amountToDrop; i++) {
                drops.add(new ItemStack(item));
            }
        }
    }
}
