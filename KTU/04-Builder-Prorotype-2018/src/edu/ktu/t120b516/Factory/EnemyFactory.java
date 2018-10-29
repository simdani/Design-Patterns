/**
 * @(#) EnemyFactory.java
 */

package edu.ktu.t120b516.Factory;

import edu.ktu.t120b516.Builder.*;

public class EnemyFactory implements IFactory
{
	Director dir = new Director();
	
	public Enemy createEnemy(String ui )
	{
		if(ui.equals("P")) {
			
			return dir.getFlying();
			
			//return new Plane("lektuvas", 17, 18);
		}
		if(ui.equals("S")) {
			
			return dir.getSwiming();
			
			//return new Ship("laivas", 21, 23);
		}
		
		return null;
	
	}
	
	
}
