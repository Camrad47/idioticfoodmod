
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.rationsandfood.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.CreativeModeTabEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BetonsRationsAndFoodModTabs {
	@SubscribeEvent
	public static void buildTabContentsModded(CreativeModeTabEvent.Register event) {
		event.registerCreativeModeTab(new ResourceLocation("betons_rations_and_food", "brf_mtab"),
				builder -> builder.title(Component.translatable("item_group.betons_rations_and_food.brf_mtab")).icon(() -> new ItemStack(BetonsRationsAndFoodModItems.SPAM.get())).displayItems((parameters, tabData) -> {
					tabData.accept(BetonsRationsAndFoodModItems.BORSCHT.get());
					tabData.accept(BetonsRationsAndFoodModItems.SHASHLIK.get());
					tabData.accept(BetonsRationsAndFoodModItems.SHASLIKRAW.get());
					tabData.accept(BetonsRationsAndFoodModItems.SUSPICIOUS_SHASHLIK.get());
					tabData.accept(BetonsRationsAndFoodModItems.MOSNTER_SHASHLIK.get());
					tabData.accept(BetonsRationsAndFoodModItems.BURNEDFOOD.get());
					tabData.accept(BetonsRationsAndFoodModItems.BRFMMORTARNPESTLE.get());
					tabData.accept(BetonsRationsAndFoodModBlocks.PROCESSEDHAMBLOCK.get().asItem());
					tabData.accept(BetonsRationsAndFoodModItems.HAM_SLICE.get());
					tabData.accept(BetonsRationsAndFoodModItems.BFRMSALT.get());
					tabData.accept(BetonsRationsAndFoodModItems.FLOUR.get());
					tabData.accept(BetonsRationsAndFoodModItems.DOUGH.get());
					tabData.accept(BetonsRationsAndFoodModItems.CUP.get());
					tabData.accept(BetonsRationsAndFoodModItems.WATER_CUP.get());
					tabData.accept(BetonsRationsAndFoodModItems.STEEL_CAN.get());
					tabData.accept(BetonsRationsAndFoodModItems.GROUND_MEAT.get());
					tabData.accept(BetonsRationsAndFoodModItems.FRIKADELLE.get());
					tabData.accept(BetonsRationsAndFoodModItems.SPAM.get());
					tabData.accept(BetonsRationsAndFoodModItems.CANNED_MEAT.get());
					tabData.accept(BetonsRationsAndFoodModItems.CANNED_FISH.get());
					tabData.accept(BetonsRationsAndFoodModItems.CANNED_GREENS.get());
					tabData.accept(BetonsRationsAndFoodModItems.CANNED_BREAD.get());
					tabData.accept(BetonsRationsAndFoodModItems.CANNED_FRUIT.get());
					tabData.accept(BetonsRationsAndFoodModItems.CONDENSED_MILK.get());
					tabData.accept(BetonsRationsAndFoodModItems.GOULASH.get());
					tabData.accept(BetonsRationsAndFoodModItems.CHEESE.get());
					tabData.accept(BetonsRationsAndFoodModItems.CHEESE_SLICES.get());
					tabData.accept(BetonsRationsAndFoodModItems.BREAD_SLICE.get());
					tabData.accept(BetonsRationsAndFoodModItems.HAM_OPEN_SANDWICH.get());
					tabData.accept(BetonsRationsAndFoodModItems.CHEESE_OPEN_SANDWICH.get());
					tabData.accept(BetonsRationsAndFoodModItems.CHEESE_HAM_OPEN_SANDWICH.get());
					tabData.accept(BetonsRationsAndFoodModItems.BURGER_PATTY.get());
					tabData.accept(BetonsRationsAndFoodModItems.BURGER_HAM.get());
					tabData.accept(BetonsRationsAndFoodModItems.BURGER_PATTY_CHEESE.get());
					tabData.accept(BetonsRationsAndFoodModItems.BURGER_HAM_CHEESE.get());
					tabData.accept(BetonsRationsAndFoodModItems.CRACKERS.get());
					tabData.accept(BetonsRationsAndFoodModItems.CRACKER_PACK.get());
					tabData.accept(BetonsRationsAndFoodModItems.SMALL_RATION_TYPE_A.get());
					tabData.accept(BetonsRationsAndFoodModItems.SMALL_RATION_TYPE_B.get());
					tabData.accept(BetonsRationsAndFoodModItems.SMALL_RATION_TYPE_C.get());
					tabData.accept(BetonsRationsAndFoodModItems.SMALL_RATION_TYPE_D.get());
					tabData.accept(BetonsRationsAndFoodModItems.BIG_RATION_TYPE_A.get());
					tabData.accept(BetonsRationsAndFoodModItems.BIG_RATION_TYPE_B.get());
					tabData.accept(BetonsRationsAndFoodModItems.BIG_RATION_TYPE_C.get());
					tabData.accept(BetonsRationsAndFoodModItems.BIG_RATION_TYPE_D.get());
					tabData.accept(BetonsRationsAndFoodModItems.CHOCOLATE_BAR.get());
					tabData.accept(BetonsRationsAndFoodModItems.CARTBOARD_BOX.get());
					tabData.accept(BetonsRationsAndFoodModItems.BOX_O_CHOCOLATE.get());
					tabData.accept(BetonsRationsAndFoodModItems.BOX_O_CRACKERS.get());
					tabData.accept(BetonsRationsAndFoodModItems.BOX_O_CANNED_MEAT.get());
					tabData.accept(BetonsRationsAndFoodModItems.BOX_O_CANNED_FISH.get());
					tabData.accept(BetonsRationsAndFoodModItems.BOX_O_CANNED_GREENS.get());
					tabData.accept(BetonsRationsAndFoodModItems.BOX_O_CANNED_BREAD.get());
					tabData.accept(BetonsRationsAndFoodModItems.BOX_O_CANNED_FRUIT.get());
					tabData.accept(BetonsRationsAndFoodModItems.BOX_O_CANNED_SPAM.get());
					tabData.accept(BetonsRationsAndFoodModItems.BOX_O_CONDENSED_MILK.get());
					tabData.accept(BetonsRationsAndFoodModItems.FRIED_EGGS.get());
					tabData.accept(BetonsRationsAndFoodModItems.OMELETTE.get());
					tabData.accept(BetonsRationsAndFoodModItems.OMELETTE_RAW.get());
					tabData.accept(BetonsRationsAndFoodModItems.CHEBUREK_RAW.get());
					tabData.accept(BetonsRationsAndFoodModItems.CHEBUREK.get());
					tabData.accept(BetonsRationsAndFoodModItems.OIL.get());
				})

		);
	}
}
