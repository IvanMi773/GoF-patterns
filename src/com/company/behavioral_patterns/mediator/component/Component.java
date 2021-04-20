package com.company.behavioral_patterns.mediator.component;

import com.company.behavioral_patterns.mediator.Mediator;

public class Component {

    private Mediator dialog;

    public Component(Mediator dialog) {
        this.dialog = dialog;
    }

    public void click () {
        dialog.notify(this, "click");
    }

    public void keyPress () {
        dialog.notify(this, "key press");
    }
}
