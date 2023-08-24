package net.asher.cavesexpanded.datagen;

import net.asher.cavesexpanded.block.ModBlocks;
import net.asher.cavesexpanded.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
    private static final List<ItemConvertible> RUBY_SMELTABLES = List.of(ModItems.RAW_RUBY, ModBlocks.RUBY_ORE, ModBlocks.DEEPSLATE_RUBY_ORE);
    private static final List<ItemConvertible> SAPPHIRE_SMELTABLES = List.of(ModItems.RAW_SAPPHIRE, ModBlocks.SAPPHIRE_ORE, ModBlocks.DEEPSLATE_SAPPHIRE_ORE);
    private static final List<ItemConvertible> TOPAZ_SMELTABLES = List.of(ModItems.RAW_TOPAZ, ModBlocks.TOPAZ_ORE, ModBlocks.DEEPSLATE_TOPAZ_ORE);
    private static final List<ItemConvertible> OPAL_SMELTABLES = List.of(ModItems.RAW_OPAL, ModBlocks.OPAL_ORE, ModBlocks.DEEPSLATE_OPAL_ORE);
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerSmelting(exporter, RUBY_SMELTABLES, RecipeCategory.MISC, ModItems.RUBY,
                0.7f, 200, "ruby");
        offerSmelting(exporter, SAPPHIRE_SMELTABLES, RecipeCategory.MISC, ModItems.SAPPHIRE,
                0.7f, 200, "sapphire");
        offerSmelting(exporter, TOPAZ_SMELTABLES, RecipeCategory.MISC, ModItems.TOPAZ,
                0.7f, 200, "topaz");
        offerSmelting(exporter, OPAL_SMELTABLES, RecipeCategory.MISC, ModItems.OPAL,
                0.7f, 200, "opal");

        offerBlasting(exporter, RUBY_SMELTABLES, RecipeCategory.MISC, ModItems.RUBY,
                0.7f, 100, "ruby");
        offerBlasting(exporter, SAPPHIRE_SMELTABLES, RecipeCategory.MISC, ModItems.SAPPHIRE,
                0.7f, 100, "sapphire");
        offerBlasting(exporter, TOPAZ_SMELTABLES, RecipeCategory.MISC, ModItems.TOPAZ,
                0.7f, 100, "topaz");
        offerBlasting(exporter, OPAL_SMELTABLES, RecipeCategory.MISC, ModItems.OPAL,
                0.7f, 100, "opal");

        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.RUBY,
                RecipeCategory.BUILDING_BLOCKS, ModBlocks.RUBY_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.SAPPHIRE,
                RecipeCategory.BUILDING_BLOCKS, ModBlocks.SAPPHIRE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.TOPAZ,
                RecipeCategory.BUILDING_BLOCKS, ModBlocks.TOPAZ_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.OPAL,
                RecipeCategory.BUILDING_BLOCKS, ModBlocks.OPAL_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.GOLDEN_BREAD, 1)
                .pattern("###")
                .pattern("#o#")
                .pattern("###")
                .input('#', Items.GOLD_INGOT)
                .input('o', Items.BREAD)
                .criterion(hasItem(Items.BREAD),conditionsFromItem(Items.BREAD))
                .criterion(hasItem(Items.GOLD_INGOT),conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.GOLDEN_BREAD)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.HILT, 1)
                .pattern("#")
                .pattern("i")
                .pattern("#")
                .input('#', Items.IRON_NUGGET)
                .input('i', Items.LEATHER)
                .criterion(hasItem(Items.IRON_NUGGET), conditionsFromItem(Items.IRON_NUGGET))
                .criterion(hasItem(Items.LEATHER), conditionsFromItem(Items.LEATHER))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.HILT)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.OBSIDIAN_HAMMER, 1)
                .pattern("  #")
                .pattern(" i ")
                .pattern("o  ")
                .input('#', ModItems.HAMMER_HEAD)
                .input('i', Items.STICK)
                .input('o', ModItems.HILT)
                .criterion(hasItem(ModItems.HAMMER_HEAD), conditionsFromItem(ModItems.HAMMER_HEAD))
                .criterion(hasItem(ModItems.HILT), conditionsFromItem(ModItems.HILT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.OBSIDIAN_HAMMER)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.COPPER_SWORD, 1)
                .pattern("#")
                .pattern("#")
                .pattern("i")
                .input('#', Items.COPPER_INGOT)
                .input('i', Items.STICK)
                .criterion(hasItem(Items.COPPER_INGOT),conditionsFromItem(Items.COPPER_INGOT))
                .criterion(hasItem(Items.STICK),conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.COPPER_SWORD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.COPPER_AXE, 1)
                .pattern("## ")
                .pattern("#i ")
                .pattern(" i ")
                .input('#', Items.COPPER_INGOT)
                .input('i', Items.STICK)
                .criterion(hasItem(Items.COPPER_INGOT),conditionsFromItem(Items.COPPER_INGOT))
                .criterion(hasItem(Items.STICK),conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.COPPER_AXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.COPPER_PICKAXE, 1)
                .pattern("###")
                .pattern(" i ")
                .pattern(" i ")
                .input('#', Items.COPPER_INGOT)
                .input('i', Items.STICK)
                .criterion(hasItem(Items.COPPER_INGOT),conditionsFromItem(Items.COPPER_INGOT))
                .criterion(hasItem(Items.STICK),conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.COPPER_PICKAXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.COPPER_SHOVEL, 1)
                .pattern("#")
                .pattern("i")
                .pattern("i")
                .input('#', Items.COPPER_INGOT)
                .input('i', Items.STICK)
                .criterion(hasItem(Items.COPPER_INGOT),conditionsFromItem(Items.COPPER_INGOT))
                .criterion(hasItem(Items.STICK),conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.COPPER_SHOVEL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.COPPER_HOE, 1)
                .pattern("## ")
                .pattern(" i ")
                .pattern(" i ")
                .input('#', Items.COPPER_INGOT)
                .input('i', Items.STICK)
                .criterion(hasItem(Items.COPPER_INGOT),conditionsFromItem(Items.COPPER_INGOT))
                .criterion(hasItem(Items.STICK),conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.COPPER_HOE)));

    }
}
