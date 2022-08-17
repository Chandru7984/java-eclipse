package com.xworkz.chandru;

public class Characterclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Character Constructor;
		Character key = new Character('C');
		System.out.println(key);
		
		//Character Instance method;
		char key0 = key.charValue();
		System.out.println(key0);
		
		int key2 = key.compareTo(key);
		System.out.println(key2);
		
		boolean key3 = key.equals(args);
		System.out.println(key3);
		
		int key4 = key.hashCode();
		System.out.println(key4);
		
		String key5 = key.toString();
		System.out.println(key5);
		
		//Character Static methods;
		int a1 = Character.charCount(key4);
		System.out.println(a1);
		
		int a2 = Character.codePointAt("null", a1);
		System.out.println(a2);
		
		int a3 = Character.charCount(a2);
		System.out.println(a3);
		
		int a4 = Character.codePointAt("null", a3);
		System.out.println(a4);
		
		byte a5 = Character.getDirectionality(key1);
		System.out.println(a5);
		
		

	}

}
