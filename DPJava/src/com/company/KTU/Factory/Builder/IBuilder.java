package com.company.KTU.Factory.Builder;

import com.company.KTU.Factory.Factory.Enemy;

public interface IBuilder {
    IBuilder addWheels();
    IBuilder addWings();
    IBuilder addHead();
    IBuilder startNow();

    Enemy buildEnemy();
}
