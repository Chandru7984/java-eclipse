package com.xworkz.casino.dao;

public class CasinoDAOImpl implements CasinoDAO {

	private String[] dataStore = new String[5];
	private int index = 2;

	@Override
	public boolean save(String name) {
		this.dataStore[index] = name;
		System.out.println("name saved : " + name + "index" + this.index);
		this.index++;
		return false;
	}

	@Override
	public boolean checkName(String name) {
		for (String ref : this.dataStore)
			if (ref != null && ref.equals(name)) {
				System.out.println("name is correct");
				return true;
			}
		return false;
	}

}
