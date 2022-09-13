package com.xworkz.exception.dto;

import java.io.Serializable;

public class AlcoholDTO implements Serializable {
	
	private String bar;
	private String brand;
	private String type;
	private boolean alcoholContent;
	private double alcoholPerc;
	private boolean container;
	private String bottleMate;
	private String taste;
	private double price;
	private boolean injurious;
	
	private String typeOfInjurious;
	private String improves;
	private String helps;
	private boolean restFulSleep;
	private double minAge;
	
	public AlcoholDTO() {
		System.out.println("Default const");
	}
	
	@Override
	public String toString() {
		return "AlcoholDTO [bar=" + bar + ", brand=" + brand + ", type=" + type + ", alcoholContent=" + alcoholContent
				+ ", alcoholPerc=" + alcoholPerc + ", container=" + container + ", bottleMate=" + bottleMate
				+ ", taste=" + taste + ", price=" + price + ", injurious=" + injurious + ", typeOfInjurious="
				+ typeOfInjurious + ", improves=" + improves + ", helps=" + helps + ", restFulSleep=" + restFulSleep
				+ ", minAge=" + minAge + "]";
	}


	public String getBar() {
		return bar;
	}

	public String getBrand() {
		return brand;
	}

	public String getType() {
		return type;
	}

	public boolean isAlcoholContent() {
		return alcoholContent;
	}

	public double getAlcoholPerc() {
		return alcoholPerc;
	}

	public boolean isContainer() {
		return container;
	}

	public String getBottleMate() {
		return bottleMate;
	}

	public String getTaste() {
		return taste;
	}

	public double getPrice() {
		return price;
	}

	public boolean isInjurious() {
		return injurious;
	}

	public String getTypeOfInjurious() {
		return typeOfInjurious;
	}

	public String getImproves() {
		return improves;
	}

	public String getHelps() {
		return helps;
	}

	public boolean isRestFulSleep() {
		return restFulSleep;
	}

	public double getMinAge() {
		return minAge;
	}

	public void setBar(String bar) {
		this.bar = bar;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setAlcoholContent(boolean alcoholContent) {
		this.alcoholContent = alcoholContent;
	}

	public void setAlcoholPerc(double alcoholPerc) {
		this.alcoholPerc = alcoholPerc;
	}

	public void setContainer(boolean container) {
		this.container = container;
	}

	public void setBottleMate(String bottleMate) {
		this.bottleMate = bottleMate;
	}

	public void setTaste(String taste) {
		this.taste = taste;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setInjurious(boolean injurious) {
		this.injurious = injurious;
	}

	public void setTypeOfInjurious(String typeOfInjurious) {
		this.typeOfInjurious = typeOfInjurious;
	}

	public void setImproves(String improves) {
		this.improves = improves;
	}

	public void setHelps(String helps) {
		this.helps = helps;
	}

	public void setRestFulSleep(boolean restFulSleep) {
		this.restFulSleep = restFulSleep;
	}

	public void setMinAge(double minAge) {
		this.minAge = minAge;
	}
	
	
}
