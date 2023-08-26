package net.asher.cavesexpanded.item;

import net.asher.cavesexpanded.CavesExpanded;
import net.asher.cavesexpanded.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup MOD_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(CavesExpanded.MOD_ID, "mod"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.mod"))
                    .icon(() -> new ItemStack(ModItems.RUBY)).entries((displayContext, entries) -> {
                        entries.add(ModItems.RUBY);
                        entries.add(ModItems.SAPPHIRE);
                        entries.add(ModItems.TOPAZ);
                        entries.add(ModItems.OPAL);
                        entries.add(ModItems.RAW_RUBY);
                        entries.add(ModItems.RAW_SAPPHIRE);
                        entries.add(ModItems.RAW_TOPAZ);
                        entries.add(ModItems.RAW_OPAL);

                        entries.add(ModBlocks.RUBY_BLOCK);
                        entries.add(ModBlocks.SAPPHIRE_BLOCK);
                        entries.add(ModBlocks.TOPAZ_BLOCK);
                        entries.add(ModBlocks.OPAL_BLOCK);

                        entries.add(ModBlocks.RUBY_ORE);
                        entries.add(ModBlocks.SAPPHIRE_ORE);
                        entries.add(ModBlocks.TOPAZ_ORE);
                        entries.add(ModBlocks.OPAL_ORE);
                        entries.add(ModBlocks.DEEPSLATE_RUBY_ORE);
                        entries.add(ModBlocks.DEEPSLATE_SAPPHIRE_ORE);
                        entries.add(ModBlocks.DEEPSLATE_TOPAZ_ORE);
                        entries.add(ModBlocks.DEEPSLATE_OPAL_ORE);

                        entries.add(ModItems.GOLDEN_BREAD);

                        entries.add(ModItems.HILT);
                        entries.add(ModItems.HAMMER_HEAD);
                        entries.add(ModItems.OBSIDIAN_HAMMER);
                        entries.add(ModItems.COPPER_SWORD);
                        entries.add(ModItems.COPPER_AXE);
                        entries.add(ModItems.COPPER_PICKAXE);
                        entries.add(ModItems.COPPER_SHOVEL);
                        entries.add(ModItems.COPPER_HOE);

                        entries.add(ModItems.SNAPDRAGON_DISC_MUSIC_DISC);

                    }).build());


    public static void registerItemGroups() {
        CavesExpanded.LOGGER.info("Registering Item Groups for" + CavesExpanded.MOD_ID);
    }
}
