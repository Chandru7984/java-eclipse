package com.xworkz.collection.achiever;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.collection.dto.PubDTO;

public class PubAchiever {

	public static void main(String[] args) {
		
		PubDTO pubDTO1 = new PubDTO(1,"Lono Tropical Lounge", "Indiranagar", "good", 1400, true);
		PubDTO pubDTO2 = new PubDTO(2,"Taproom", "JP Nagar", "good", 1200, true);
		PubDTO pubDTO3 = new PubDTO(3,"Toit", "Indiranagar", "normal", 1500, true);
		PubDTO pubDTO4 = new PubDTO(4,"Gustoes", "Jayanagar", "Better", 1400, true);
		PubDTO pubDTO5 = new PubDTO(5,"Fat owl", "JP Nagar", "Good", 1600, true);
		
		List<PubDTO> pubDTOs = new ArrayList<PubDTO>();
		
		pubDTOs.add(pubDTO4);
		pubDTOs.add(pubDTO3);
		pubDTOs.add(pubDTO1);
		pubDTOs.add(pubDTO5);
		pubDTOs.add(pubDTO2);

		System.out.println("-----display id in asce");
		pubDTOs.stream().sorted((c1,c2)->c1.getId().compareTo(c2.getId())).forEach((e)->System.out.println(e));
		
		System.out.println("-----display id in asce");
		pubDTOs.stream().filter((c)->c.getArea()!=null).sorted((c1,c2)->c1.getName().compareTo(c2.getName())).forEach((e)->System.out.println(e));
		
		System.out.println("=====Display area and name sorting desc=====");
		pubDTOs.stream().sorted((c1,c2)->{
			int v = c1.getArea().compareTo(c2.getArea());
			if(v==0) {
				return c1.getName().compareTo(c2.getName());
			}
			return v;
		}).forEach((e)->System.out.println(e));
	}

}
