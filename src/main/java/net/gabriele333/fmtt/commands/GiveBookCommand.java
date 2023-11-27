package net.gabriele333.fmtt.commands;

import com.mojang.brigadier.CommandDispatcher;
import net.gabriele333.fmtt.item.FMTTItems;
import net.minecraft.client.Minecraft;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import vazkii.patchouli.api.PatchouliAPI;



public class GiveBookCommand {
    public GiveBookCommand(CommandDispatcher<CommandSourceStack> dispatcher) {
        dispatcher.register(Commands.literal("fmtt").then(Commands.literal("book").executes((command) -> {
            return GiveBook(command.getSource());
        })));
    }

    private int GiveBook(CommandSourceStack source) {

        LocalPlayer player = Minecraft.getInstance().player;

        assert player != null;
        //player.addItem(new ItemStack(FMTTItems.FMTT_ITEM.get()));     Only for tests
        ItemStack patchouliBook = PatchouliAPI.get().getBookStack(new ResourceLocation("fmtt", "fmtt_book"));
        player.addItem(patchouliBook);

        return 1;
    }

}
