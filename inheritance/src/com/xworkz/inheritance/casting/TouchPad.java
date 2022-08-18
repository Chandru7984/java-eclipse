package com.xworkz.inheritance.casting;

public class TouchPad extends Keyboard {
	
	public int numbers;
	public String usedTo;
	public int letters;
	
	public TouchPad(int numbers,String usedTo,int letters)
	{
		this.numbers = numbers;
		this.usedTo = usedTo;
		this.letters = letters;
	}
	
	public TouchPad()
	{
		System.out.println("TouchPad is used to Input Information");
	}
	
	public void torisu()
	{
		System.out.println(this.brand);
		System.out.println(this.price);
		System.out.println(this.usedIn);
		System.out.println(this.numbers);
		System.out.println(this.usedTo);
		System.out.println(this.letters);
	}

}
