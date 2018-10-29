/**
 * @(#) FlyingBuilder.java
 */

package edu.ktu.t120b516.Builder;

import edu.ktu.t120b516.Factory.*;

public class FlyingBuilder implements IBuilder
{
	Enemy e = null;
	static int qty = 1;
	
	@Override
	public IBuilder addWheels() {
		System.out.println("FB add wheels to " + e.getName());
		return this;
	}

	@Override
	public IBuilder addWings() {
		System.out.println("FB add wing to " + e.getName());
		e.addWings(new Wings());
		return this;
	}

	@Override
	public IBuilder addHead() {
		System.out.println("FB add body and head to " + e.getName());
		return this;
	}

	@Override
	public IBuilder startNew() {
		e = new Plane("lektuvas" + qty++, 17, 18);
		return this;
	}

	@Override
	public Enemy buildEnemy() {
		// TODO Auto-generated method stub
		return e;
	}
	
}
