package com.xworkz.inheritance.casting;

public class Pipe extends Plastic {
	
	public String strength;
	public String gravity;
	public String price;
	
	public Pipe(String strength,String gravity,String price)
	{
		this.strength = strength;
		this.gravity = gravity;
		this.price = price;
	}
	
	public Pipe()
	{
		System.out.println("__________________");
	}

	public void torisu()
	{
		System.out.println(this.name);
		System.out.println(this.brand);
		System.out.println(this.advantage);
		System.out.println(this.strength);
		System.out.println(this.gravity);
		System.out.println(this.price);
	}
}
