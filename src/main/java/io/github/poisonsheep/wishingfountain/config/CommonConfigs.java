package io.github.poisonsheep.wishingfountain.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class CommonConfigs {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();

    public static final ForgeConfigSpec SPEC;

    public static final ForgeConfigSpec.ConfigValue<Integer> SEARCHING_RADIUS;

    public static final ForgeConfigSpec.ConfigValue<String> TRIGGER_ITEM;

    static {
        BUILDER.push("Wishing Fountain Configs");
        TRIGGER_ITEM = BUILDER
                .comment("Transforms multi-block structure items. DEFAULT: minecraft:heart_of_the_sea")
                .define("trigger item", "minecraft:heart_of_the_sea");
        BUILDER.pop();

        BUILDER.push("Buddelschiff Configs");
        SEARCHING_RADIUS = BUILDER
                .comment("Maximum radius of buddelschiff search. DEFAULT: 10000")
                .define("searching radius",10000);
        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}
