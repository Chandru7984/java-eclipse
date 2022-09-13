package com.xworkz.exception.dao.impl;

import com.xworkz.exception.dao.TabletDAO;
import com.xworkz.exception.dto.TabletDTO;

public class TabletDAOImpl implements TabletDAO {
	
	private TabletDTO[] tablet = new TabletDTO[15];
	private int index;

	@Override
	public boolean create(TabletDTO dto) {
		this.tablet[index] = dto;
		System.out.println("Tablet saved,"+dto);
		this.index++;
		return true;
	}

}
