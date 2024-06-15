
/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package net.mcreator.rationsandfood.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.WandererTradesEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicItemListing;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.npc.VillagerProfession;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class BetonsRationsAndFoodModTrades {
	@SubscribeEvent
	public static void registerWanderingTrades(WandererTradesEvent event) {
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD),

				new ItemStack(BetonsRationsAndFoodModItems.BFRMSALT.get(), 6), 5, 5, 0.1f));
	}

	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == VillagerProfession.BUTCHER) {
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.EMERALD),

					new ItemStack(BetonsRationsAndFoodModItems.BFRMSALT.get(), 6), 10, 3, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.SUGAR, 2),

					new ItemStack(BetonsRationsAndFoodModItems.BFRMSALT.get()), 10, 2, 0.2f));
		}
	}
}
