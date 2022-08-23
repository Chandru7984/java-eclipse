package com.xworkz.polymorphism.override;

public class T20Cricket extends Cricket {
	
	public String manOfTheMatch()
	{
		System.out.println("Man of the Match from T20");
		return "";
	}
	
	@Override
	public boolean entertainment()
	{
		System.out.println("Entertainment in T20");
		return true;
	}
	
	

}
