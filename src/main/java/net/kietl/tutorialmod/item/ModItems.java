package net.kietl.tutorialmod.item;

import net.kietl.tutorialmod.TutorialMod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);


    public static final RegistryObject<Item> Jesium = ITEMS.register("jesium",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_TRANSPORTATION)));
    public static final RegistryObject<Item> Raw_Jesium = ITEMS.register("Raw_jesium",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_TRANSPORTATION)));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);

    }
}
