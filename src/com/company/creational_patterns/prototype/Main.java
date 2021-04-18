package com.company.creational_patterns.prototype;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Shape> circles = new ArrayList<>();
        Circle circle = new Circle();
        circle.setRadius(43);
        circles.add(circle);
        circles.add(circle.clone());

        for (Shape c: circles) {
            System.out.println(c);
        }
    }
}
