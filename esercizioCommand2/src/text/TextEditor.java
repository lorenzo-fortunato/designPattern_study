package text;

import commands.Command;

import java.util.ArrayList;
import java.util.List;

public class TextEditor {
    private List<Command> commands;

    public TextEditor() {
        this.commands = new ArrayList<Command>();
    }

    public void addCommand(Command commandToAdd) {
        commands.add(commandToAdd);
    }

    public void executeCommands() {
        for (Command commandToExecute : commands) {
            commandToExecute.execute();
        }
        commands.clear();
    }
}
