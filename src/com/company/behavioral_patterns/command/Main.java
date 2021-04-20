package com.company.behavioral_patterns.command;

import com.company.behavioral_patterns.command.commands.Command;
import com.company.behavioral_patterns.command.commands.CommandHistory;
import com.company.behavioral_patterns.command.commands.CopyCommand;
import com.company.behavioral_patterns.command.commands.PasteCommand;

public class Main {

    private static CommandHistory history = new CommandHistory();

    public static void main(String[] args) {
        Editor editor = new Editor("abs");
        executeCommand(new CopyCommand(editor));
        executeCommand(new PasteCommand(editor));
        for (var h : history.getHistory()) {
            System.out.println(h);
        }
    }

    private static void executeCommand (Command command) {
        if (command.execute()) {
            history.push(command);
        }
    }
}
