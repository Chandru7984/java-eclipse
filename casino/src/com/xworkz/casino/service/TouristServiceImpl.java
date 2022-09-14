package com.xworkz.casino.service;

import java.sql.Savepoint;

import com.xworkz.casino.dao.TouristPlaceDAO;
import com.xworkz.casino.exception.TouristPlaceValidException;

public class TouristServiceImpl implements TouristService {

	TouristPlaceDAO touristPlaceDAO;

	public TouristServiceImpl(TouristPlaceDAO touristPlaceDAO) {
		this.touristPlaceDAO = touristPlaceDAO;
		System.out.println("Constructor");
	}

	@Override
	public boolean checkAndValidate(String place) throws TouristPlaceValidException {
		if (place != null && place.length() > 0 && place.length() < 10) {
			if (touristPlaceDAO.checkName(place)) {
				System.out.println("check method is runnig :" + place);
				throw new TouristPlaceValidException("it is invalid");
			} 

		} else {
			System.err.println("place is not valid");
			throw new TouristPlaceValidException("place is not valid");
		}
		return false;

	}
}
