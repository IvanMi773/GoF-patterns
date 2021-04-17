package com.company.creational_patterns.abstract_factory;

import com.company.creational_patterns.abstract_factory.button.Button;
import com.company.creational_patterns.abstract_factory.button.LinuxButton;
import com.company.creational_patterns.abstract_factory.checkbox.Checkbox;
import com.company.creational_patterns.abstract_factory.checkbox.LinuxCheckbox;

public class LinuxFactory implements GuiFactory {

    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new LinuxCheckbox();
    }
}
