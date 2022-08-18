package com.xworkz.inheritance.casting;

public class Fruit {
	
	public String name;
	public boolean sweet;
	public String season;
	
	public Fruit(String name,boolean sweet,String season,String usedFor,String color,int pricePerKg)
	{
		this.name = name;
		this.sweet = sweet;
		this.season = season;
	}
	public Fruit() {
		
		System.out.println("Mango taste is Good");
	}
	

}
