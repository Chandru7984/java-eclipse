package com.xworkz.interfaces.uses;

import com.xworkz.interfaces.rules.MetroRules;

public class GovtMetro {

	private MetroRules metroRules;

	public GovtMetro() {
		System.out.println("Default constructor");
	}

	public GovtMetro(MetroRules metroRules) {
		this.metroRules = metroRules;
	}

	public boolean checkRules() {
		System.out.println("Checking Metro rules");
		
		boolean card = this.metroRules.metroCard();
		boolean check = this.metroRules.checking();
		boolean protect = this.metroRules.mask();
		if (card && check && protect) {
			System.out.println("Rules are followed");
			return true;
		} else {
			System.err.println("Rules are not followed");
			return false;
		}
	}

}
