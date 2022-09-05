package com.xworkz.dtoconcept;

import com.xworkz.dtoconcept.dto.CarDTO;

public class CarAdventure {

	public static void main(String[] args) {

		CarDTO car = new CarDTO();

		car.setCompany("Mahindra");
		car.setName("Thar");

		System.out.println(car.hashCode());

		CarDTO car1 = new CarDTO();

		car1.setCompany("Mahindra");
		car1.setName("Thar");

		System.out.println(car1.hashCode());

		if (car.hashCode() == car1.hashCode()) {
			System.out.println(car.equals(car1));
		} else {
			System.err.println("Both are not equal");
		}
	}

}
