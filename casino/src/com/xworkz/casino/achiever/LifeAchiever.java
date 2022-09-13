package com.xworkz.casino.achiever;

import com.xworkz.casino.dao.LifeDAO;
import com.xworkz.casino.dao.LifeDAOImpl;
import com.xworkz.casino.service.LifeService;
import com.xworkz.casino.service.LifeServiceImpl;

public class LifeAchiever {

	public static void main(String[] args) {

		LifeDAO lifeDAO = new LifeDAOImpl();
		lifeDAO.saveName("Family");
		lifeDAO.checkName("Family");
		
		LifeService lifeService = new LifeServiceImpl(lifeDAO);
		boolean checkAndValidate = lifeService.checkAndValidate("Killer");
		System.out.println(checkAndValidate);
	}

}
