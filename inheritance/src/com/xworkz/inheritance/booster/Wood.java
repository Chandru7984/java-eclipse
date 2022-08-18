package com.xworkz.inheritance.booster;

public class Wood {

	public String name;
	public char quality;
	public int pricePerFeet;
	public String goodFor;
	public String usedToMake;
	
	public Wood(String name,char quality,int pricePerFeet,String goodFor,String usedToMake)
	{
		this.name = name;
		this.quality = quality;
		this.pricePerFeet= pricePerFeet;
		this.goodFor = goodFor;
		this.usedToMake = usedToMake;
	}
	public void torisu()
	{
		System.out.println(this.name);
		System.out.println(this.quality);
		System.out.println(this.pricePerFeet);
		System.out.println(this.goodFor);
		System.out.println(this.usedToMake);
	}
	
}
