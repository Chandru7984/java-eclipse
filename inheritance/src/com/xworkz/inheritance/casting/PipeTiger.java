package com.xworkz.inheritance.casting;

public class PipeTiger {

	public static void main(String[] args) {
		
		Pipe pipe = new Pipe();
		
		pipe.name = "Pipe";
		pipe.brand = "Finolex";
		pipe.advantage = "Lite Weight";
		pipe.strength = "Good";
		pipe.gravity = "Low";
		pipe.price = "Cheap";
		
		pipe.torisu();
		
		Plastic plastic = new Pipe();
		
		plastic.name = "Pipe";
		plastic.brand = "Finolex";
		plastic.advantage = "Lite Weight";
		
		Pipe ConvertedFromPlastic = (Pipe)plastic;
		// type casting
		ConvertedFromPlastic.torisu();

	}

}
