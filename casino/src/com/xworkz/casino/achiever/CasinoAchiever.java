package com.xworkz.casino.achiever;

import com.xworkz.casino.dao.CasinoDAO;
import com.xworkz.casino.dao.CasinoDAOImpl;
import com.xworkz.casino.service.CasinoService;
import com.xworkz.casino.service.CasinoServiceImpl;

public class CasinoAchiever {

	public static void main(String[] args) {
		
		CasinoDAO casinoDAO = new CasinoDAOImpl();
		casinoDAO.save("Killer");
		casinoDAO.checkName("Killer");
		
		CasinoService casinoService = new CasinoServiceImpl(casinoDAO);

		boolean casino = casinoService.checkAndValidate("Nanu");
		System.out.println(casino);
	}

}
