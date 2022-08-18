package com.xworkz.inheritance.booster;

public class Plane {

	public String airportName;
	public String plane;
	public String passengerName;
	public int totalPassengers;
	public String destination;
	
	public Plane(String airportName,String plane,String passengerName,int totalPassengers,String destination)
	{
		this.airportName = airportName;
		this.plane = plane;
		this.passengerName = passengerName;
		this.totalPassengers = totalPassengers;
		this.destination = destination;
	}
	public void torisu()
	{
		System.out.println(this.airportName);
		System.out.println(this.plane);
		System.out.println(this.passengerName);
		System.out.println(this.totalPassengers);
		System.out.println(this.destination);
		
	}
}
