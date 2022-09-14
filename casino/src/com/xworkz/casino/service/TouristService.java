package com.xworkz.casino.service;

import com.xworkz.casino.exception.TouristPlaceValidException;

public interface TouristService {

	boolean checkAndValidate(String place) throws TouristPlaceValidException;

}
