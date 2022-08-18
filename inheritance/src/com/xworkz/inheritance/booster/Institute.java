package com.xworkz.inheritance.booster;

public class Institute {
	
	public String name;
	public String place;
	public String courseName;
	public int fees;
	public double noOfStudents;
	
	public Institute(String name,String place,String courseName,int fees,double noOfStudents)
	{
		this.name = name;
		this.place = place;
		this.courseName = courseName;
		this.fees = fees;
		this.noOfStudents = noOfStudents;
	}
	public void torisu()
	{
		System.out.println(this.name);
		System.out.println(this.place);
		System.out.println(this.courseName);
		System.out.println(this.fees);
		System.out.println(this.noOfStudents);
	}

}
