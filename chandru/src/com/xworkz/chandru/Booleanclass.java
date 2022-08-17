package com.xworkz.chandru;

public class Booleanclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Boolean Constructor;
		Boolean value = new Boolean(true);
		System.out.println(value);
		
		Boolean value2 = new Boolean("true");
		System.out.println(value2);
		
		//Boolean Instance methods;
		boolean name = value.booleanValue();
		System.out.println(name);
		
		int name2= value.compareTo(name);
		System.out.println(name2);
		
		boolean name3 = value.equals(value2);
		System.out.println(name3);
		
		int name4 = value.hashCode();
		System.out.println(name4);
		
		String name5 = value.toString();
		System.out.println(name5);
		
		//Boolean Static methods;
		int a = Boolean.compare(name, name3);
		System.out.println(a);
		
		boolean b = Boolean.getBoolean(name5);
		System.out.println(b);
		
		int c = Boolean.hashCode(b);
		System.out.println(c);
		
		boolean d = Boolean.logicalAnd(name3, b);
		System.out.println(d);
		
		boolean e = Boolean.logicalOr(name3, b);
		System.out.println(e);
		
		boolean f = Boolean.logicalXor(name3, b);
		System.out.println(f);
		
		boolean g = Boolean.parseBoolean(name5);
		System.out.println(g);
		
		String h = Boolean.toString(b);
		System.out.println(h);
		
		Boolean i = Boolean.valueOf(b);
		System.out.println(i);
		
		Boolean j = Boolean.valueOf(h);
		System.out.println(j);
		
		
	}

}
