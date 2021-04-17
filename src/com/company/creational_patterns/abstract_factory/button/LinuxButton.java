package com.company.creational_patterns.abstract_factory.button;

public class LinuxButton implements Button {

    @Override
    public void paint() {
        System.out.println("Painting linux button");
    }
}
