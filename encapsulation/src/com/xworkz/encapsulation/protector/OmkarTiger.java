package com.xworkz.encapsulation.protector;

import com.xworkz.encapsulation.protector.sub.Omkar;

public class OmkarTiger {

	public static void main(String[] args) {
		
		Omkar omkar=new Omkar("Omkar",12,"Java");
		
		omkar.Show();
	
		omkar.getTraining();
		omkar.getConductInterview();
		omkar.getCoding();
		System.out.println(omkar.getTraining());
		System.out.println(omkar.getConductInterview());
		System.out.println(omkar.getCoding());

	}

}
