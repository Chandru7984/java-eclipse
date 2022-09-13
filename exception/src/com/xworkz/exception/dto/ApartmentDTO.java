package com.xworkz.exception.dto;

import java.io.Serializable;
import java.util.Arrays;

public class ApartmentDTO implements Serializable {
	
	private String place;
	private double noOfAprtmts;
	private String[] apartments;
	private boolean legal;
	private String aprtmentName;
	private double noOfFlats;
	private double flatPrice;
	private String builders;
	private boolean parking;
	private boolean lift;
	
	private boolean playGround;
	private boolean security;
	private boolean safety;
	private boolean checking;
	private double noOfFloors;
	
	public ApartmentDTO() {
		System.out.println("Default const");
	}

	@Override
	public String toString() {
		return "ApartmentDTO [place=" + place + ", noOfAprtmts=" + noOfAprtmts + ", apartments="
				+ Arrays.toString(apartments) + ", legal=" + legal + ", aprtmentName=" + aprtmentName + ", noOfFlats="
				+ noOfFlats + ", flatPrice=" + flatPrice + ", builders=" + builders + ", parking=" + parking + ", lift="
				+ lift + ", playGround=" + playGround + ", security=" + security + ", safety=" + safety + ", checking="
				+ checking + ", noOfFloors=" + noOfFloors + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	public String getPlace() {
		return place;
	}

	public double getNoOfAprtmts() {
		return noOfAprtmts;
	}

	public String[] getApartments() {
		return apartments;
	}

	public boolean isLegal() {
		return legal;
	}

	public String getAprtmentName() {
		return aprtmentName;
	}

	public double getNoOfFlats() {
		return noOfFlats;
	}

	public double getFlatPrice() {
		return flatPrice;
	}

	public String getBuilders() {
		return builders;
	}

	public boolean isParking() {
		return parking;
	}

	public boolean isLift() {
		return lift;
	}

	public boolean isPlayGround() {
		return playGround;
	}

	public boolean isSecurity() {
		return security;
	}

	public boolean isSafety() {
		return safety;
	}

	public boolean isChecking() {
		return checking;
	}

	public double getNoOfFloors() {
		return noOfFloors;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public void setNoOfAprtmts(double noOfAprtmts) {
		this.noOfAprtmts = noOfAprtmts;
	}

	public void setApartments(String[] apartments) {
		this.apartments = apartments;
	}

	public void setLegal(boolean legal) {
		this.legal = legal;
	}

	public void setAprtmentName(String aprtmentName) {
		this.aprtmentName = aprtmentName;
	}

	public void setNoOfFlats(double noOfFlats) {
		this.noOfFlats = noOfFlats;
	}

	public void setFlatPrice(double flatPrice) {
		this.flatPrice = flatPrice;
	}

	public void setBuilders(String builders) {
		this.builders = builders;
	}

	public void setParking(boolean parking) {
		this.parking = parking;
	}

	public void setLift(boolean lift) {
		this.lift = lift;
	}

	public void setPlayGround(boolean playGround) {
		this.playGround = playGround;
	}

	public void setSecurity(boolean security) {
		this.security = security;
	}

	public void setSafety(boolean safety) {
		this.safety = safety;
	}

	public void setChecking(boolean checking) {
		this.checking = checking;
	}

	public void setNoOfFloors(double noOfFloors) {
		this.noOfFloors = noOfFloors;
	}
	
	

}
