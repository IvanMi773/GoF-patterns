package com.company.creational_patterns.abstract_factory;

import com.company.creational_patterns.abstract_factory.button.Button;
import com.company.creational_patterns.abstract_factory.button.WinButton;
import com.company.creational_patterns.abstract_factory.checkbox.Checkbox;
import com.company.creational_patterns.abstract_factory.checkbox.WinCheckbox;

public class WinFactory implements GuiFactory {

    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WinCheckbox();
    }
}
