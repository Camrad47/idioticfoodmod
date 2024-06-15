
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.rationsandfood.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.rationsandfood.block.ProcessedhamblockBlock;
import net.mcreator.rationsandfood.BetonsRationsAndFoodMod;

public class BetonsRationsAndFoodModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, BetonsRationsAndFoodMod.MODID);
	public static final RegistryObject<Block> PROCESSEDHAMBLOCK = REGISTRY.register("processedhamblock", () -> new ProcessedhamblockBlock());
}
