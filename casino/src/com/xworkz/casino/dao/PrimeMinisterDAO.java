package com.xworkz.casino.dao;

import com.xworkz.casino.exception.PrimeMinisterException;
import com.xworkz.casino.exception.PrimeMinisterRuntimeException;

public interface PrimeMinisterDAO {

	boolean save(String name) throws PrimeMinisterRuntimeException;

	boolean checkName(String name);

}
