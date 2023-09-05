package net.gabriele333.fmtt;

import net.gabriele333.fmtt.item.FMTTItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class FMTTCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, fmtt.MOD_ID);
    public static final RegistryObject<CreativeModeTab> fmtt_creative_tab = CREATIVE_MODE_TABS.register("fmtt_creative_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(FMTTItems.FMTT_ITEM.get()))
                    .title(Component.translatable("creativetab.fmtt_creative_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(FMTTItems.FMTT_ITEM.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
