package com.xworkz.interfaces.uses;

import com.xworkz.interfaces.rules.PubRule;

public class DownTownPub {
	
	private PubRule rule;
	
	public DownTownPub() {
		System.out.println("Default constructor");
	}

	public DownTownPub(PubRule rule)
	{
		this.rule = rule;
	}
	
	public boolean checkRules()
	{
		System.out.println("Checking pub rules");
		boolean dress = this.rule.dressCodefollowed();
		int minAge = this.rule.age();
		boolean proof = this.rule.validProof();
		if(dress && minAge>20 && proof) {
			System.out.println("Rules are followed");
			return true;
		}
		else {
			System.err.println("Rules are not followed");
			return false;
		}
	}
}
