package com.company.KTU.Factory.Decorator;

public class BlueEnemy extends Decorator {
    public BlueEnemy(ISkin skin) {
        super(skin);
    }

    public String draw() {
        return "blue " + skin.draw() + super.draw();
    }
}
