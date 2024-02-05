package net.dayid.tutorial.item;

import net.dayid.tutorial.Tutorial;
import net.dayid.tutorial.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    

    // tworzenie grupy ruby
    public static final ItemGroup RUBY_GROUP = Registry.register(
        Registries.ITEM_GROUP,
        new Identifier(Tutorial.MOD_ID, "ruby"),
        FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ruby"))
        .icon(
            () -> new ItemStack(ModItems.RUBY)).entries(
                (displayContext, entires) -> {
                    entires.add(ModItems.RUBY);
                    entires.add(ModItems.RAW_RUBY);
                    entires.add(Items.DIAMOND);
                    entires.add(ModBlocks.RUBY_BLOCK);
                    entires.add(ModBlocks.RAW_RUBY_BLOCK);
                }
        ).build()
    );

    public static void registerItemGroups()
    {
        
    }
}
