package com.xworkz.abstraction.sup;

public class CricketDTO {
	
	private String country;
	private String captain;
	private String viseCaptain;
	private String own;
	private int totalPlayers;
	private int onFieldPlayers;
	private String series;
	private double overs;
	private String mom;
	private String mos;
	
	public CricketDTO()
	{
		System.out.println("Default const of Cricket");
	}
	
	public CricketDTO(String country, String captain, String viseCaptain, String own, int totalPlayers,
			int onFieldPlayers, String series, double overs, String mom, String mos) {
		super();
		this.country = country;
		this.captain = captain;
		this.viseCaptain = viseCaptain;
		this.own = own;
		this.totalPlayers = totalPlayers;
		this.onFieldPlayers = onFieldPlayers;
		this.series = series;
		this.overs = overs;
		this.mom = mom;
		this.mos = mos;
	}
	
	public String toString() {
		return "CricketDTO [country=" + country + ", captain=" + captain + ", viseCaptain=" + viseCaptain + ", own="
				+ own + ", totalPlayers=" + totalPlayers + ", onFieldPlayers=" + onFieldPlayers + ", series=" + series
				+ ", overs=" + overs + ", mom=" + mom + ", mos=" + mos + "]";
	}

	public String getCountry() {
		return country;
	}
	public String getCaptain() {
		return captain;
	}
	public String getViseCaptain() {
		return viseCaptain;
	}
	public String getOwn() {
		return own;
	}
	public int getTotalPlayers() {
		return totalPlayers;
	}
	public int getOnFieldPlayers() {
		return onFieldPlayers;
	}
	public String getSeries() {
		return series;
	}
	public double getOvers() {
		return overs;
	}
	public String getMom() {
		return mom;
	}
	public String getMos() {
		return mos;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public void setCaptain(String captain) {
		this.captain = captain;
	}
	public void setViseCaptain(String viseCaptain) {
		this.viseCaptain = viseCaptain;
	}
	public void setOwn(String own) {
		this.own = own;
	}
	public void setTotalPlayers(int totalPlayers) {
		this.totalPlayers = totalPlayers;
	}
	public void setOnFieldPlayers(int onFieldPlayers) {
		this.onFieldPlayers = onFieldPlayers;
	}
	public void setSeries(String series) {
		this.series = series;
	}
	public void setOvers(double overs) {
		this.overs = overs;
	}
	public void setMom(String mom) {
		this.mom = mom;
	}
	public void setMos(String mos) {
		this.mos = mos;
	}
	
	
	
	
	
	
	

}
