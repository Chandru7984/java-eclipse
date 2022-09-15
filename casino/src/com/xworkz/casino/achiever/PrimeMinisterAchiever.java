package com.xworkz.casino.achiever;

import com.xworkz.casino.dao.PrimeMinisterDAO;
import com.xworkz.casino.dao.PrimeMinisterDAOImpl;
import com.xworkz.casino.exception.PrimeMinisterException;
import com.xworkz.casino.exception.PrimeMinisterRuntimeException;
import com.xworkz.casino.service.PrimeMinisterService;
import com.xworkz.casino.service.PrimeMinisterServiceImpl;

public class PrimeMinisterAchiever {

	public static void main(String[] args) {

		PrimeMinisterDAO dao = new PrimeMinisterDAOImpl();

		PrimeMinisterService pms = new PrimeMinisterServiceImpl(dao);
		try {
			pms.checkAndValidate("Nehru");
			pms.checkAndValidate("Narendra Modi");
			pms.checkAndValidate("Manmohan Singh");
			pms.checkAndValidate("Atal Bihari");
			pms.checkAndValidate("Devegowda");
			//pms.checkAndValidate("Devegowda");
		} catch (PrimeMinisterException pme) {
			pme.getMessage();
		} catch (PrimeMinisterRuntimeException pmre) {
			pmre.getMessage();
		}

	}

}
