package com.company.TutorialsPoint.Strategy.Strategy.Builder;

public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "chicken burger";
    }

    @Override
    public float price() {
        return 50.5f;
    }
}
