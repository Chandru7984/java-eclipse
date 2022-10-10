package com.xworkz.collection.achiever;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.collection.dto.HouseDTO;
import com.xworkz.collection.enums.Owning;
import com.xworkz.collection.enums.Type;

public class HouseAchiever {

	public static void main(String[] args) {
		
		HouseDTO houseDTO1 = new HouseDTO(1, "Prestige", "Chandru", Type.APARTMENT, 18, true, Owning.LEASE, 2000);
		HouseDTO houseDTO2 = new HouseDTO(2, "Salarpuria", "Prajwal", Type.APARTMENT, 15, true, Owning.OWN, 1800);
		HouseDTO houseDTO3 = new HouseDTO(3, "Sobha", "Sachin", Type.INDIVIDUAL, 35, false, Owning.LEASE, 3000);
		HouseDTO houseDTO4 = new HouseDTO(4, "Heritage", "Venkatesh", Type.VILLA, 20, true, Owning.RENT, 2200);
		HouseDTO houseDTO5 = new HouseDTO(5, "Golds", "Sudarshan", Type.INDIVIDUAL, 16, false, Owning.OWN, 1700);
		
		List<HouseDTO> houseDTOs = new ArrayList<HouseDTO>();
		
		houseDTOs.add(houseDTO5);
		houseDTOs.add(houseDTO3);
		houseDTOs.add(houseDTO2);
		houseDTOs.add(houseDTO1);
		houseDTOs.add(houseDTO4);
		
		System.out.println("=====Display Id asce=====");
		houseDTOs.stream().sorted((s1,s2) -> s1.getId().compareTo(s2.getId())).forEach((s)->System.out.println(s));
		
		System.out.println("=====Display by Id desc=====");
		houseDTOs.stream().sorted((s1,s2) -> s2.getId().compareTo(s1.getId())).forEach((s)->System.out.println(s));
		
		System.out.println("=====Display by name asce=====");
		houseDTOs.stream().sorted((s1,s2) -> s1.getName().compareTo(s2.getName())).forEach((s)->System.out.println(s));
		
		System.out.println("=====Display by type desc=====");
		houseDTOs.stream().sorted((s1,s2) -> s2.getType().compareTo(s1.getType())).forEach((s)->System.out.println(s));
		
		System.out.println("=====Display by sqfeet desc=====");
		houseDTOs.stream().sorted((s1,s2) -> s2.getSqFeet().compareTo(s1.getSqFeet())).forEach((s)->System.out.println(s));
		
		System.out.println("=====Display by owner desc ");
		houseDTOs.stream().filter((s)->s.getLoan()==true).sorted((s1,s2)-> s2.getLoan().compareTo(s1.getLoan())).forEach((s)->System.out.println(s));
		
		System.out.println("=====Display by owner desc 2 ");
		houseDTOs.stream().filter((s)->s.getLoan()==false).sorted((s1,s2)-> s2.getLoan().compareTo(s1.getLoan())).forEach((s)->System.out.println(s));
	
		System.out.println("=====Display by lease=====");
		houseDTOs.stream().filter((s)->s.getOwningType()==Owning.LEASE).forEach((s)->System.out.println(s));
	
		System.out.println("=====Display by Apartment=====");
		houseDTOs.stream().filter((s)->s.getType()==Type.APARTMENT).forEach((s)->System.out.println(s));
	
		System.out.println("=====Display by Villa=====");
		houseDTOs.stream().filter((s)->s.getType()==Type.VILLA).forEach((s)->System.out.println(s));
		
		System.out.println("=====Display type and owningtype sorting asc=====");
		houseDTOs.stream().sorted((s1,s2)->{
			int c = s1.getType().compareTo(s2.getType());
			if(c==0) 
			{
				return s1.getOwningType().compareTo(s2.getOwningType());
			}
			return c;
		}).forEach((s)->System.out.println(s));
		
		System.out.println("=====Display name and id sorting desc=====");
		houseDTOs.stream().sorted((s1,s2)->{
			int s = s2.getName().compareTo(s1.getName());
			if(s==0) {
				return s2.getId().compareTo(s1.getId());
			}
			return 0;
		}).forEach((s)->System.out.println(s));
	
	
	}

}
