package com.xworkz.daoconcept.dao;

import java.util.Iterator;

public class LakeDAOImplementor implements LakeDAO {

	private String[] lakeNames = new String[10];
	private int index;

	@Override
	public boolean save(String lakeName) {

		if (lakeNames[index] == null) {
			lakeNames[index] = lakeName;
			System.out.println("Lakes of Array");

		}
		return true;

	}

	@Override
	public void printAllLakes() {
		for (int i = 0; i < lakeNames.length; i++) {
			System.out.println(lakeNames[i]);
		}
	}

	@Override
	public void delete(int index) {
		lakeNames[index] = null;
	}

	@Override
	public void update(int index, String lakeName) {
		lakeNames[index] = lakeName;

	}

	@Override
	public boolean deleteByName(String name) {
		for (int i = 0; i < lakeNames.length; i++) {
			if (lakeNames[i] == name) {
				lakeNames[i] = null;
			}

		}

		return false;
	}

	@Override
	public boolean updateByName(String name, String newName) {
		for (int i = 0; i < lakeNames.length; i++) {
			if (lakeNames[i] == name) {
				lakeNames[i] = newName;
			}

		}
		return false;
	}

}
