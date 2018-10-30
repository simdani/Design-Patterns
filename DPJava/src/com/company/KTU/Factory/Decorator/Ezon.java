package com.company.KTU.Factory.Decorator;

public class Ezon extends Decorator {
    public Ezon(ISkin skin) {
        super(skin);
    }

    public String draw() {
        return "Ezone " + skin.draw();
    }
}
