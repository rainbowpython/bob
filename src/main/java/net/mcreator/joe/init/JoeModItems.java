
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.joe.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.item.Item;

import net.mcreator.joe.item.JoearmorArmorItem;
import net.mcreator.joe.item.JoeItem;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class JoeModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item JOE = register(new JoeItem());
	public static final Item JOEARMOR_ARMOR_HELMET = register(new JoearmorArmorItem.Helmet());
	public static final Item JOEARMOR_ARMOR_CHESTPLATE = register(new JoearmorArmorItem.Chestplate());
	public static final Item JOEARMOR_ARMOR_LEGGINGS = register(new JoearmorArmorItem.Leggings());
	public static final Item JOEARMOR_ARMOR_BOOTS = register(new JoearmorArmorItem.Boots());

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
