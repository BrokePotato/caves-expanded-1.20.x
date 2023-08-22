package net.asher.cavesexpanded.item;

import net.asher.cavesexpanded.CavesExpanded;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item RUBY = registerItem("ruby", new Item(new FabricItemSettings()));
    public static final Item RAW_RUBY = registerItem("raw_ruby", new Item(new FabricItemSettings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(CavesExpanded.MOD_ID, name), item);
    }
    public static void registerModItems() {
        CavesExpanded.LOGGER.info("Registering Mod Items for" + CavesExpanded.MOD_ID);

    }
}
