package com.xworkz.inheritance.booster;

public class Train {
	
	public String station;
	public String trainName;
	public int ticketPrice;
	public boolean arrivedTime;
	public String destination;
	
	public Train(String station,String trainName,int ticketPrice,boolean arrivedTime,String destination)
	{
		this.station = station;
		this.trainName = trainName;
		this.ticketPrice = ticketPrice;
		this.arrivedTime = arrivedTime;
		this.destination = destination;
	}
	public void torisu()
	{
		System.out.println(this.station);
		System.out.println(this.trainName);
		System.out.println(this.ticketPrice);
		System.out.println(this.arrivedTime);
		System.out.println(this.destination);
	}

}
