package com.company.KTU.Factory.Decorator;

public class Shields extends Decorator {
    public Shields(ISkin skin) {
        super(skin);
    }

    public String draw() {
        return "Shields " + skin.draw();
    }
}
