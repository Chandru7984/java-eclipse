package com.xworkz.inheritance.casting;

public class Mango extends Fruit {
	
	public String usedFor;
	public String color;
	public int pricePerKg;
	
	public Mango(String usedFor,String color,int pricePerKg)
	{
		this.usedFor = usedFor;
		this.color = color;
		this.pricePerKg= pricePerKg;
	}
	
	public Mango() {
		
		System.out.println("Mango is Good");
	}

	public void torisu()
	{
		System.out.println(this.name);
		System.out.println(this.sweet);
		System.out.println(this.season);
		System.out.println(this.usedFor);
		System.out.println(this.color);
		System.out.println(this.pricePerKg);
	}

}
