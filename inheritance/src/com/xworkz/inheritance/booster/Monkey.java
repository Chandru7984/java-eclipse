package com.xworkz.inheritance.booster;

public class Monkey {
	
	public String type;
	public int lifeSpan;
	public String color;
	
	public Monkey(String type,int lifeSpan,String color)
	{
		this.type = type;
		this.lifeSpan = lifeSpan;
		this.color = color;
	}
	public void torisu()
	{
		System.out.println(this.type);
		System.out.println(this.lifeSpan);
		System.out.println(this.color);
	}
	

}
