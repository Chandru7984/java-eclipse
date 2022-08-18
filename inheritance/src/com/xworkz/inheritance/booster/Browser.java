package com.xworkz.inheritance.booster;

public class Browser {
	
	public String name;
	public String website;
	public boolean open;
	public String owned;
	public float ipAddress;
	
	public Browser(String name,String website,boolean open,String owned,float ipAddress)
	{
		this.name = name;
		this.website = website;
		this.open = open;
		this.owned = owned;
		this.ipAddress =ipAddress;
	}
	public void torisu()
	{
		System.out.println(this.name);
		System.out.println(this.website);
		System.out.println(this.open);
		System.out.println(this.owned);
		System.out.println(this.ipAddress);
	}

}
