package com.company.behavioral_patterns.visitor.shapes;

import com.company.behavioral_patterns.visitor.visitor.Visitor;

public interface Shape {

    void move (int x, int y);
    void draw ();
    String accept (Visitor visitor);
}
