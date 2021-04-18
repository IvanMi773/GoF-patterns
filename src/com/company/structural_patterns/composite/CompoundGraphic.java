package com.company.structural_patterns.composite;

import java.util.ArrayList;

public class CompoundGraphic implements Graphic {

    private ArrayList<Graphic> children = new ArrayList<>();

    public void add (Graphic child) {
        children.add(child);
    }

    public void remove (Graphic child) {
        children.remove(child);
    }

    @Override
    public void move(int x, int y) {
        for (Graphic g: children) {
            g.move(x, y);
        }
    }

    @Override
    public void draw() {
        for (Graphic g: children) {
            g.draw();
        }
    }
}
