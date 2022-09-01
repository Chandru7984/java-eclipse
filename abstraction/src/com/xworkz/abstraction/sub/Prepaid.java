package com.xworkz.abstraction.sub;

import com.xworkz.abstraction.sup.SimCard;

public class Prepaid extends SimCard {

	@Override
	public void network() {
		System.out.println("Network from Prepaid");

	}

	@Override
	public void message() {
		System.out.println("Message from Preapaid");

	}

	@Override
	public void calling() {
		System.out.println("Calling from Prepaid");

	}

	@Override
	public void internet() {
		System.out.println("Internet access from Prepaid");

	}

}
