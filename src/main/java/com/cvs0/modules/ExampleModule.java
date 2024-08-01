package com.cvs0.modules;

import net.aoba.module.Category;
import net.aoba.module.Module;
import net.aoba.settings.types.FloatSetting;
import net.aoba.settings.types.KeybindSetting;
import net.minecraft.client.util.InputUtil;
import org.lwjgl.glfw.GLFW;

public class ExampleModule extends Module {
    private FloatSetting exampleSetting;

    public ExampleModule() {
        super("key.example", "Example Key", GLFW.GLFW_KEY_UNKNOWN);

        this.setName("Example");
        this.setCategory(Category.of("ExampleAddon"));
        this.setDescription("Example Mod");

        exampleSetting = new FloatSetting("example_setting", "Example Setting", "Example Float Setting", 1.0f, 1.0f, 20.0f, 1.0f);

        this.addSetting(exampleSetting);
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
