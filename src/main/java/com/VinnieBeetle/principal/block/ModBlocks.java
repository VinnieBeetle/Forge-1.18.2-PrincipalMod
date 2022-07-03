package com.VinnieBeetle.principal.block;

import com.VinnieBeetle.principal.PrincipalMod;
import com.VinnieBeetle.principal.item.ModCreativeModeTab;
import com.VinnieBeetle.principal.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

//blockstate json file defines what model to look at to display it in the world
//  in this case it points to underneath block folder, moissanite_block (the model)
//block model defines the texture and how its displayed
//then item model for when its in inventory, its parent is the block models.json

//cube all means they look the same on all sides

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, PrincipalMod.MOD_ID);

    public static final RegistryObject<Block> Moissanite_Block = registerBlock("moissanite_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.Principal_Tab);

    public static final RegistryObject<Block> Moissanite_Ore = registerBlock("moissanite_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(7f).requiresCorrectToolForDrops()), ModCreativeModeTab.Principal_Tab);

    //this is registering the block
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    //registers an item associated with a block - using generics and puting it into the creative tab
    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                           CreativeModeTab tab){
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }

    public static void register (IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
