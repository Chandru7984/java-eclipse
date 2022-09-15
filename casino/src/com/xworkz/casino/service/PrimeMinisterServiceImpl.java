package com.xworkz.casino.service;

import com.xworkz.casino.dao.PrimeMinisterDAO;
import com.xworkz.casino.exception.PrimeMinisterException;

public class PrimeMinisterServiceImpl implements PrimeMinisterService {

	private PrimeMinisterDAO dao;

	public PrimeMinisterServiceImpl(PrimeMinisterDAO dao) {
		this.dao = dao;
		System.out.println("const of serviceImpl");
	}

	@Override
	public boolean checkAndValidate(String name) throws PrimeMinisterException {
		if (name != null && name.length() > 4 && name.length() < 50) {
			if (!this.dao.checkName(name)) {
				System.out.println("name is present" + name);
			} else {
				System.err.println("name is not present");
				throw new PrimeMinisterException("Invalid");
			}
		} else {
			System.err.println("name is correct");
			throw new PrimeMinisterException("name is Invalid");
		}
		return this.dao.save(name);

	}

}
