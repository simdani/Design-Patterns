/**
 * @(#) Manager.java
 */

package edu.ktu.t120b516.StrategyObserver;

import java.util.ArrayList;

public class Manager
{
	private ArrayList<IObserver> subscribers = new ArrayList<IObserver>();
	
	public void add( IObserver e )
	{
		subscribers.add(e);
	}
	
	public void remove( IObserver e )
	{
		subscribers.remove(e);
	}
	
	public void notify1( )
	{
		this.notifyAll1();
	}
	
	public void notifyAll1( )
	{
		for(IObserver o : subscribers) {
			o.update("kazkas naujo");
		}
	}
	
	
}
