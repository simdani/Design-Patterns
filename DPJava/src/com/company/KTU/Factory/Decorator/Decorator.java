package com.company.KTU.Factory.Decorator;

public abstract class Decorator implements ISkin {
    protected ISkin skin = null;

    public String draw() {
        return "super view " + skin.draw();
    }

    public Decorator(ISkin skin) {
        this.skin = skin;
    }
}
