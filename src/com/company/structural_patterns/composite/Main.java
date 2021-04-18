package com.company.structural_patterns.composite;

public class Main {

    public static void main(String[] args) {
        CompoundGraphic all = new CompoundGraphic();
        all.add(new Dot(4, 2));
        all.add(new Circle(4, 5, 2));
        all.draw();
    }
}
