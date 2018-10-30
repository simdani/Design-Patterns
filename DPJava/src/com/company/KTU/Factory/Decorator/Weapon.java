package com.company.KTU.Factory.Decorator;

public class Weapon extends Decorator {
    public Weapon(ISkin skin) {
        super(skin);
    }

    public String draw() {
        return "Weapon " + skin.draw();
    }
}
