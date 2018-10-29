package edu.ktu.t120b516.Builder;

public class Wings implements Cloneable
{
	public Wings clone() {
		try {
			return (Wings) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
