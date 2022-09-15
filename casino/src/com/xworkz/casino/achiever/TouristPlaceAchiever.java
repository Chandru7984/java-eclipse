package com.xworkz.casino.achiever;

import com.xworkz.casino.dao.TouristPlaceDAO;
import com.xworkz.casino.dao.TouristPlaceDAOImpl;
import com.xworkz.casino.exception.InvalidTouristRuntimeException;
import com.xworkz.casino.exception.TouristPlaceValidException;
import com.xworkz.casino.service.TouristService;
import com.xworkz.casino.service.TouristServiceImpl;

public class TouristPlaceAchiever {

	public static void main(String[] args) {

		TouristPlaceDAO touristPlaceDAO = new TouristPlaceDAOImpl();

		TouristService touristService = new TouristServiceImpl(touristPlaceDAO);
		try {
			touristService.checkAndValidate("Manali");
			touristService.checkAndValidate("Coorg");
			touristService.checkAndValidate("Dandeli");
			touristService.checkAndValidate("Kedarnath");
			touristService.checkAndValidate("KolliHill");
			touristService.checkAndValidate("Himalaya");
			touristService.checkAndValidate("Marina");
			touristService.checkAndValidate("Goa");
			touristService.checkAndValidate("Gokarna");
			touristService.checkAndValidate("EtinaBuja");
		//	touristService.checkAndValidate("Manali");
			
			
		} catch (TouristPlaceValidException tpve) {
			System.out.println(tpve.getClass());
			System.out.println(tpve.getMessage());
		}catch (InvalidTouristRuntimeException itre) {
			System.out.println(itre.getClass());
			System.out.println(itre.getMessage());
		}
		

	}

}
