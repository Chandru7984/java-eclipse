package com.xworkz.casino.achiever;

import com.xworkz.casino.dao.TouristPlaceDAO;
import com.xworkz.casino.dao.TouristPlaceDAOImpl;
import com.xworkz.casino.exception.TouristPlaceValidException;
import com.xworkz.casino.service.TouristService;
import com.xworkz.casino.service.TouristServiceImpl;

public class TouristPlaceAchiever {

	public static void main(String[] args) {

		TouristPlaceDAO touristPlaceDAO = new TouristPlaceDAOImpl();
		touristPlaceDAO.save("Manali");

		TouristService touristService = new TouristServiceImpl(touristPlaceDAO);
		try {
			touristService.checkAndValidate("Manali");
			touristService.checkAndValidate("Coorg");
			touristService.checkAndValidate("Dandeli");
		} catch (TouristPlaceValidException tpve) {
			tpve.getClass();
			tpve.getMessage();
		}

	}

}
