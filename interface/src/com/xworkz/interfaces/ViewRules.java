package com.xworkz.interfaces;

import com.xworkz.interfaces.rules.HRRules;
import com.xworkz.interfaces.rules.ManagerRules;
import com.xworkz.interfaces.rules.SecurityRules;
import com.xworkz.interfaces.uses.ITRuleFollower;

public class ViewRules {

	public static void main(String[] args) {
		
		Object ob = new ITRuleFollower();
		
		HRRules hr = new ITRuleFollower();
		hr.applyLeaves();
		hr.harrasment();
		
		ManagerRules mr = new ITRuleFollower();
		mr.informLeave();
		mr.workFromHome();
		
		SecurityRules sr = new ITRuleFollower();
		sr.parkingApprovaal();
		sr.swipeCard();
		
		ITRuleFollower itrulFollower = new ITRuleFollower();
		
		
		

	}

}
