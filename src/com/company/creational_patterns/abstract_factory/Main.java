package com.company.creational_patterns.abstract_factory;

import com.company.creational_patterns.abstract_factory.button.Button;
import com.company.creational_patterns.abstract_factory.checkbox.Checkbox;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        var rand = new Random();
        GuiFactory factory;

        if (rand.nextBoolean()) {
            factory = new WinFactory();
        } else {
            factory = new LinuxFactory();
        }

        Button button = factory.createButton();
        Checkbox checkbox = factory.createCheckbox();

        button.paint();
        checkbox.paint();
    }
}
