package com.company.behavioral_patterns.mediator;

import com.company.behavioral_patterns.mediator.component.Component;

public class Main {

    public static void main(String[] args) {
        AuthenticationDialog authenticationDialog = new AuthenticationDialog();
        Component component = new Component(authenticationDialog);
        component.click();
        component.keyPress();
    }
}
