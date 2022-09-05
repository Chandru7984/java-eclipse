package com.xworkz.interfaces;

import com.xworkz.interfaces.uses.ITRuleFollower;

public class ViewRules {

	public static void main(String[] args) {
		
		ITRuleFollower itrulefollower = new ITRuleFollower();
		
		itrulefollower.applyLeaves();
		itrulefollower.harrasment();
		itrulefollower.swipeCard();
		itrulefollower.parkingApprovaal();
		itrulefollower.informLeave();
		itrulefollower.workFromHome();
		
		

	}

}
