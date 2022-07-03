package com.VinnieBeetle.principal.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {

    public static final CreativeModeTab Principal_Tab = new CreativeModeTab("principaltab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.Moissanite.get());
        }
    };
}
