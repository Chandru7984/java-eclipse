package com.xworkz.exception.dao.impl;

import com.xworkz.exception.dao.AlcoholDAO;
import com.xworkz.exception.dto.AlcoholDTO;

public class AlcoholDAOImpl implements AlcoholDAO {
	
	private AlcoholDTO[] alcohol = new AlcoholDTO[15];
	
	private int index;

	@Override
	public boolean create(AlcoholDTO dto) {
		this.alcohol[index] = dto;
		System.out.println("Alcohol saved,"+dto+"into index"+this.index);
		this.index++;
		return true;
	}

}
