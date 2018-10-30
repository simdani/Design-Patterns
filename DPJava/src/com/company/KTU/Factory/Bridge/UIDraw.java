package com.company.KTU.Factory.Bridge;

public class UIDraw extends UI {
    public void changeColor() {
        System.out.println("UIDraw changing color");
    }

    public void draw() {
        System.out.println("UIDraw drawing");
    }

    public void collision() {
        System.out.println("UIdraw collision");
    }

    public void rotate() {
        System.out.println("UIdraw rotation");
    }

    @Override
    public void oper1() {
        this.changeColor();
    }

    @Override
    public void oper2() {
        System.out.println("UIdraw oper2 is not implemented");
    }
}
