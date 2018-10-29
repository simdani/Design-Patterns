/**
 * @(#) Leve1Factory1.java
 */

package edu.ktu.t120b516.Factory;

public class Level1Factory1 extends AbstractFactory1
{

	@Override
	public Plane createPlane() {
		// TODO Auto-generated method stub
		return new Jet("Jet", 65, 75);
	}

	@Override
	public Ship createShip() {
		// TODO Auto-generated method stub
		return new Submarine("Submarine", 88, 99);
	}
	
}
