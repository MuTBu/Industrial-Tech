package com.MuTBu.industrialtech.init;

import com.MuTBu.industrialtech.IndustrialTech;
import com.MuTBu.industrialtech.items.MaterialItem;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Items {
    public static  final DeferredRegister <Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, IndustrialTech.MOD_ID);

    public static final RegistryObject<Item> CITRINE = ITEMS.register("citrine", MaterialItem::new );



}
