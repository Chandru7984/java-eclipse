package com.xworkz.interfaces;

import com.xworkz.interfaces.rules.ChandruGymRule;
import com.xworkz.interfaces.rules.GymRule;
import com.xworkz.interfaces.uses.GymStaff;

public class RulesTiger {

	public static void main(String[] args) {
		
		GymRule gymRule = new ChandruGymRule();
		
		GymStaff gymStaff = new GymStaff(gymRule);
		
		gymStaff.checkRules();
		
		

	}

}
