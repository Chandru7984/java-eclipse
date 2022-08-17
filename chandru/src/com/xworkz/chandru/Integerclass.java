package com.xworkz.chandru;

public class Integerclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Integer Constructor;
		Integer tax = new Integer(45);
		System.out.println(tax);
		
		Integer tax1 = new Integer(20);
		System.out.println(tax1);
		
		//Integer instance methods;
		Integer value = tax.hashCode();
		System.out.println(value);
		
		byte value0 = tax.byteValue();
		System.out.println(value0);
		
		int value2 = tax.compareTo(45);
		System.out.println(value2);
		
		double value3 = tax.doubleValue();
		System.out.println(value3);
		
		boolean value4 = tax.equals(47);
		System.out.println(value4);
		
		float value5 = tax.floatValue();
		System.out.println(value5);
		
		int value6 = tax.hashCode();
		System.out.println(value6);
		
		int value7 = tax.intValue();
		System.out.println(value7);
		
		long value8 = tax.longValue();
		System.out.println(value8);
		
		short value9 = tax.shortValue();
		System.out.println(value9);
		
		String value10 = tax.toString();
		System.out.println(value10);
		
		//Integer static methods;
		
		Integer tax2 = Integer.bitCount(25);
		System.out.println(tax2);
		
		Integer tax3 = Integer.compare(10, 20);
		System.out.println(tax3);
		
		Integer tax4 = Integer.highestOneBit(20);
		System.out.println(tax4);
		
		Integer tax5 = Integer.hashCode(20);
		System.out.println(tax5);
		
		Integer tax6 = Integer.max(15, 16);
		System.out.println(tax6);
		
		Integer tax7 = Integer.valueOf(30);
		System.out.println(tax7);
		
		Integer tax8 = Integer.compare(10, 20);
		System.out.println(tax8);
		
		Integer tax9 = Integer.valueOf(20);
		System.out.println(tax9);
		
		
	}

}
