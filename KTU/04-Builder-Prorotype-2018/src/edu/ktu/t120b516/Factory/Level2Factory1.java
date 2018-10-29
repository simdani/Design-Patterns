/**
 * @(#) Level2Factory1.java
 */

package edu.ktu.t120b516.Factory;

public class Level2Factory1 extends AbstractFactory1
{

	@Override
	public Plane createPlane() {
		// TODO Auto-generated method stub
		return new Bomber("Bomber", 32, 23);
	}

	@Override
	public Ship createShip() {
		// TODO Auto-generated method stub
		return new AircraftCarrier("AircraftCarrier", 100, 150);
	}
	
}
