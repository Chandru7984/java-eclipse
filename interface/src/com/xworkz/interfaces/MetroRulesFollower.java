package com.xworkz.interfaces;

import com.xworkz.interfaces.rules.MetroRules;
import com.xworkz.interfaces.rules.PsgrMetroRule;
import com.xworkz.interfaces.uses.GovtMetro;

public class MetroRulesFollower {

	public static void main(String[] args) {
		
		MetroRules metroRules = new PsgrMetroRule();
		
		GovtMetro govtMetro = new GovtMetro(metroRules);
		
		govtMetro.checkRules();
	}

}
