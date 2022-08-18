package com.xworkz.inheritance.casting;

public class EarthTiger {

	public static void main(String[] args) {
		
		Earth earth = new Earth();
		
		earth.name="Earth";
		earth.radius=6713;
		earth.shape="Oval";
		earth.color="Blue";
		earth.countries=195;
		earth.continents=7;
		
		earth.torisu();
		
		Planet planet = new Earth();
		
		planet.name="Earth";
		planet.radius=6713;
		planet.shape="Oval";
		
		Earth ConvertedFromPlanet = (Earth)planet;
		// type casting
		ConvertedFromPlanet.torisu();
	}

}
