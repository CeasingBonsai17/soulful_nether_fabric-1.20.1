package net.bon.soulfulnether.item;

import net.minecraft.item.FoodComponent;

public class SoulfulFoodComponents {

    public static final FoodComponent SOULROOT = (new FoodComponent.Builder()).hunger(3).saturationModifier(0.3F).build();
    public static final FoodComponent CHARRED_SOULROOT = (new FoodComponent.Builder()).hunger(2).saturationModifier(0.6F).build();
    public static final FoodComponent SOULROOT_PIE = (new FoodComponent.Builder()).hunger(7).saturationModifier(0.4F).build();
    public static final FoodComponent MARSHMARROW = (new FoodComponent.Builder()).hunger(3).saturationModifier(0.3F).build();
    public static final FoodComponent TOASTY_MARSHMARROW = (new FoodComponent.Builder()).hunger(4).saturationModifier(0.4F).build();
    public static final FoodComponent ROASTED_MARSHMARROW = (new FoodComponent.Builder()).hunger(4).saturationModifier(0.6F).build();
    public static final FoodComponent MARSHMARROW_HEART = (new FoodComponent.Builder()).hunger(6).saturationModifier(0.6F).build();
    }