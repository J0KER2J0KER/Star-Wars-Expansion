
package net.mcreator.starwarsexpansion.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class CantinaMusicItem extends RecordItem {
	public CantinaMusicItem() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("star_wars_expansion:cantina_music")), new Item.Properties().stacksTo(1).rarity(Rarity.UNCOMMON), 240);
	}
}
