package com.company.TutorialsPoint.Strategy.Strategy.AbstractFactory;

import com.company.TutorialsPoint.Strategy.Strategy.AbstractFactory.Colors.Color;
import com.company.TutorialsPoint.Strategy.Strategy.AbstractFactory.Shapes.Shape;

public abstract class AbstractFactory {
    abstract Color getColor(String color);
    abstract Shape getShape(String shape);
}
