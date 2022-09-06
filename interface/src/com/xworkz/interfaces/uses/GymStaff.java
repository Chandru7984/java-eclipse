package com.xworkz.interfaces.uses;

import com.xworkz.interfaces.rules.GymRule;

public class GymStaff {

	private GymRule gymRule;

	public GymStaff(GymRule gymRule) {
		this.gymRule = gymRule;
	}

	public void maintenance() {
		System.out.println("Running maintenance");
	}

	public boolean checkRules() {
		System.out.println("Running Check rules");
		boolean shoe = this.gymRule.wearShoes();
		double fee = this.gymRule.fees();
		boolean uniSex = this.gymRule.unisex();
		if (shoe && fee > 200 && uniSex) {
			System.out.println("Rules are allowed");
			return true;
		} else {
			System.err.println("Rules are not allowed");
			return false;
		}
	}
}
