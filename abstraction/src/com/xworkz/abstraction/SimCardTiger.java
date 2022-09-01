package com.xworkz.abstraction;

import com.xworkz.abstraction.sub.Postpaid;
import com.xworkz.abstraction.sub.Prepaid;
import com.xworkz.abstraction.sup.SimCard;

public class SimCardTiger {

	public static void main(String[] args) {
		
		SimCard sim1 = new Prepaid();
		sim1.network();
		sim1.message();
		sim1.calling();
		sim1.internet();
		
		SimCard sim2 = new Postpaid();
		sim2.network();
		sim2.message();
		sim2.calling();
		sim2.internet();

	}

}
