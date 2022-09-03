package com.xworkz.dtoconcept.dto;

import java.io.Serializable;

public class HotelDTO implements Serializable {
	
	private int slNo;
	private String name;
	private String gstNo;
	private String type;
	private long contactNo;
	private int noOfFoodItems;
	private int noOfCoaches;
	private boolean acCoach;
	private boolean normalCoach;
	private double openTime;

	private double closeTime;
	private int pincode;
	private String ownerName;
	private int ownerAge;
	private char gender;
	private double netWorth;
	private String country;
	private String state;
	private String city;
	private String place;

	private int noOfTables;
	private int noOfChairs;
	private boolean idli;
	private boolean vada;
	private boolean buns;
	private boolean puri;
	private boolean pulav;
	private boolean shira;
	private boolean uppittu;
	private boolean puliogre;

	private double rating;
	private double perDayCollection;
	private boolean tea;
	private boolean coffee;
	private int noOfTypesOfTea;
	private boolean lemonTea;
	private boolean greenTea;
	private boolean espresso;
	private boolean meals;
	private boolean vegBiryani;

	private boolean friedRice;
	private boolean omlette;
	private double area;
	private boolean boiledEgg;
	private boolean wifi;

	public HotelDTO() {
		System.out.println("Default constructor");
	}

	@Override
	public int hashCode() {

		return 42;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			System.out.println("it is not null");
			if (obj instanceof HotelDTO) {
				HotelDTO c = (HotelDTO) obj;
				if (c.name.equals(this.name) && c.type.equals(this.type)) {
					System.out.println(this.name + " & " + this.type);
					return true;
				} else {
					System.err.println("it is not equal");
				}
			} else {
				System.err.println("it is not instanceof");
			}
		}
		return super.equals(obj);
	}

	public int getSlNo() {
		return slNo;
	}

	public void setSlNo(int slNo) {
		this.slNo = slNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGstNo() {
		return gstNo;
	}

	public void setGstNo(String gstNo) {
		this.gstNo = gstNo;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public long getContactNo() {
		return contactNo;
	}

	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}

	public int getNoOfFoodItems() {
		return noOfFoodItems;
	}

	public void setNoOfFoodItems(int noOfFoodItems) {
		this.noOfFoodItems = noOfFoodItems;
	}

	public int getNoOfCoaches() {
		return noOfCoaches;
	}

	public void setNoOfCoaches(int noOfCoaches) {
		this.noOfCoaches = noOfCoaches;
	}

	public boolean isAcCoach() {
		return acCoach;
	}

	public void setAcCoach(boolean acCoach) {
		this.acCoach = acCoach;
	}

	public boolean isNormalCoach() {
		return normalCoach;
	}

	public void setNormalCoach(boolean normalCoach) {
		this.normalCoach = normalCoach;
	}

	public double getOpenTime() {
		return openTime;
	}

	public void setOpenTime(double openTime) {
		this.openTime = openTime;
	}

	public double getCloseTime() {
		return closeTime;
	}

	public void setCloseTime(double closeTime) {
		this.closeTime = closeTime;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public int getOwnerAge() {
		return ownerAge;
	}

	public void setOwnerAge(int ownerAge) {
		this.ownerAge = ownerAge;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public double getNetWorth() {
		return netWorth;
	}

	public void setNetWorth(double netWorth) {
		this.netWorth = netWorth;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public int getNoOfTables() {
		return noOfTables;
	}

	public void setNoOfTables(int noOfTables) {
		this.noOfTables = noOfTables;
	}

	public int getNoOfChairs() {
		return noOfChairs;
	}

	public void setNoOfChairs(int noOfChairs) {
		this.noOfChairs = noOfChairs;
	}

	public boolean isIdli() {
		return idli;
	}

	public void setIdli(boolean idli) {
		this.idli = idli;
	}

	public boolean isVada() {
		return vada;
	}

	public void setVada(boolean vada) {
		this.vada = vada;
	}

	public boolean isBuns() {
		return buns;
	}

	public void setBuns(boolean buns) {
		this.buns = buns;
	}

	public boolean isPuri() {
		return puri;
	}

	public void setPuri(boolean puri) {
		this.puri = puri;
	}

	public boolean isPulav() {
		return pulav;
	}

	public void setPulav(boolean pulav) {
		this.pulav = pulav;
	}

	public boolean isShira() {
		return shira;
	}

	public void setShira(boolean shira) {
		this.shira = shira;
	}

	public boolean isUppittu() {
		return uppittu;
	}

	public void setUppittu(boolean uppittu) {
		this.uppittu = uppittu;
	}

	public boolean isPuliogre() {
		return puliogre;
	}

	public void setPuliogre(boolean puliogre) {
		this.puliogre = puliogre;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public double getPerDayCollection() {
		return perDayCollection;
	}

	public void setPerDayCollection(double perDayCollection) {
		this.perDayCollection = perDayCollection;
	}

	public boolean isTea() {
		return tea;
	}

	public void setTea(boolean tea) {
		this.tea = tea;
	}

	public boolean isCoffee() {
		return coffee;
	}

	public void setCoffee(boolean coffee) {
		this.coffee = coffee;
	}

	public int getNoOfTypesOfTea() {
		return noOfTypesOfTea;
	}

	public void setNoOfTypesOfTea(int noOfTypesOfTea) {
		this.noOfTypesOfTea = noOfTypesOfTea;
	}

	public boolean isLemonTea() {
		return lemonTea;
	}

	public void setLemonTea(boolean lemonTea) {
		this.lemonTea = lemonTea;
	}

	public boolean isGreenTea() {
		return greenTea;
	}

	public void setGreenTea(boolean greenTea) {
		this.greenTea = greenTea;
	}

	public boolean isEspresso() {
		return espresso;
	}

	public void setEspresso(boolean espresso) {
		this.espresso = espresso;
	}

	public boolean isMeals() {
		return meals;
	}

	public void setMeals(boolean meals) {
		this.meals = meals;
	}

	public boolean isVegBiryani() {
		return vegBiryani;
	}

	public void setVegBiryani(boolean vegBiryani) {
		this.vegBiryani = vegBiryani;
	}

	public boolean isFriedRice() {
		return friedRice;
	}

	public void setFriedRice(boolean friedRice) {
		this.friedRice = friedRice;
	}

	public boolean isOmlette() {
		return omlette;
	}

	public void setOmlette(boolean omlette) {
		this.omlette = omlette;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public boolean isBoiledEgg() {
		return boiledEgg;
	}

	public void setBoiledEgg(boolean boiledEgg) {
		this.boiledEgg = boiledEgg;
	}

	public boolean isWifi() {
		return wifi;
	}

	public void setWifi(boolean wifi) {
		this.wifi = wifi;
	}


}
