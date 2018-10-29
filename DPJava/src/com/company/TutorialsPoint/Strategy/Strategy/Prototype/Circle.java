package com.company.TutorialsPoint.Strategy.Strategy.Prototype;

public class Circle extends Shape {
    public Circle() {
        type = "Circle";
    }

    @Override
    void draw() {
        System.out.println("Inside Circle::draw() method");
    }
}
