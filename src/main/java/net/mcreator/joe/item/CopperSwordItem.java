
package net.mcreator.joe.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class CopperSwordItem extends SwordItem {
	public CopperSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 152;
			}

			public float getSpeed() {
				return 5f;
			}

			public float getAttackDamageBonus() {
				return -1f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 10;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Items.COPPER_INGOT));
			}
		}, 3, -3f, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT));
		setRegistryName("copper_sword");
	}
}
