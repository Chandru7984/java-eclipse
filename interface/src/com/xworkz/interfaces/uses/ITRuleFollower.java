package com.xworkz.interfaces.uses;

import com.xworkz.interfaces.rules.HRRules;
import com.xworkz.interfaces.rules.ManagerRules;
import com.xworkz.interfaces.rules.SecurityRules;

public class ITRuleFollower implements HRRules, SecurityRules, ManagerRules {

	@Override
	public boolean informLeave() {
		System.out.println("Running inform leave");
		return true;
	}

	@Override
	public boolean workFromHome() {
		System.out.println("Running wfh");
		return true;
	}

	@Override
	public boolean swipeCard() {
		System.out.println("Running Swipecard");
		return true;
	}

	@Override
	public boolean parkingApprovaal() {
		System.out.println("Running Parking approval");
		return true;
	}

	@Override
	public boolean applyLeaves() {
		System.out.println("Running applyLeaves");
		return true;
	}

	@Override
	public boolean harrasment() {
		System.out.println("Running harrasment");
		return false;
	}

}
