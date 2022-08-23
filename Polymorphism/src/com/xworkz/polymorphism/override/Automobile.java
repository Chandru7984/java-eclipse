package com.xworkz.polymorphism.override;

public class Automobile {
	
	protected String type;
	protected String brand;

	
	public double sellAccessories(String name) 
	{
		if("wheels"==name);
		System.out.println("Wheels price is 2000");
		return 2000;
	}
	
	public void setType(String type)
	{
		this.type=type;
	}
	
	public void setBrand(String brand)
	{
		this.brand=brand;
	}

	protected void torisu()
	{
		System.out.println(this.type);
		System.out.println(this.brand);
	}
}
