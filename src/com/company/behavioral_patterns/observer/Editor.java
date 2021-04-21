package com.company.behavioral_patterns.observer;

public class Editor {

    private static EventManager events;

    public static void main(String[] args) {
        events = new EventManager("Logged in", "Logged out");
        LoginListener ll = new LoginListener();
        events.subscribe("Logged in", ll);
        login();
    }

    private static void login () {
        System.out.println("Logging in...");
        events.notify("Logged in", "test@test.com");
    }
}
