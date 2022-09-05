package com.xworkz.dtoconcept.dto;

import java.io.Serializable;

public class HomeDTO implements Serializable {

	private String village;
	private String name;
	private String father;
	private String mother;
	private String brother;
	private String myName;
	private String father1;
	private String mother2;
	private int noOfBrothers;
	private String brother1;
	private String brother2;
	private String brother3;
	private String brother4;
	private Boolean car;
	private Boolean van;
	private Boolean bike;
	private int noOfBikes;

	private int noOfCar;
	private int noOfVan;
	private boolean land;
	private boolean shop;
	private boolean house;
	private boolean newHouse;
	private boolean chairs;
	private boolean cows;
	private int noOfCows;
	private boolean carromBoard;

	private int noOfMembers;
	private boolean house1;
	private boolean house2;
	private int noOfYears1;
	private int noOfYears2;
	private boolean vijayWorking;
	private boolean vinayWorking;
	private String vijayCompany;
	private String vinayCompany;
	private boolean vijayMarried;
	private boolean vinayMarried;

	private boolean vijaySon;
	private String sonName;
	private boolean vishuMarried;
	private String vishuWife;
	private String vishuDaughter;
	private String vijayWife;
	private String vinayWife;

	public HomeDTO() {
		System.out.println("Default constructor");
	}

	@Override
	public int hashCode() {
		return 420;
	}

	public void setVillage(String village) {
		this.village = village;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setFather(String father) {
		this.father = father;
	}

	public void setMother(String mother) {
		this.mother = mother;
	}

	public void setBrother(String brother) {
		this.brother = brother;
	}

	public void setMyName(String myName) {
		this.myName = myName;
	}

	public void setFather1(String father1) {
		this.father1 = father1;
	}

	public void setMother2(String mother2) {
		this.mother2 = mother2;
	}

	public void setNoOfBrothers(int noOfBrothers) {
		this.noOfBrothers = noOfBrothers;
	}

	public void setBrother1(String brother1) {
		this.brother1 = brother1;
	}

	public void setBrother2(String brother2) {
		this.brother2 = brother2;
	}

	public void setBrother3(String brother3) {
		this.brother3 = brother3;
	}

	public void setBrother4(String brother4) {
		this.brother4 = brother4;
	}

	public void setCar(boolean car) {
		this.car = car;
	}

	public void setVan(boolean van) {
		this.van = van;
	}

	public void setBike(boolean bike) {
		this.bike = bike;
	}

	public void setNoOfBikes(int noOfBikes) {
		this.noOfBikes = noOfBikes;
	}

	public void setNoOfCar(int noOfCar) {
		this.noOfCar = noOfCar;
	}

	public void setNoOfVan(int noOfVan) {
		this.noOfVan = noOfVan;
	}

	public void setLand(boolean land) {
		this.land = land;
	}

	public void setShop(boolean shop) {
		this.shop = shop;
	}

	public void setHouse(boolean house) {
		this.house = house;
	}

	public void setNewHouse(boolean newHouse) {
		this.newHouse = newHouse;
	}

	public void setChairs(boolean chairs) {
		this.chairs = chairs;
	}

	public void setCows(boolean cows) {
		this.cows = cows;
	}

	public void setNoOfCows(int noOfCows) {
		this.noOfCows = noOfCows;
	}

	public void setCarromBoard(boolean carromBoard) {
		this.carromBoard = carromBoard;
	}

	public void setNoOfMembers(int noOfMembers) {
		this.noOfMembers = noOfMembers;
	}

	public void setHouse1(boolean house1) {
		this.house1 = house1;
	}

	public void setHouse2(boolean house2) {
		this.house2 = house2;
	}

	public void setNoOfYears1(int noOfYears1) {
		this.noOfYears1 = noOfYears1;
	}

	public void setNoOfYears2(int noOfYears2) {
		this.noOfYears2 = noOfYears2;
	}

	public void setVijayWorking(boolean vijayWorking) {
		this.vijayWorking = vijayWorking;
	}

	public void setVinayWorking(boolean vinayWorking) {
		this.vinayWorking = vinayWorking;
	}

	public void setVijayCompany(String vijayCompany) {
		this.vijayCompany = vijayCompany;
	}

	public void setVinayCompany(String vinayCompany) {
		this.vinayCompany = vinayCompany;
	}

	public void setVijayMarried(boolean vijayMarried) {
		this.vijayMarried = vijayMarried;
	}

	public void setVinayMarried(boolean vinayMarried) {
		this.vinayMarried = vinayMarried;
	}

	public void setVijaySon(boolean vijaySon) {
		this.vijaySon = vijaySon;
	}

	public void setSonName(String sonName) {
		this.sonName = sonName;
	}

	public void setVishuMarried(boolean vishuMarried) {
		this.vishuMarried = vishuMarried;
	}

	public void setVishuWife(String vishuWife) {
		this.vishuWife = vishuWife;
	}

	public void setVishuDaughter(String vishuDaughter) {
		this.vishuDaughter = vishuDaughter;
	}

	public void setVijayWife(String vijayWife) {
		this.vijayWife = vijayWife;
	}

	public void setVinayWife(String vinayWife) {
		this.vinayWife = vinayWife;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			System.out.println("Object is not a null");
			if (obj instanceof HomeDTO) {
				HomeDTO hd = (HomeDTO) obj;
				if (hd.bike.equals(this.bike) && hd.car.equals(this.car)) {
					return true;
				}
			}
		} else {
			System.out.println("Object is equal");
		}
		return super.equals(obj);
	}
}
