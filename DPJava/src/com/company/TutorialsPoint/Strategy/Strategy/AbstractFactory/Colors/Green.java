package com.company.TutorialsPoint.Strategy.Strategy.AbstractFactory.Colors;

public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method");
    }
}
