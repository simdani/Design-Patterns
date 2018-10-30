package com.company.KTU.Factory.Bridge;

public abstract class UI {
    public void draw() {
        System.out.println("UI.draw");
    }

    public void collision() {
        System.out.println("UI.collision");
    }

    public void rotate() {
        System.out.println("UI.rotate");
    }

    public abstract void oper1();
    public abstract void oper2();
}
