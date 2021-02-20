package com.example.examplemod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import com.example.examplemod.ExampleMod;
import net.minecraft.item.ItemSword;

public class CustomSword extends ItemSword {
    public CustomSword() {
        super(ExampleMod.myToolMaterial);
        this.setRegistryName("customSword");
        this.setUnlocalizedName("customSword");
        this.setCreativeTab(CreativeTabs.COMBAT);
    }
}
