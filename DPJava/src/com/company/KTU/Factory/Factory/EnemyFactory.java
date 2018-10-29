package com.company.KTU.Factory.Factory;

public class EnemyFactory implements IFactory {
    @Override
    public Enemy createEnemy(String ui )
    {
        if(ui.equals("P")) {
            return new Plane("lektuvas", 17, 18);
        }
        if(ui.equals("S")) {
            return new Ship("laivas", 21, 23);
        }

        return null;

    }
}
