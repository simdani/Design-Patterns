/**
 * @(#) AnyLevelFactory2.java
 */

package edu.ktu.t120b516.Factory;

public class AnyLevelFactory2 extends AbstractFactory2
{

	@Override
	public Enemy createEnemy(String family, String type) {
		// TODO Auto-generated method stub
		Enemy e = null;
		
		if(family.equals("P")) {
			if(type.equals("J")) {
				e = new Jet("Jet2", 2, 2);
			}else
			if(type.equals("B")) {
				e = new Bomber("Bomber2", 2, 2);
			}
		}else
		if(family.equals("S")) {
			if(type.equals("S")) {
				e = new Submarine("Submarine2", 2, 2);
			}else
			if(type.equals("A")) {
				e = new AircraftCarrier("AircraftCarrier2", 2, 2);			
			}	

		}
		return e;
	}
	
}
