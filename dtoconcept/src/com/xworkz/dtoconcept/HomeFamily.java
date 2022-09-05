package com.xworkz.dtoconcept;

import com.xworkz.dtoconcept.dto.HomeDTO;

public class HomeFamily {

	public static void main(String[] args) {
	
		HomeDTO home = new HomeDTO();
		
		home.setBike(true);
		home.setCar(true);
		
		System.out.println(home.hashCode());
		
		HomeDTO home1 = new HomeDTO();
		
		home1.setBike(true);
		home1.setCar(true);
		
		System.out.println(home1.hashCode());
		
		if(home.hashCode() == home1.hashCode()) {
			System.out.println(home.equals(home1));
		}else {
			System.out.println("Both are not equal");
		}

	}

}
