package com.xworkz.inheritance.casting;

public class BengaluruTiger {

	public static void main(String[] args) {
		
		Bengaluru bengaluru = new Bengaluru();
		
		bengaluru.name="BENGALURU";
		bengaluru.title="Silicon Valley of India";
		bengaluru.famousFoods="Idli,Vada & Dosa";
		bengaluru.population=13193000;
		bengaluru.Xworkz=2;
		bengaluru.college="EWIT";
		
		bengaluru.torisu();
		
		City city = new Bengaluru();

		city.name="BENGALURU";
		city.title="Silicon Valley of India";
		city.famousFoods="Idli,Vada & Dosa";
		
		Bengaluru ConvertedFromCity = (Bengaluru)city;
		// type casting
		ConvertedFromCity.torisu();
	}

}
