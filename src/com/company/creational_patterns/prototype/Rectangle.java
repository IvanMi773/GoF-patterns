package com.company.creational_patterns.prototype;

public class Rectangle extends Shape {

    private int width;
    private int height;

    public Rectangle (Rectangle source) {
        super(source);

        this.width = source.width;
        this.height = source.height;
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
