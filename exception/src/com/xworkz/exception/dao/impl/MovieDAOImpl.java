package com.xworkz.exception.dao.impl;

import com.xworkz.exception.dao.MovieDAO;
import com.xworkz.exception.dto.MovieDTO;

public class MovieDAOImpl implements MovieDAO {

	private MovieDTO[] movie = new MovieDTO[15];
	private int index;

	@Override
	public boolean create(MovieDTO dto) {
		this.movie[index] = dto;
		System.out.println("Movie saves," + dto);
		this.index++;
		return true;
	}

}
