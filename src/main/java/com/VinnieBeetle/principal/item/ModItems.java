package com.VinnieBeetle.principal.item;

import com.VinnieBeetle.principal.PrincipalMod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

//under resources->assets->principal->lang the en_us.json is the translation key for item
//ITEM MODEL dagger parent essential generates, and extrudes the item in your minecraft hand
    //it calls to textures folder then inside of it to layer0, to (mod's) item png name
        //basically the directory, do you can do item/____/png name
public class ModItems {
    //DeferredRegister is like a list of items for forge to know it's under the mod
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, PrincipalMod.MOD_ID);
    //register the DeferredRegister

    //Item
    //(bus) is the name of item, no upper-cases or spaces and unique
    public static final RegistryObject<Item> Dagger = ITEMS.register("dagger",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> Moissanite = ITEMS.register("moissanite",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);

    }




}
