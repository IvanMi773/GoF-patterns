package com.company.creational_patterns.abstract_factory;

import com.company.creational_patterns.abstract_factory.button.Button;
import com.company.creational_patterns.abstract_factory.checkbox.Checkbox;

public interface GuiFactory {

    Button createButton();
    Checkbox createCheckbox();
}
