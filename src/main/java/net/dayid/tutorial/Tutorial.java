package net.dayid.tutorial;

import net.dayid.tutorial.block.ModBlocks;
import net.dayid.tutorial.item.ModItemGroups;
import net.dayid.tutorial.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Tutorial implements ModInitializer {
	
	public static final String MOD_ID = "tutorial";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerBlocks();
	}
}