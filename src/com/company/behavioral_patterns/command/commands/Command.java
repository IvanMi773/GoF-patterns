package com.company.behavioral_patterns.command.commands;

import com.company.behavioral_patterns.command.Editor;

public abstract class Command {

    public Editor editor;
    private String backup;

    public Command (Editor editor) {
        this.editor = editor;
    }

    public void backup () {
        backup = editor.getText();
    }

    public void undo () {
        editor.setText(backup);
    }

    public abstract boolean execute ();
}
