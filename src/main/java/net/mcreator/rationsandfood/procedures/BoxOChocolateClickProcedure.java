package net.mcreator.rationsandfood.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;

import net.mcreator.rationsandfood.init.BetonsRationsAndFoodModItems;

public class BoxOChocolateClickProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == BetonsRationsAndFoodModItems.BOX_O_CHOCOLATE.get()) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(BetonsRationsAndFoodModItems.BOX_O_CHOCOLATE.get());
				_setstack.setCount((int) (itemstack.getCount() - 1));
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(BetonsRationsAndFoodModItems.CHOCOLATE_BAR.get());
				_setstack.setCount(8);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(BetonsRationsAndFoodModItems.CARTBOARD_BOX.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		}
	}
}
