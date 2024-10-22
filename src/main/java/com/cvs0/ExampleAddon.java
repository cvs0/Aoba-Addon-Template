package com.cvs0;

import com.cvs0.commands.ExampleCommand;
import com.cvs0.modules.ExampleModule;
import com.mojang.logging.LogUtils;
import net.aoba.api.IAddon;
import net.aoba.cmd.Command;
import net.aoba.module.Module;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class ExampleAddon implements IAddon {
    @Override
    public void onInitialize() {
        LogUtils.getLogger().info("ExampleAddon has been initialized!");
    }

    @Override
    public List<Module> modules() {
        return Arrays.asList(new ExampleModule());
    }

    @Override
    public List<Command> commands() {
        return Arrays.asList(new ExampleCommand());
    }

    @Override
    public String getName() {
        return "ExampleAddon";
    }

    @Override
    public String getId() {
        return "exampleaddon";
    }

    @Override
    public String getDescription() {
        return "Example Addon";
    }

    @Override
    public String getLicense() {
        return "MIT";
    }

    @Override
    public String getHomepageURL() {
        return "https://aobaclient.com";
    }

    @Override
    public String getIssueTrackerURL() {
        return "https://github.com/coltonk9043/Aoba-MC-Hacked-Client/issues";
    }

    @Override
    public String getAuthor() {
        return "cvs0";
    }
}
