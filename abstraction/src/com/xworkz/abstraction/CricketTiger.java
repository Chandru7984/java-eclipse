package com.xworkz.abstraction;

import com.xworkz.abstraction.sup.CricketDTO;

public class CricketTiger extends CricketDTO {

	public static void main(String[] args) {
		
		CricketDTO cr = new CricketDTO("India","Rohit Sharma","Kohli","BCCI",15,11,"Asia Cup",20,"SKY","Hardik");
		
		CricketTiger cr1= new CricketTiger();
		
		System.out.println(cr.toString());

	}

}
