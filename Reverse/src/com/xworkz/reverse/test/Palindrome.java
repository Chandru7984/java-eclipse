package com.xworkz.reverse.test;

public class Palindrome {

	public static void main(String[] args) {
		
		String name = "KANAK";
		StringBuffer buffer = new StringBuffer(name);
		buffer.reverse();
		String data = buffer.toString();
		if (name.equals(data)) {
			System.out.println("Given String is palindrome");
		} else {
			System.out.println("Given String is not palindrome");
		}

	}

}
