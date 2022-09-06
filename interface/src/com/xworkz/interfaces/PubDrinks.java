package com.xworkz.interfaces;

import com.xworkz.interfaces.rules.CustomerPubRule;
import com.xworkz.interfaces.rules.PubRule;
import com.xworkz.interfaces.uses.DownTownPub;

public class PubDrinks {

	public static void main(String[] args) {
		
		PubRule rule = new CustomerPubRule();
		
		DownTownPub downTownPub = new DownTownPub(rule);
		
		downTownPub.checkRules();
		
		

	}

}
