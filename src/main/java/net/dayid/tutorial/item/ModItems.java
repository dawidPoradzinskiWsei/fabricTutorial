package net.dayid.tutorial.item;

import net.dayid.tutorial.Tutorial;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    
    // 1. stworzenie nowego przedmiotu
    public static final Item RUBY = registerItem("ruby", new Item(new FabricItemSettings()));
    public static final Item RAW_RUBY = registerItem("raw_ruby", new Item(new FabricItemSettings()));

    // 2. Stworzenie funkcji dodajacej itemy do danej grupy
    private static void addItemsToingredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(RUBY);
        entries.add(RAW_RUBY);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Tutorial.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Tutorial.LOGGER.info("Registering Mod Items for " + Tutorial.MOD_ID);
        // 3. Przypisanie itemow z funkcju 2 do konkretnej grupy
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToingredientItemGroup);
    }
}
