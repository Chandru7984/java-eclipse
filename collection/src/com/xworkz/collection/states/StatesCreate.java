package com.xworkz.collection.states;

import java.util.ArrayList;
import java.util.List;

public class StatesCreate {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		list.add("Andhra Pradesh");
		list.add("Arunachal Pradesh");
		list.add("Assam");
		list.add("Bihar");
		list.add("Chhattisgarh");
		list.add("Goa");
		list.add("Gujarat");
		list.add("Haryana");
		list.add("Himachal Pradesh");
		list.add("Jharkhand");
		list.add("Karnataka");
		list.add("Kerala");
		list.add("Madhya Pradesh");
		list.add("Maharashtra");
		list.add("Manipur");
		list.add("Meghalaya");
		list.add("Mizoram");
		list.add("Nagaland");
		list.add("Odisha");
		list.add("Punjab");
		list.add("Rajastan");
		list.add("Sikkim");
		list.add("Tamil Nadu");
		list.add("Telangana");
		list.add("Tripura");
		list.add("Uttarakhand");
		list.add("Uttar Pradesh");
		list.add("West Bengal");
		
		System.out.println("=====State names=====");
		list.forEach((ref) -> System.out.println("State :" +ref)); //display all states
		
		System.out.println("=====display states ends with a=====");
		list.stream().filter((ref) -> ref.endsWith("a")).forEach(ref -> System.out.println(ref));
		
		System.out.println("=====display states starts with K=====");
		list.stream().filter((ref) -> ref.startsWith("K")).forEach(ref -> System.out.println(ref));
		
		System.out.println("=====display states contains L=====");
		list.stream().filter((ref) -> ref.contains("L")).forEach(ref -> System.out.println(ref));
		
		System.out.println("=====display states contains D=====");
		list.stream().filter((ref) -> ref.contains("D")).forEach(ref -> System.out.println(ref));
		
		System.out.println("=====display states contains R=====");
		list.stream().filter((ref) -> ref.contains("R")).forEach(ref -> System.out.println(ref));
		
		System.out.println("=====display states contains h=====");
		list.stream().filter((ref) -> ref.contains("h")).forEach(ref -> System.out.println(ref));

		System.out.println("=====display states length > 10=====");
		list.stream().filter((ref) -> ref.length()>10).forEach(ref -> System.out.println(ref));
		
		System.out.println("=====display states length < 5=====");
		list.stream().filter((ref) -> ref.length()<5).forEach(ref -> System.out.println(ref));
		
		System.out.println("=====display all states in Uppercase=====");
		list.stream().forEach((ref) -> System.out.println(ref.toUpperCase()));
		
		System.out.println("=====display all states in Lowercase=====");
		list.stream().forEach((ref) -> System.out.println(ref.toLowerCase()));
		
		System.out.println("=====display all states in reverse=====");
		list.stream().forEach((ref) -> System.out.println(new StringBuffer().append(ref).reverse()));
		
		System.out.println("=====display States=====");
		list.stream().distinct().forEach(ref -> System.out.println(ref));


		System.out.println("=====Checking the given string is palindrome or not=====");

		String name = "Assam";
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
