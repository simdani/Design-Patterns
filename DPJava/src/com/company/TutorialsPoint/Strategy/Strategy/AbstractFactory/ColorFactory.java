package com.company.TutorialsPoint.Strategy.Strategy.AbstractFactory;

import com.company.TutorialsPoint.Strategy.Strategy.AbstractFactory.Colors.Blue;
import com.company.TutorialsPoint.Strategy.Strategy.AbstractFactory.Colors.Color;
import com.company.TutorialsPoint.Strategy.Strategy.AbstractFactory.Colors.Green;
import com.company.TutorialsPoint.Strategy.Strategy.AbstractFactory.Colors.Red;
import com.company.TutorialsPoint.Strategy.Strategy.AbstractFactory.Shapes.Shape;

public class ColorFactory extends AbstractFactory {
    @Override
    Color getColor(String color) {
        if (color == null) {
            return null;
        }
        if (color.equalsIgnoreCase("red")) {
            return new Red();
        } else if (color.equalsIgnoreCase("green")) {
            return new Green();
        } else if (color.equalsIgnoreCase("blue")) {
            return new Blue();
        }

        return null;
    }

    @Override
    Shape getShape(String shape) {
        return null;
    }
}
