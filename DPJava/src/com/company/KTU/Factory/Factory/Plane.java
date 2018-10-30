package com.company.KTU.Factory.Factory;

import com.company.KTU.Factory.Factory.Enemy;
import com.company.KTU.Factory.Strategy.Fly;
import com.company.KTU.Factory.Strategy.Swim;

public class Plane extends Enemy {
    public Plane(String name, long posX, long posY) {
        super(name, posX, posY);
        this.moveList.add(new Fly());
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
