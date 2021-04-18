package com.company.creational_patterns.prototype;

public class Circle extends Shape {

    private int radius;

    public Circle() {
    }

    public Circle (Circle source) {
        super(source);

        this.radius = source.radius;
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
