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

    }
}
