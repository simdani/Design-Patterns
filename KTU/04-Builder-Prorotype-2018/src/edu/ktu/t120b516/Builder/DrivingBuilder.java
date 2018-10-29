/**
 * @(#) DrivingBuilder.java
 */

package edu.ktu.t120b516.Builder;

import edu.ktu.t120b516.Factory.*;


public class DrivingBuilder implements IBuilder
{

	Enemy e = null;
	static int qty = 1;
	
	@Override
	public IBuilder addWheels() {
		System.out.println("DB add wheels to " + e.getName());
		return this;
	}

	@Override
	public IBuilder addWings() {
		System.out.println("DB add wing to " + e.getName());
		return this;
	}

	@Override
	public IBuilder addHead() {
		System.out.println("DB add body and head to " + e.getName());
		return this;
	}

	@Override
	public IBuilder startNew() {
		e = new Jet("masina" + qty++, 17, 18);
		return this;
	}

	@Override
	public Enemy buildEnemy() {
		// TODO Auto-generated method stub
		return e;
	}	
}
