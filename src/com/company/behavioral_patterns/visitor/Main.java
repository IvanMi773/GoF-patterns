package com.company.behavioral_patterns.visitor;

import com.company.behavioral_patterns.visitor.shapes.CompoundShape;
import com.company.behavioral_patterns.visitor.shapes.Dot;
import com.company.behavioral_patterns.visitor.shapes.Rectangle;
import com.company.behavioral_patterns.visitor.shapes.Shape;
import com.company.behavioral_patterns.visitor.visitor.XmlExportVisitor;

public class Main {

    public static void main(String[] args) {
        Dot dot = new Dot(1, 10, 55);
        Rectangle rectangle = new Rectangle(3, 10, 17, 20, 30);

        CompoundShape compoundShape = new CompoundShape(4);
        compoundShape.add(dot);
        compoundShape.add(rectangle);

        CompoundShape c = new CompoundShape(5);
        c.add(dot);
        compoundShape.add(c);

        export(dot, compoundShape);
    }

    private static void export(Shape... shapes) {
        XmlExportVisitor exportVisitor = new XmlExportVisitor();
        System.out.println(exportVisitor.export(shapes));
    }
}
