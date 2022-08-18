package com.xworkz.inheritance.booster;

public class Programming {
	
	public String name;
	public String datatypes;
	public String used;
	
	public Programming (String name,String datatypes,String used)
	{
		this.name = name;
		this.datatypes = datatypes;
		this.used = used;
	}
	public void torisu()
	{
		System.out.println(this.name);
		System.out.println(this.datatypes);
		System.out.println(this.used);
	}

}
