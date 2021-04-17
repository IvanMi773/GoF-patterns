package com.company.creational_patterns.abstract_factory.checkbox;

public class LinuxCheckbox implements Checkbox {

    @Override
    public void paint() {
        System.out.println("Painting linux checkbox");
    }
}
