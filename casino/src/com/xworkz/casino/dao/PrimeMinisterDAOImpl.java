package com.xworkz.casino.dao;

import com.xworkz.casino.exception.PrimeMinisterException;
import com.xworkz.casino.exception.PrimeMinisterRuntimeException;

public class PrimeMinisterDAOImpl implements PrimeMinisterDAO {
	
	private String[] names = new String[5];
	private int index;

	@Override
	public boolean save(String name) throws PrimeMinisterRuntimeException {
		if(this.index<this.names.length) {
			this.names[index]=name;
			System.out.println("name saved : "+name+"index"+this.index);
			this.index++;
		}
		else {
			System.err.println("name is not saved");
			throw new PrimeMinisterRuntimeException("name is invalid");
		}
		return false;
		
	}

	@Override
	public boolean checkName(String name) {
		for(String ref : this.names)
			if(ref!=null && names.equals(name)) {
				System.out.println("name is checked");
			}
		return false;
	}

}
