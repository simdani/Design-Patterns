package com.company.TutorialsPoint.Strategy.Strategy.AbstractFactory.Colors;

public class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("Inside blue::fill() method");
    }
}
