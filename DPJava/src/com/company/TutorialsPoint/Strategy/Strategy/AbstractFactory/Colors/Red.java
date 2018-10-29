package com.company.TutorialsPoint.Strategy.Strategy.AbstractFactory.Colors;

public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Inside red::fill() method.");
    }
}
