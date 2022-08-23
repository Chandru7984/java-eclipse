package com.xworkz.polymorphism.override;

public class OneDayCricket extends Cricket {
	
	public String bestBowler;
	public String bestBatsman;
	
	public String setbestBowler(String bestBowler)
	{
		this.bestBowler=bestBowler;
		return bestBowler;
	}
	public String setbestBatsman(String bestBatsman)
	{
		this.bestBatsman=bestBatsman;
		return bestBatsman;
	}
	
	public String manOfSeries()
	{
		System.out.println("Man of Series in ODI");
		return "";
	}
	
	boolean cr = super.entertainment();
	{
	System.out.println(cr);
	}
	
	@Override
	public boolean entertainment()
	{
		System.out.println("Entertainment from ODI");
		return true;
	}
	public double presentation()
	{
		System.out.println("presentation from ODI");
		return 0.0;
	}
	
	public void torisu()
	{
		System.out.println(this.bestBowler);
		System.out.println(this.bestBatsman);
	}
}
