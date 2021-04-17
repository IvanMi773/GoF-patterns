package com.company.creational_patterns.abstract_factory.checkbox;

public class WinCheckbox implements Checkbox {

    @Override
    public void paint() {
        System.out.println("Painting windows checkbox");
    }
}
