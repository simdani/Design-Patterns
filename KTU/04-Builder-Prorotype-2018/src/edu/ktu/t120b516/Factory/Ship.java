/**
 * @(#) Ship.java
 */

package edu.ktu.t120b516.Factory;

import edu.ktu.t120b516.StrategyObserver.*;

public class Ship extends Enemy
{

	public Ship(String name, long posX, long posY) {
		super(name, posX, posY);
		
		this.moveList.add(new Swim());
		// TODO Auto-generated constructor stub
	}
	
}
