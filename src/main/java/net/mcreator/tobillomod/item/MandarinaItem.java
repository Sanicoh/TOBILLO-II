package net.mcreator.tobillomod.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class MandarinaItem extends RecordItem {
	public MandarinaItem() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("tobillomod_2:mandarina")), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 1660);
	}
}