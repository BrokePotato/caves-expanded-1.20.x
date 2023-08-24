package net.asher.cavesexpanded.item;

import net.asher.cavesexpanded.CavesExpanded;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    //gems
    public static final Item RUBY = registerItem("ruby", new Item(new FabricItemSettings()));
    public static final Item SAPPHIRE = registerItem("sapphire", new Item(new FabricItemSettings()));
    public static final Item TOPAZ = registerItem("topaz", new Item(new FabricItemSettings()));
    public static final Item OPAL = registerItem("opal", new Item(new FabricItemSettings()));
    public static final Item RAW_RUBY = registerItem("raw_ruby", new Item(new FabricItemSettings()));
    public static final Item RAW_SAPPHIRE = registerItem("raw_sapphire", new Item(new FabricItemSettings()));
    public static final Item RAW_TOPAZ = registerItem("raw_topaz", new Item(new FabricItemSettings()));
    public static final Item RAW_OPAL = registerItem("raw_opal", new Item(new FabricItemSettings()));

    //hammer stuff
    public static final Item HILT = registerItem("hilt", new Item(new FabricItemSettings()));
    public static final Item HAMMER_HEAD = registerItem("hammer_head", new Item(new FabricItemSettings()));
    public static final Item OBSIDIAN_HAMMER = registerItem("obsidian_hammer",
            new Item(new FabricItemSettings().maxCount(1).maxDamage(2120)));

    //copper tools/armor
    public static final Item COPPER_PICKAXE = registerItem("copper_pickaxe",
            new PickaxeItem(ModToolMaterial.COPPER,4, 1.2f, new FabricItemSettings()));
    public static final Item COPPER_AXE = registerItem("copper_axe",
            new AxeItem(ModToolMaterial.COPPER,8f, 0.9f, new FabricItemSettings()));
    public static final Item COPPER_SWORD = registerItem("copper_sword",
            new SwordItem(ModToolMaterial.COPPER,6, 1.6f, new FabricItemSettings()));
    public static final Item COPPER_SHOVEL = registerItem("copper_shovel",
            new ShovelItem(ModToolMaterial.COPPER,4, 1, new FabricItemSettings()));
    public static final Item COPPER_HOE = registerItem("copper_hoe",
            new HoeItem(ModToolMaterial.COPPER,1, 4, new FabricItemSettings()));

    //food
    public static final Item GOLDEN_BREAD = registerItem("golden_bread", new Item(new FabricItemSettings().food(ModFoodComponents.GOLDEN_BREAD)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(CavesExpanded.MOD_ID, name), item);
    }
    public static void registerModItems() {
        CavesExpanded.LOGGER.info("Registering Mod Items for" + CavesExpanded.MOD_ID);

    }
}
