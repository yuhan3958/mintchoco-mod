package me.yuhany.mintchoco;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ExampleMod implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LogManager.getLogger("modid");
	public static final Item FABRIC_ITEM = new Item(new FabricItemSettings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(16).saturationModifier(10f).statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 999999999, 50), 1f).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 999999999, 50), 1f).statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 999999999, 50), 1f).build()));

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Hello Fabric world!");
		Registry.register(Registry.ITEM, new Identifier("mintchoco", "mintchoco"), FABRIC_ITEM);
	}
}
