package com.company.KTU.Factory.Builder;

import com.company.KTU.Factory.Factory.Enemy;
import com.company.KTU.Factory.Factory.Jet;

public class DrivingBuilder implements IBuilder {
    Enemy e = null;
    static int qty = 1;

    @Override
    public IBuilder addWheels() {
        System.out.println("DB add wheels to " + e.getName());
        return this;
    }

    @Override
    public IBuilder addWings() {
        System.out.println("DB add wing to " + e.getName());
        return this;
    }

    @Override
    public IBuilder addHead() {
        System.out.println("DB add body and head to " + e.getName());
        return this;
    }

    @Override
    public IBuilder startNow() {
        e = new Jet("masina" + qty++, 17, 18);
        return this;
    }

    @Override
    public Enemy buildEnemy() {
        return e;
    }
}
