package com.xworkz.polymorphism.override;

public class Cricket {
	
	public String country;
	public String captain;
	public char gender;
	
	public void setCountry(String country)
	{
		this.country =country;
	}
	public void setCaptain(String captain)
	{
		this.captain = captain;
	}
	public void setGender(char gender)
	{
		this.gender = gender;
	}

	
	public boolean entertainment()
	{
		System.out.println("Entertainment from Parent class");
		return true;
	}
	public double presentation()
	{
		System.out.println("Presentation from Parent class");
		return 100000.0;
	}
	
	void torisu()
	{
		System.out.println(this.country);
		System.out.println(this.captain);
		System.out.println(this.gender);
	}
	

}
