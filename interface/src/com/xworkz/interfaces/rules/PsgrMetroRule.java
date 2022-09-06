package com.xworkz.interfaces.rules;

public class PsgrMetroRule implements MetroRules {

	@Override
	public boolean metroCard() {
		System.out.println("Running Metrocard");
		return true;
	}

	@Override
	public boolean checking() {
		System.out.println("Running checking");
		return true;
	}

	@Override
	public boolean mask() {
		System.out.println("Running mask");
		return true;
	}

}
