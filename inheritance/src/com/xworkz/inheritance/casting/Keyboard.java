package com.xworkz.inheritance.casting;

public class Keyboard {
	
	public String brand;
	public int price;
	public String usedIn;
	
	public Keyboard(String brand,String usedIn,int price)
	{
		this.brand = brand;
		this.usedIn = usedIn;
		this.price = price;
	}
	
	public Keyboard()
	{
		System.out.println("Keyboard is used to Input data");
	}

}
