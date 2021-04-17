package com.company.creational_patterns.factory_method;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        var rand = new Random();
        Dialog dialog;

        if (rand.nextBoolean()) {
            dialog = new WebDialog();
        } else {
            dialog = new WindowsDialog();
        }

        dialog.createButton();
        dialog.doStaff();
    }
}
