package com.xworkz.inheritance.casting;

public class Bengaluru extends City{
	
	public int population;
	public int Xworkz;
	public String college;
	
	public Bengaluru(int population,int Xworkz,String college)
	{
		this.population = population;
		this.Xworkz = Xworkz;
		this.college = college;
	}
	
	public Bengaluru()
	{
		System.out.println("================");
	}
	
	public void torisu()
	{
		System.out.println(this.name);
		System.out.println(this.title);
		System.out.println(this.famousFoods);
		System.out.println(this.population);
		System.out.println(this.Xworkz);
		System.out.println(this.college);
	}

}
