package com.xworkz.casino.service;

import com.xworkz.casino.exception.PrimeMinisterException;

public interface PrimeMinisterService {
	
	boolean checkAndValidate(String name) throws PrimeMinisterException;

}
