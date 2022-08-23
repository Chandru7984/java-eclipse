package com.xworkz.polymorphism.override;

public class CricketTiger {

	public static void main(String[] args) {

		Cricket cricket = new Cricket();
		/*boolean ent = cricket.entertainment();
		System.out.println(ent);*/
		
		cricket.setCountry("INDIA");
		cricket.setCaptain("Rohit Sharma");
		cricket.setGender('M');
		cricket.entertainment();
		cricket.presentation();
		cricket.torisu();
		
		/*Cricket c = new OneDayCricket();
		boolean e = c.entertainment();
		System.out.println(e);

		Cricket cri = new T20Cricket();
		boolean cric = cri.entertainment();
		System.out.println(cric);

		Cricket t20 = (Cricket)cricket;
		
		boolean t=t20.entertainment();
		System.out.println(t);*/
		
		TestCricket test=new TestCricket();
		test.setgroundType("Bounce");
		test.presentation();
		test.torisu();
		
		OneDayCricket odi=new OneDayCricket();
		odi.setbestBowler("Bumrah");
		odi.setbestBatsman("Rohit Sharma");
		odi.manOfSeries();
		odi.entertainment();
		odi.presentation();
		odi.torisu();
		
		T20Cricket t20=new T20Cricket();
		t20.manOfTheMatch();
		t20.entertainment();
		
	}

}
