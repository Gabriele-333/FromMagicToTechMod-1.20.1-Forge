package net.gabriele333.fmtt.config;

import net.minecraftforge.common.ForgeConfigSpec;

public final class FMTTConfig {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;
    public static final ForgeConfigSpec.ConfigValue<Integer> integer;

    static {
        BUILDER.push("FMTT config file");
        integer = BUILDER.comment("Default value").define("Value", 0);

        BUILDER.pop();
        SPEC = BUILDER.build();
    }

}
