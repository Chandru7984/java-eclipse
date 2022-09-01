package com.xworkz.abstraction.sub;

import com.xworkz.abstraction.sup.SimCard;

public class Postpaid extends SimCard {

	@Override
	public void network() {
		System.out.println("Network from Postpaid");

	}

	@Override
	public void message() {
		System.out.println("Message from Postpaid");

	}

	@Override
	public void calling() {
		System.out.println("Calling from Postpaid");

	}

	@Override
	public void internet() {
		System.out.println("Internet access from Postpaid");

	}


}
