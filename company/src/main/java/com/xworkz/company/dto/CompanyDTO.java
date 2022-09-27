package com.xworkz.company.dto;

public class CompanyDTO {
	
	public CompanyDTO() {
		System.out.println("Default constructor");
	}
	
	private String Name;
	private String Founder;
	private String Since;
	private String Employees;
	private String Address;
	private String Business;
	
	
	public CompanyDTO(String name, String founder, String since, String employees, String address, String business) {
		super();
		Name = name;
		Founder = founder;
		Since = since;
		Employees = employees;
		Address = address;
		Business = business;
	}


	@Override
	public String toString() {
		return "CompanyDTO [Name=" + Name + ", Founder=" + Founder + ", Since=" + Since + ", Employees=" + Employees
				+ ", Address=" + Address + ", Business=" + Business + "]";
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public String getFounder() {
		return Founder;
	}


	public void setFounder(String founder) {
		Founder = founder;
	}


	public String getSince() {
		return Since;
	}


	public void setSince(String since) {
		Since = since;
	}


	public String getEmployees() {
		return Employees;
	}


	public void setEmployees(String employees) {
		Employees = employees;
	}


	public String getAddress() {
		return Address;
	}


	public void setAddress(String address) {
		Address = address;
	}


	public String getBusiness() {
		return Business;
	}


	public void setBusiness(String business) {
		Business = business;
	}
	
	
	
	

}
