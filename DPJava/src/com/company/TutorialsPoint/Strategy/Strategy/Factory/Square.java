package com.company.TutorialsPoint.Strategy.Strategy.Factory;

public class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
