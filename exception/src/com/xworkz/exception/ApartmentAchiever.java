package com.xworkz.exception;

import com.xworkz.exception.dao.ApartmentDAO;
import com.xworkz.exception.dao.impl.ApartmentDAOImpl;
import com.xworkz.exception.dto.ApartmentDTO;

public class ApartmentAchiever {

	public static void main(String[] args) {

		ApartmentDTO dto = new ApartmentDTO();
		dto.setPlace("Bengaluru");
		String[] aparments= {"Sobha","Salarpuria"};
		dto.setApartments(aparments);
		dto.setAprtmentName("Sobha Indraprastha");
		
		ApartmentDAO dao = new ApartmentDAOImpl();
		dao.create(dto);
	}

}
