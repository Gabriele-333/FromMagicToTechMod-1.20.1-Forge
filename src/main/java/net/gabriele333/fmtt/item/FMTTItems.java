package net.gabriele333.fmtt.item;

import net.gabriele333.fmtt.fmtt;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class FMTTItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, fmtt.MOD_ID);
    public static final RegistryObject<Item> FMTT_ITEM = ITEMS.register("fmtt_item",
            ()-> new Item(new Item.Properties())
    );


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
