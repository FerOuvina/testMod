package net.khaii.testmod.item;

import net.khaii.testmod.TestMod;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = TestMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTabs {
	public static CreativeModeTab ALTA_TAB;

	@SubscribeEvent
	public static void RegisterCreativeModeTabs (CreativeModeTabEvent.Register event) {
		ALTA_TAB = event.registerCreativeModeTab(new ResourceLocation(TestMod.MOD_ID, "alta_tab"),
						builder -> builder.icon(() -> new ItemStack(ModItems.ALTOITEM.get()))
										.title(Component.translatable("creativemodetab.alta_tab")));
	}
}
