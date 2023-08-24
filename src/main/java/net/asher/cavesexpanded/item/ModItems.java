package net.asher.cavesexpanded.item;

import net.asher.cavesexpanded.CavesExpanded;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item RUBY = registerItem("ruby", new Item(new FabricItemSettings()));
    public static final Item SAPPHIRE = registerItem("sapphire", new Item(new FabricItemSettings()));
    public static final Item TOPAZ = registerItem("topaz", new Item(new FabricItemSettings()));
    public static final Item OPAL = registerItem("opal", new Item(new FabricItemSettings()));

    public static final Item RAW_RUBY = registerItem("raw_ruby", new Item(new FabricItemSettings()));
    public static final Item RAW_SAPPHIRE = registerItem("raw_sapphire", new Item(new FabricItemSettings()));
    public static final Item RAW_TOPAZ = registerItem("raw_topaz", new Item(new FabricItemSettings()));
    public static final Item RAW_OPAL = registerItem("raw_opal", new Item(new FabricItemSettings()));

    public static final Item GOLDEN_BREAD = registerItem("golden_bread", new Item(new FabricItemSettings().food(ModFoodComponents.GOLDEN_BREAD)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(CavesExpanded.MOD_ID, name), item);
    }
    public static void registerModItems() {
        CavesExpanded.LOGGER.info("Registering Mod Items for" + CavesExpanded.MOD_ID);

    }
}
