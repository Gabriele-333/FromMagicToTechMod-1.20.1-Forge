package net.gabriele333.fmtt.event;

import net.gabriele333.fmtt.commands.GiveBookCommand;
import net.gabriele333.fmtt.config.FMTTConfig;
import net.gabriele333.fmtt.fmtt;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.animal.Sheep;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.event.entity.EntityJoinLevelEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.server.command.ConfigCommand;

public class ModEvents {

    @Mod.EventBusSubscriber(modid = fmtt.MOD_ID)
    public static class ForgeEvents {

        @SubscribeEvent
        public static void onPlayerJoin(EntityJoinLevelEvent event) {
            if (event.getEntity() instanceof Player player) {
                if (FMTTConfig.integer.get() != 2) {
                    player.sendSystemMessage(Component.literal("hi"));

                }


            }
        }

        /*@SubscribeEvent
        public static void onLivingHurt(LivingHurtEvent event) {
            if(event.getEntity() instanceof Sheep) {
                if(event.getSource().getEntity() instanceof Player player) {
                    if(player.getMainHandItem().getItem() == Items.BEEF) {
                        player.sendSystemMessage(Component.literal(player.getName().getString() + " hurt a Sheep with BEEF! But why?"));
                        player.addItem(new ItemStack(Items.BEEF));

                    } else {
                        player.sendSystemMessage(Component.literal(player.getName().getString() + " hurt a Sheep!"));
                    }
                }
            }
        }
*/
        @SubscribeEvent
        public static void onCommandsRegister(RegisterCommandsEvent event) {
            new GiveBookCommand(event.getDispatcher());
            ConfigCommand.register(event.getDispatcher());
        }
    }

}
