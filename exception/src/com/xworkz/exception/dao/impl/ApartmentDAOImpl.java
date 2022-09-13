package com.xworkz.exception.dao.impl;

import com.xworkz.exception.dao.ApartmentDAO;
import com.xworkz.exception.dto.ApartmentDTO;

public class ApartmentDAOImpl implements ApartmentDAO {
	
	private ApartmentDTO[] apartment = new ApartmentDTO[15];
	private int index;
	

	@Override
	public boolean create(ApartmentDTO dto) {
		this.apartment[index] = dto;
		System.out.println("Apartment saved,"+dto);
		this.index++;
		return true;
	}

}
