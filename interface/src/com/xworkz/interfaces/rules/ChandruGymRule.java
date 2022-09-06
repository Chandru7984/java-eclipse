package com.xworkz.interfaces.rules;

public class ChandruGymRule implements GymRule {

	@Override
	public boolean wearShoes() {
		System.out.println("Wearing Shoes");
		return true;
	}

	@Override
	public double fees() {
		System.out.println("Fees is 600");
		return 600;
	}

	@Override
	public boolean unisex() {
		System.out.println("Running unisex");
		return true;
	}

}
