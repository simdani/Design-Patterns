package com.company.TutorialsPoint.Strategy.Strategy.AbstractFactory;

import com.company.TutorialsPoint.Strategy.Strategy.AbstractFactory.Colors.Color;
import com.company.TutorialsPoint.Strategy.Strategy.AbstractFactory.Shapes.Circle;
import com.company.TutorialsPoint.Strategy.Strategy.AbstractFactory.Shapes.Rectangle;
import com.company.TutorialsPoint.Strategy.Strategy.AbstractFactory.Shapes.Shape;
import com.company.TutorialsPoint.Strategy.Strategy.AbstractFactory.Shapes.Square;

public class ShapeFactory extends AbstractFactory {
    @Override
    Color getColor(String color) {
        return null;
    }

    @Override
    Shape getShape(String shape) {
        if (shape == null) {
            return null;
        }

        if (shape.equalsIgnoreCase("circle")) {
            return new Circle();
        } else if (shape.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        } else if (shape.equalsIgnoreCase("square")) {
            return new Square();
        }

        return null;
    }
}
