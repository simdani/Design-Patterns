package com.company.KTU.Factory.Decorator;

public class RedEnemy extends Decorator {
    public RedEnemy(ISkin skin) {
        super(skin);
    }

    public String draw() {
        return "red" + skin.draw();
    }
}
