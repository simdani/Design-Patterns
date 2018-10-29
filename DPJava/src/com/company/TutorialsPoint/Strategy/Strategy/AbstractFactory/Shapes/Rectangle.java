package com.company.TutorialsPoint.Strategy.Strategy.AbstractFactory.Shapes;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
