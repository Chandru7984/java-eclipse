package com.xworkz.abstraction.sup.finalkey;

public class Gravity {
	
	private double force=9.8;
	
	public Gravity()
	{
		System.out.println("Default const of Gravity");
	}

	public Gravity(double force) {
		super();
		this.force = force;
	}
	
	public double getCenterOfGravity()
	{
		return force;
	}
	
	

}
