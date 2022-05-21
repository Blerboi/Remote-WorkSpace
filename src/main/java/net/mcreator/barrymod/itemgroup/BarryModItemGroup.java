
package net.mcreator.barrymod.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.barrymod.item.RobucOreItem;
import net.mcreator.barrymod.BarrymodModElements;

@BarrymodModElements.ModElement.Tag
public class BarryModItemGroup extends BarrymodModElements.ModElement {
	public BarryModItemGroup(BarrymodModElements instance) {
		super(instance, 4);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabbarry_mod") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(RobucOreItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;
}
