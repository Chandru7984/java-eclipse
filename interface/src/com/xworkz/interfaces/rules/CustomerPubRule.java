package com.xworkz.interfaces.rules;

public class CustomerPubRule implements PubRule {

	@Override
	public boolean dressCodefollowed() {
		System.out.println("Running dressCodefollowed");
		return true;
	}

	@Override
	public int age() {
		System.out.println("Running age");
		return 21;
	}

	@Override
	public boolean validProof() {
		System.out.println("Running validProof");
		return true;
	}

}
