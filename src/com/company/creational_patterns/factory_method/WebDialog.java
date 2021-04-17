package com.company.creational_patterns.factory_method;

public class WebDialog extends Dialog {

    @Override
    Button createButton() {
        return new HtmlButton();
    }
}
