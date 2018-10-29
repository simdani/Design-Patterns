/**
 * @(#) Plane.java
 */

package edu.ktu.t120b516.Factory;

import edu.ktu.t120b516.StrategyObserver.*;

public class Plane extends Enemy
{

	public Plane(String name, long posX, long posY) {
		super(name, posX, posY);
		
		this.moveList.add(new Fly());
		// TODO Auto-generated constructor stub
	}
	
}
