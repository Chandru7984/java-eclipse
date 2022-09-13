package com.xworkz.exception;

import com.xworkz.exception.dao.AlcoholDAO;
import com.xworkz.exception.dao.impl.AlcoholDAOImpl;
import com.xworkz.exception.dto.AlcoholDTO;

public class AlcoholAchiever {

	public static void main(String[] args) {
		
		AlcoholDTO dto = new AlcoholDTO();
		dto.setBar("MRP");
		dto.setBrand("Old Monk");
		dto.setType("Brandy");
		
		AlcoholDAO dao = new AlcoholDAOImpl();
		dao.create(dto);
	}

}
