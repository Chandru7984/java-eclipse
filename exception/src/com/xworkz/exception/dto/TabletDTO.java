package com.xworkz.exception.dto;

import java.io.Serializable;

public class TabletDTO implements Serializable {
	
	private String name;
	private String used;
	private boolean painRelief;
	private boolean nausea;
	private boolean stomachPain;
	private boolean lossOfAppetite;
	private boolean diarrhoea;
	private boolean stomachUpset;
	private boolean indigestion;
	private String origin;
	
	private String storedIn;
	private boolean swallow;
	private String type;
	private boolean sleep;
	private double mg;
	
	public TabletDTO() {
		System.out.println("Default const");
	}

	@Override
	public String toString() {
		return "TabletDTO [name=" + name + ", used=" + used + ", painRelief=" + painRelief + ", nausea=" + nausea
				+ ", stomachPain=" + stomachPain + ", lossOfAppetite=" + lossOfAppetite + ", diarrhoea=" + diarrhoea
				+ ", stomachUpset=" + stomachUpset + ", indigestion=" + indigestion + ", origin=" + origin
				+ ", storedIn=" + storedIn + ", swallow=" + swallow + ", type=" + type + ", sleep=" + sleep + ", mg="
				+ mg + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	public String getName() {
		return name;
	}

	public String getUsed() {
		return used;
	}

	public boolean isPainRelief() {
		return painRelief;
	}

	public boolean isNausea() {
		return nausea;
	}

	public boolean isStomachPain() {
		return stomachPain;
	}

	public boolean isLossOfAppetite() {
		return lossOfAppetite;
	}

	public boolean isDiarrhoea() {
		return diarrhoea;
	}

	public boolean isStomachUpset() {
		return stomachUpset;
	}

	public boolean isIndigestion() {
		return indigestion;
	}

	public String getOrigin() {
		return origin;
	}

	public String getStoredIn() {
		return storedIn;
	}

	public boolean isSwallow() {
		return swallow;
	}

	public String getType() {
		return type;
	}

	public boolean isSleep() {
		return sleep;
	}

	public double getMg() {
		return mg;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setUsed(String used) {
		this.used = used;
	}

	public void setPainRelief(boolean painRelief) {
		this.painRelief = painRelief;
	}

	public void setNausea(boolean nausea) {
		this.nausea = nausea;
	}

	public void setStomachPain(boolean stomachPain) {
		this.stomachPain = stomachPain;
	}

	public void setLossOfAppetite(boolean lossOfAppetite) {
		this.lossOfAppetite = lossOfAppetite;
	}

	public void setDiarrhoea(boolean diarrhoea) {
		this.diarrhoea = diarrhoea;
	}

	public void setStomachUpset(boolean stomachUpset) {
		this.stomachUpset = stomachUpset;
	}

	public void setIndigestion(boolean indigestion) {
		this.indigestion = indigestion;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public void setStoredIn(String storedIn) {
		this.storedIn = storedIn;
	}

	public void setSwallow(boolean swallow) {
		this.swallow = swallow;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setSleep(boolean sleep) {
		this.sleep = sleep;
	}

	public void setMg(double mg) {
		this.mg = mg;
	}
	
	

}
