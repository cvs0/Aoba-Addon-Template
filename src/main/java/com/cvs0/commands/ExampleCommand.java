package com.cvs0.commands;

import net.aoba.Aoba;
import net.aoba.command.Command;
import net.aoba.managers.CommandManager;

import java.util.Set;

public class ExampleCommand extends Command {
    public ExampleCommand() {
        super("example", "Example Command", "[example] [syntax]");
    }

    @Override
    public void runCommand(String[] parameters) {
        CommandManager.sendChatMessage("Example Command");
    }

    @Override
    public String[] getAutocorrect(String previousParameter) {
        CommandManager cm = Aoba.getInstance().commandManager;
        int numCmds = cm.getNumOfCommands();
        String[] commands = new String[numCmds];

        Set<String> cmds = Aoba.getInstance().commandManager.getCommands().keySet();
        int i = 0;
        for (String x : cmds)
            commands[i++] = x;

        return commands;
    }
}
