package com.xworkz.encapsulation.protector;

import com.xworkz.encapsulation.protector.sub.Fish;

public class FishTiger {

	public static void main(String[] args) {
		
		Fish fish = new Fish("Tiger Bomb","fresh water");
		
		System.out.println(fish);
		fish.getBreed();
		fish.getType();
		
		Fish fish2 = new Fish("Fighter","fresh water");
		System.out.println(fish.equals(fish2));
	
		

	}

}
