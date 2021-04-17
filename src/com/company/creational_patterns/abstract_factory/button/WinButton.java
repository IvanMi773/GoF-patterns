package com.company.creational_patterns.abstract_factory.button;

public class WinButton implements Button {

    @Override
    public void paint() {
        System.out.println("Painting windows button");
    }
}
