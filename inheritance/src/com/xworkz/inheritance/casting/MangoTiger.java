package com.xworkz.inheritance.casting;

public class MangoTiger {

	public static void main(String[] args) {
		
		Mango mango = new Mango();
		
		mango.name="Mango";
		mango.season="March to June";
		mango.sweet=true;
		mango.usedFor="Juice";
		mango.color="Yellow";
		mango.pricePerKg=80;
		
		mango.torisu();
		
		Fruit fruit = new Mango();
		
		fruit.name="Mango";
		fruit.season="March to June";
		fruit.sweet=true;

		
		Mango ConvertedFromFruit=(Mango)fruit;
		// type casting
		ConvertedFromFruit.torisu();
	}

}
