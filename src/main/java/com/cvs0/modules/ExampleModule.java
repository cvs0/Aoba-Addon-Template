package com.cvs0.modules;

import net.aoba.module.Category;
import net.aoba.module.Module;
import net.aoba.settings.types.FloatSetting;

public class ExampleModule extends Module {
    public FloatSetting lineThickness = FloatSetting.builder()
            .id("example_examplesetting")
            .displayName("Example Setting")
            .description("Adjust the exampleness of the example")
            .defaultValue(2f)
            .minValue(0f)
            .maxValue(5f)
            .step(0.1f)
            .build();

    public ExampleModule() {
        super("Example");

        this.setCategory(Category.of("ExampleAddon"));
        this.setDescription("Example Mod");

        this.addSetting(lineThickness);
    }

    @Override
    public void onDisable() {

    }

    @Override
    public void onEnable() {

    }

    @Override
    public void onToggle() {

    }
}
