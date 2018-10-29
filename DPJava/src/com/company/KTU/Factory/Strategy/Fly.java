package com.company.KTU.Factory.Strategy;

public class Fly implements IMoveAlgorithm {
    @Override
    public void move() {
        System.out.println("I am flying");
    }
}
