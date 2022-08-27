package com.xworkz.encapsulation.protector;

import com.xworkz.encapsulation.protector.sub.Omkar;


public class OmkarTiger {

	public static void main(String[] args) {
		
		Omkar omkar=new Omkar("Omkar",12,"Java");
		
		omkar.Show();
	
		boolean om1=omkar.getTraining();
		boolean om2=omkar.getConductInterview();
		boolean om3=omkar.getCoding();
		System.out.println(om1);
		System.out.println(om2);
		System.out.println(om3);

	}

}
