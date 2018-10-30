package com.company.KTU.Factory.Builder;

import com.company.KTU.Factory.Factory.Enemy;

public class Director {
    private IBuilder builder;

    public Enemy getFlying() {
        builder = new FlyingBuilder();
        return builder.startNow().addWings().addWheels().addHead().buildEnemy();
    }

    public Enemy getDriving() {
        builder = new DrivingBuilder();
        return builder.startNow().addHead().buildEnemy();
    }

    public Enemy getSwiming() {
        builder = new SwimmingBuilder();
        return builder.startNow().addWheels().buildEnemy();
    }
}
