package com.xworkz.collections;

import java.util.ArrayList;

public class NamingColl {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Kawasaki Z900");
		list.add("Ducati Multistrada");
		list.add("BMW GSA 1250");
		list.add("Himalayan");
		list.add("Aprilia Tuono V4");
		
		System.out.println(list);
		
		System.out.println(list.remove(2));
		
		System.out.println(list.lastIndexOf(list));
		
		System.out.println(list.clone());
		
		System.out.println(list.indexOf(3));
		
		System.out.println(list.add("VW Polo"));
		
		System.out.println(list);
		
		System.out.println(list.get(2));

		System.out.println(list.isEmpty());
		
		list.clear();
		
	}

}
