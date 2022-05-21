
package net.mcreator.barrymod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.barrymod.itemgroup.BarryModItemGroup;
import net.mcreator.barrymod.BarrymodModElements;

@BarrymodModElements.ModElement.Tag
public class RobucOreItem extends BarrymodModElements.ModElement {
	@ObjectHolder("barrymod:robuc_ore")
	public static final Item block = null;

	public RobucOreItem(BarrymodModElements instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(BarryModItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("robuc_ore");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
