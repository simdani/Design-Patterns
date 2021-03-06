package com.company.KTU.Factory.Factory;

import com.company.KTU.Factory.Factory.Enemy;
import com.company.KTU.Factory.Strategy.Swim;

public class Ship extends Enemy {
    public Ship(String name, long posX, long posY) {
        super(name, posX, posY);
        this.moveList.add(new Swim());
    }

    @Override
    public void drawWeapon() {
        this.ui.oper1();
    }

    @Override
    public void drawMovement() {
        this.ui.oper2();
    }
}
