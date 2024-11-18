package net.bon.soulfulnether.item;

import net.minecraft.item.FoodComponent;

public class SoulfulFoodComponents {

    public static final FoodComponent soulroot = (new FoodComponent.Builder()).hunger(3).saturationModifier(0.3F).build();
    public static final FoodComponent roasted_soulroot = (new FoodComponent.Builder()).hunger(5).saturationModifier(0.4F).build();
    public static final FoodComponent charred_soulroot = (new FoodComponent.Builder()).hunger(3).saturationModifier(0.6F).build();
    public static final FoodComponent soulroot_pie = (new FoodComponent.Builder()).hunger(7).saturationModifier(0.4F).build();
    }