package com.company.behavioral_patterns.command;

public class Editor {

    private String text;
    public String clipboard;

    public Editor(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
