package com.xworkz.exception;

import com.xworkz.exception.dao.TabletDAO;
import com.xworkz.exception.dao.impl.TabletDAOImpl;
import com.xworkz.exception.dto.TabletDTO;

public class TabletAchiever {

	public static void main(String[] args) {

		TabletDTO dto = new TabletDTO();
		dto.setName("DOLO");
		dto.setType("Paracetamol");
		dto.setMg(650);
		
		TabletDAO dao = new TabletDAOImpl();
		dao.create(dto);
	}

}
