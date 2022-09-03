package com.xworkz.dtoconcept;

import com.xworkz.dtoconcept.dto.StadiumDTO;

public class StadiumTiger {

	public static void main(String[] args) {
		
		StadiumDTO s = new StadiumDTO();
		s.setName("Motera");
		s.setCountry("India");
		
		System.out.println(s.hashCode());

		StadiumDTO s1 = new StadiumDTO();
		s1.setName("Motera");
		s1.setCountry("India");
		
		System.out.println(s.hashCode());

		if (s.hashCode() == s1.hashCode()) {
			System.out.println(s.equals(s1));
		} else {
			System.err.println("it is not equal");
		}

	}

}
