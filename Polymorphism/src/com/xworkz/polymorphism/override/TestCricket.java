package com.xworkz.polymorphism.override;

public class TestCricket extends Cricket {
	
	public String groundType;
	
	String setgroundType(String groundType)
	{
		this.groundType=groundType;
		return groundType;
	}
	
	@Override
	public double presentation()
	{
		System.out.println("Presentation from TestCricket");
		return 0.0;
	}
	
	public void torisu()
	{
		System.out.println(this.groundType);
	}

}
