package com.xworkz.polymorphism.override;

public class HondaAutomobile extends Automobile {
	
	protected double openTime;
	protected double closeTime;
	
	public HondaAutomobile(double openTime,double closeTime)
	{
		this.openTime=openTime;
		this.closeTime=closeTime;
	}
	
	public HondaAutomobile() {
		// TODO Auto-generated constructor stub
	}
	
	public void Automobile()
	{
		super.brand=brand;
		super.type=type;
	}
	
	public void torisu()
	{
		super.torisu();
		System.out.println(this.openTime);
		System.out.println(this.closeTime);
	}

}
