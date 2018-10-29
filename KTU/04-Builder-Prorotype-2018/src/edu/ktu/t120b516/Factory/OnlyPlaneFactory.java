/**
 * @(#) OnlyPlaneFactory.java
 */

package edu.ktu.t120b516.Factory;

public class OnlyPlaneFactory implements IFactory
{


	@Override
	public Enemy createEnemy(String ui) {
		
		if(ui.equals("P")) {
			return new Plane("OnlyPlane", 15, 15);
		}
		if(ui.equals("S")) {
			return null;
		}
		
		return null;
	}
	
}
