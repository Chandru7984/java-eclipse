package com.xworkz.daoconcept;

import com.xworkz.daoconcept.dao.LakeDAOImplementor;

public class LakeTiger {

	public static void main(String[] args) {

		LakeDAOImplementor lakeDAOImplementor = new LakeDAOImplementor();

		lakeDAOImplementor.save("YediYur Lake");
		lakeDAOImplementor.save("BTM Lake");
		lakeDAOImplementor.save("Agara Lake");
		lakeDAOImplementor.save("Jayanagar Lake");

		lakeDAOImplementor.printAllLakes();
		lakeDAOImplementor.delete(2);
		lakeDAOImplementor.printAllLakes();
		lakeDAOImplementor.update(2, "Agara Lake");
		lakeDAOImplementor.printAllLakes();

		lakeDAOImplementor.deleteByName("Agara Lake");
		lakeDAOImplementor.updateByName("YediYur Lake", "BTM Lake");
		lakeDAOImplementor.printAllLakes();

	}

}
