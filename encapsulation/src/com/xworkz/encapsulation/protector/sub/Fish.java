package com.xworkz.encapsulation.protector.sub;

public class Fish {

	private String brand;
	private String type;

	public Fish() {
		System.out.println("Default const in Fish");
	}

	public Fish(String brand, String type) {
		super();
		this.brand = brand;
		this.type = type;
	}

	
	public boolean equals(Object obj) {
		System.out.println("Object method in fish");
		return super.equals(brand) && super.equals(type);
	}

	{
		Object obj = null;
		if (obj != null)
			System.out.println("equal to fish");
		else {
			System.out.println("Not equal to fish");
			if(obj instanceof Fish);
			
			
		}
	}

}
