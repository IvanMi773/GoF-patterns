package com.company.behavioral_patterns.mediator;

import com.company.behavioral_patterns.mediator.component.Component;

public class AuthenticationDialog implements Mediator {

    @Override
    public void notify(Component sender, String event) {
        if (event.equals("click")) {
            System.out.println("Clicked");
        } else if (event.equals("key press")) {
            System.out.println("Key pressed");
        }
    }
}
