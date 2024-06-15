package net.mcreator.rationsandfood.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.rationsandfood.init.BetonsRationsAndFoodModItems;

public class CupRightclickedProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double localRaytraceDistance = 0;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == BetonsRationsAndFoodModItems.CUP.get()) {
			localRaytraceDistance = 0.5;
			for (int index0 = 0; index0 < 5; index0++) {
				if ((world
						.getFluidState(
								new BlockPos(
										entity.level
												.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(localRaytraceDistance)), ClipContext.Block.OUTLINE, ClipContext.Fluid.ANY,
														entity))
												.getBlockPos().getX(),
										entity.level
												.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(
														1f).add(
																entity.getViewVector(1f).scale(localRaytraceDistance)),
														ClipContext.Block.OUTLINE, ClipContext.Fluid.ANY, entity))
												.getBlockPos().getY(),
										entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(localRaytraceDistance)), ClipContext.Block.OUTLINE, ClipContext.Fluid.ANY, entity))
												.getBlockPos().getZ()))
						.createLegacyBlock()).getFluidState().isSource() == true
						&& ((world.getFluidState(new BlockPos(
								entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(localRaytraceDistance)), ClipContext.Block.OUTLINE, ClipContext.Fluid.ANY, entity))
										.getBlockPos().getX(),
								entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(localRaytraceDistance)), ClipContext.Block.OUTLINE, ClipContext.Fluid.ANY, entity))
										.getBlockPos().getY(),
								entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(localRaytraceDistance)), ClipContext.Block.OUTLINE, ClipContext.Fluid.ANY, entity))
										.getBlockPos().getZ()))
								.createLegacyBlock()).getBlock() == Blocks.WATER
								|| (world.getFluidState(new BlockPos(
										entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(localRaytraceDistance)), ClipContext.Block.OUTLINE, ClipContext.Fluid.ANY, entity))
												.getBlockPos().getX(),
										entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(localRaytraceDistance)), ClipContext.Block.OUTLINE, ClipContext.Fluid.ANY, entity))
												.getBlockPos().getY(),
										entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(localRaytraceDistance)), ClipContext.Block.OUTLINE, ClipContext.Fluid.ANY, entity))
												.getBlockPos().getZ()))
										.createLegacyBlock()).getBlock() == Blocks.WATER)) {
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.MAIN_HAND, true);
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null,
									new BlockPos(
											entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(localRaytraceDistance)), ClipContext.Block.OUTLINE, ClipContext.Fluid.ANY, entity))
													.getBlockPos().getX(),
											entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(localRaytraceDistance)), ClipContext.Block.OUTLINE, ClipContext.Fluid.ANY, entity))
													.getBlockPos().getY(),
											entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(localRaytraceDistance)), ClipContext.Block.OUTLINE, ClipContext.Fluid.ANY, entity))
													.getBlockPos().getZ()),
									ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.bucket.fill")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(
									(entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(localRaytraceDistance)), ClipContext.Block.OUTLINE, ClipContext.Fluid.ANY, entity))
											.getBlockPos().getX()),
									(entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(localRaytraceDistance)), ClipContext.Block.OUTLINE, ClipContext.Fluid.ANY, entity))
											.getBlockPos().getY()),
									(entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(localRaytraceDistance)), ClipContext.Block.OUTLINE, ClipContext.Fluid.ANY, entity))
											.getBlockPos().getZ()),
									ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.bucket.fill")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(BetonsRationsAndFoodModItems.CUP.get());
						_setstack.setCount((int) ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount() - 1));
						_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(BetonsRationsAndFoodModItems.WATER_CUP.get());
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
					break;
				}
				localRaytraceDistance = localRaytraceDistance + 1;
			}
		}
	}
}
