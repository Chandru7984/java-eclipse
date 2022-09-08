package com.xworkz.daoconcept.dao;

public interface LakeDAO {
	
	boolean save(String lakeName);
	
	void printAllLakes();
	
	void delete(int index);
	
	void update(int index,String lakeName);

}
