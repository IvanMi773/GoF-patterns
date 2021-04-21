package com.company.behavioral_patterns.visitor.visitor;

import com.company.behavioral_patterns.visitor.shapes.CompoundShape;
import com.company.behavioral_patterns.visitor.shapes.Dot;
import com.company.behavioral_patterns.visitor.shapes.Rectangle;

public interface Visitor {

    String visit(Dot dot);
    String visit(Rectangle rectangle);
    String visit(CompoundShape cg);
}
