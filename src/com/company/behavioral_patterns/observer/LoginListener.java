package com.company.behavioral_patterns.observer;

public class LoginListener implements EventListener {

    @Override
    public void update(String data) {
        System.out.println(data);
    }
}
