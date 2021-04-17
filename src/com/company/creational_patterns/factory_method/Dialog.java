package com.company.creational_patterns.factory_method;

public abstract class Dialog {

    void doStaff () {
        Button button = createButton();
        button.doStaff();
    }

    abstract Button createButton();
}
