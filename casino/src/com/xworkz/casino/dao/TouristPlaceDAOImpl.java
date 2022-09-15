package com.xworkz.casino.dao;

import com.xworkz.casino.exception.TouristPlaceValidException;

public class TouristPlaceDAOImpl implements TouristPlaceDAO {

	private String[] places = new String[10];
	private int index;

	@Override
	public boolean save(String place) {
		this.places[index] = place;
		System.out.println("place saved : " + place + " " + "index" + this.index);
		this.index++;
		return false;
	}

	@Override
	public boolean checkName(String place) {
		for (String ref : this.places)
			if (ref != null && ref.equals(place)) {
				System.out.println("Place is checked");
				return true;
			}
		return false;
	}

}
