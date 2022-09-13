package com.xworkz.casino.dao;

public class LifeDAOImpl implements LifeDAO {
	
	private String[] life = new String[5];
	private int index;

	@Override
	public boolean saveName(String name) {
		this.life[index] = name;
		System.out.println("Life saved : "+name+"index"+this.index++);
		return false;
	}

	@Override
	public boolean checkName(String name) {
		for(String ref : this.life)
			if(ref!=null && ref.equals(name)) {
				System.out.println("Name is equal");
				return true;
			}
		return false;
	}

}
