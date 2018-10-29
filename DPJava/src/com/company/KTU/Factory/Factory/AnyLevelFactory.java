package com.company.KTU.Factory.Factory;

public class AnyLevelFactory extends AbstractFactory {
    @Override
    public Enemy createEnemy(String family, String type) {
        Enemy e = null;

        if (family.equalsIgnoreCase("P")) {
            if (type.equalsIgnoreCase("j")) {
                e = new Jet("Jet2", 2, 2);
            } else if (type.equalsIgnoreCase("b")) {
                e = new Bomber("Bomber2", 2, 2);
            }
        } else if (family.equalsIgnoreCase("s")) {
            if (type.equalsIgnoreCase("s")) {
                e = new Submarine("Submarine2", 2, 2);
            } else if (type.equalsIgnoreCase("a")) {
                e = new AircraftCarrier("AircraftCarrier2", 2, 2);
            }
        }
        return e;
    }
}
