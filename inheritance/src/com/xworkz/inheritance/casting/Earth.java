package com.xworkz.inheritance.casting;

public class Earth extends Planet {
	
	public String color;
	public int countries;
	public double continents;
	
	public Earth(String color,int countries,double continents)
	{
		this.color = color;
		this.countries = countries;
		this.continents = continents;
	}

	public Earth()
	{
		System.out.println("-------------------");
	}
	
	public void torisu()
	{
		System.out.println(this.name);
		System.out.println(this.radius);
		System.out.println(this.shape);
		System.out.println(this.color);
		System.out.println(this.countries);
		System.out.println(this.continents);
	}
}
