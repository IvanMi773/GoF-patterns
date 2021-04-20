package com.company.behavioral_patterns.command.commands;

import com.company.behavioral_patterns.command.Editor;

public class CopyCommand extends Command {

    public CopyCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        editor.clipboard = editor.getText();
        return false;
    }
}
