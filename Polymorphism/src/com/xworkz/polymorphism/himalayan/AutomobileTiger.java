package com.xworkz.polymorphism.himalayan;

import com.xworkz.polymorphism.override.HondaAutomobile;
import com.xworkz.polymorphism.override.TataAutomobile;

public class AutomobileTiger {

	public static void main(String[] args) {
		
		HondaAutomobile hondaAutomobile=new HondaAutomobile(9.30, 8.30);
		
		hondaAutomobile.sellAccessories("Wheels");
		hondaAutomobile.setType("Two Wheeler");
		hondaAutomobile.setBrand("Royal Enfield");
		hondaAutomobile.torisu();

		TataAutomobile tataAutomobile=new TataAutomobile();
		tataAutomobile.torisu();
	}

}
