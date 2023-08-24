package net.asher.cavesexpanded.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent GOLDEN_BREAD = new FoodComponent.Builder()
            .hunger(4).saturationModifier(1.2f).statusEffect(new StatusEffectInstance(
                    StatusEffects.INSTANT_HEALTH, 100), 0.15f).alwaysEdible().build();
}
