package com.xworkz.exception;

import com.xworkz.exception.dao.MovieDAO;
import com.xworkz.exception.dao.impl.MovieDAOImpl;
import com.xworkz.exception.dto.MovieDTO;

public class MovieAchiever {

	public static void main(String[] args) {

		MovieDTO dto = new MovieDTO();
		dto.setName("Vikram");
		String[] producers = { "Kamal Haasan", "Mahendran" };
		dto.setProducers(producers);
		dto.setGuestRole("Surya");

		MovieDAO dao = new MovieDAOImpl();
		dao.create(dto);
	}
}
