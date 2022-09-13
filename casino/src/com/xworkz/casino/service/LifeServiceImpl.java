package com.xworkz.casino.service;

import com.xworkz.casino.dao.LifeDAO;

public class LifeServiceImpl implements LifeService {

	LifeDAO lifeDAO;

	public LifeServiceImpl(LifeDAO lifeDAO) {
		this.lifeDAO = lifeDAO;
	}

	@Override
	public boolean checkAndValidate(String name) {
		if (name != null && name.length() < 3 && name.length() > 50)
			if (this.lifeDAO.checkName(name)) {
				System.out.println("Name is present");
				return true;
			} else {
				System.out.println("Name is not present");
			}
		return false;
	}

}
