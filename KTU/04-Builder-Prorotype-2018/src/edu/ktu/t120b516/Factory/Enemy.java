/**
 * @(#) Enemy.java
 */

package edu.ktu.t120b516.Factory;

import edu.ktu.t120b516.Builder.Wings;
import edu.ktu.t120b516.StrategyObserver.*;
import java.util.ArrayList;

public abstract class Enemy implements IObserver, Cloneable
{
	private String name = "";
	
	private long posX;
	
	private long posY;
	
	private long damage = 10;
	
	private long distance = 5;
	
	private Wings wings = null;
	
	public ArrayList<IMoveAlgorithm> moveList = new ArrayList<IMoveAlgorithm>();
	
	private ViewPortController vpc;
	
	public Enemy shallowCopy() {
		try {
			return (Enemy) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public Enemy deepCopy() {
		try {
			Enemy qwe = (Enemy) super.clone();
			qwe.wings = (Wings) qwe.wings.clone();
			return qwe;
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public ViewPortController getVpc() {
		return vpc;
	}

	public void setVpc(ViewPortController vpc) {
		this.vpc = vpc;
	}
	
	public void changePosition( )
	{
		this.vpc.changePosition();
	}

	public void sayHello() {
		System.out.println("Hello, I am " + name);
	}
	
	public Enemy(String name, long posX, long posY) {
		this.name = name;
		this.posX = posX;
		this.posY = posY;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPosX() {
		return posX;
	}

	public void setPosX(long posX) {
		this.posX = posX;
	}

	public long getPosY() {
		return posY;
	}

	public void setPosY(long posY) {
		this.posY = posY;
	}


	
	public void move( )
	{
		for(IMoveAlgorithm a : moveList) {
			a.move();
		}
	}
	
	public void shoot( )
	{
		
	}

	@Override
	public void update(String msg) {
		// TODO Auto-generated method stub
		System.out.println("Name: " + this.name + " msg: " + msg);
	}

	public void addWings(Wings wings) {
		this.wings = wings;
		
	}
	
	public Wings getWings() {
		return this.wings;
		
	}
}
