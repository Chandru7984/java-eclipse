package com.xworkz.casino.service;

import com.xworkz.casino.dao.CasinoDAO;

public class CasinoServiceImpl implements CasinoService {

	CasinoDAO casinoDAO;

	public CasinoServiceImpl(CasinoDAO casinoDAO) {
		this.casinoDAO = casinoDAO;
	}

	@Override
	public boolean checkAndValidate(String name) {
		if(name != null && name.length()<3 && name.length()>50)
			if(this.casinoDAO.checkName(name))
			{
				System.out.println("Name is checked");
				return true;
			}else {
				System.out.println("Name is not checked");
			}
		return false;
	}

}
