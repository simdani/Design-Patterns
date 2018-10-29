/**
 * @(#) Director.java
 */

package edu.ktu.t120b516.Builder;

import edu.ktu.t120b516.Factory.Enemy;

public class Director
{
	private IBuilder builder;
	
	public Enemy getFlying( )
	{
		builder = new FlyingBuilder();
		return builder.startNew().addWings().addWheels().addHead().buildEnemy();
		//return new Plane("lektuvas", 17, 18);
		
	}
	
	public Enemy getDriving( )
	{
		builder = new DrivingBuilder();
		return builder.startNew().addWheels().addHead().buildEnemy();
	}
	
	public Enemy getSwiming( )
	{
		builder = new SwimingBuilder();
		return builder.startNew().addHead().buildEnemy();
		//return new Ship("laivas", 21, 23);
	}
	
}
