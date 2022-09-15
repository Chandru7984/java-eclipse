package com.xworkz.casino.dao;

import com.xworkz.casino.exception.InvalidTouristRuntimeException;

public interface TouristPlaceDAO {

	boolean save(String place) throws InvalidTouristRuntimeException;

	boolean checkName(String place);

}
 