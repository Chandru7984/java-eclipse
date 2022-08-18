package com.xworkz.inheritance.casting;

public class TouchPadTiger {

	public static void main(String[] args) {
		
		TouchPad touchpad = new TouchPad();
		
		touchpad.brand = "DELL";
		touchpad.price =300;
		touchpad.usedIn="Laptop";
		touchpad.numbers=10;
		touchpad.usedTo="Input data";
		touchpad.letters=26;
		
		touchpad.torisu();
		
		Keyboard keyboard = new TouchPad();
		
		keyboard.brand = "DELL";
		keyboard.price =300;
		keyboard.usedIn="Laptop";
		
		TouchPad ConvertedFromKeyboard=(TouchPad)keyboard;
		// type casting
		ConvertedFromKeyboard.torisu();

	}

}
