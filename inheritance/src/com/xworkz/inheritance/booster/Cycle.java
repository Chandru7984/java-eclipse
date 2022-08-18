package com.xworkz.inheritance.booster;

public class Cycle {
	
	public String name;
	public String type;
	public boolean fuel;
	public boolean carriage;
	public int cost;
	
	public Cycle(String name,String type,boolean fuel,boolean carriage,int cost)
	{
		this.name = name;
		this.type = type;
		this.fuel = fuel;
		this.carriage = carriage;
		this.cost = cost;
	}
	public void torisu()
	{
		System.out.println(this.name);
		System.out.println(this.type);
		System.out.println(this.fuel);
		System.out.println(this.carriage);
		System.out.println(this.cost);
	}

}
