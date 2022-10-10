package com.xworkz.collection.dto;

public class PubDTO {

	private Integer id;
	private String name;
	private String area;
	private String ambience;
	private Integer avgPrice;
	private Boolean beer;
	
	public PubDTO() {
		System.out.println("Default pub contructor");
	}

	public PubDTO(Integer id, String name, String area, String ambience, Integer avgPrice, Boolean beer) {
		super();
		this.id = id;
		this.name = name;
		this.area = area;
		this.ambience = ambience;
		this.avgPrice = avgPrice;
		this.beer = beer;
	}

	@Override
	public String toString() {
		return "PubDTO [id=" + id + ", name=" + name + ", area=" + area + ", ambience=" + ambience + ", avgPrice="
				+ avgPrice + ", beer=" + beer + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getAmbience() {
		return ambience;
	}

	public void setAmbience(String ambience) {
		this.ambience = ambience;
	}

	public Integer getAvgPrice() {
		return avgPrice;
	}

	public void setAvgPrice(Integer avgPrice) {
		this.avgPrice = avgPrice;
	}

	public Boolean getBeer() {
		return beer;
	}

	public void setBeer(Boolean beer) {
		this.beer = beer;
	}

	
	
	
	
}
