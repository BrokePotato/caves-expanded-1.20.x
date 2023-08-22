package net.asher.cavesexpanded;

import net.asher.cavesexpanded.block.ModBlocks;
import net.asher.cavesexpanded.item.ModItemGroups;
import net.asher.cavesexpanded.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CavesExpanded implements ModInitializer {
	public static  final  String MOD_ID = "cavesexpanded";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}