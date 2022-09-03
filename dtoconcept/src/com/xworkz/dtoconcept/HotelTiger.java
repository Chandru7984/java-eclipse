package com.xworkz.dtoconcept;

import com.xworkz.dtoconcept.dto.HotelDTO;

public class HotelTiger {

	public static void main(String[] args) {
		
		HotelDTO hotel = new HotelDTO();
		hotel.setName("Food Market");
		hotel.setType("veg & non-veg");

		HotelDTO hotel1 = new HotelDTO();
		hotel1.setName("Food Market");
		hotel1.setType("veg & non-veg");

		if (hotel.hashCode() == hotel1.hashCode()) {
			System.out.println(hotel.equals(hotel1));
			System.out.println(System.identityHashCode(hotel1));
		} else {
			System.out.println("it is not equals");
		}

	}

}
