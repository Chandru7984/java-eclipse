package com.xworkz.dtoconcept.dto;

import java.io.Serializable;

public class ChandruDTO implements Serializable {
	
	private String name;
	private String village;
	private String college;
	private String bePlace;
	private String collegeArea;
	private String branch;
	private String travelIn;
	private String stayIn;
	private String hostelName;
	private String puc;
	private String combination;
	private String pucPlace;
	private double pucScore;
	private double beScore;
	private String School;
	private String schoolPlace;
	private String upTo;
	private double sslcScore;
	private String school2;
	private String school2Place;
	private boolean graduate;
	private boolean friends;
	private String friendsGang;
	private String father;
	private String mother;
	private int noOfBrothers;
	private String brother1;
	private String brother2;
	private String brother3;
	private String brother4;
	private boolean car;
	private boolean van;
	private boolean bike;
	private int noOfBikes;
	private boolean workExp;
	private String company;
	private String role;
	private String designation;
	private int salary;
	private int experience;
	private String course;
	private String institute;
	private boolean laptop;
	private boolean mobile;
	private String area;
	private String comeFrom;
	
	
	@Override
	public int hashCode() {
		return 2819;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
			System.out.println("Object not equal to null");
			if(obj instanceof ChandruDTO) {
				ChandruDTO cast = (ChandruDTO)obj;
				if(cast.pucPlace.equals(this.pucPlace) && cast.bePlace.equals(this.bePlace)) {
					System.out.println("Both " +this.pucPlace +"& "+this.bePlace );
					return true;
				}
			}
		}
		else {
			System.out.println("Object is null");
		}
		return super.equals(obj);
	}
	
	public ChandruDTO() {
		System.out.println("Default constructor");
	}

	public String getName() {
		return name;
	}

	public String getVillage() {
		return village;
	}

	public String getCollege() {
		return college;
	}

	public String getBePlace() {
		return bePlace;
	}

	public String getCollegeArea() {
		return collegeArea;
	}

	public String getBranch() {
		return branch;
	}

	public String getTravelIn() {
		return travelIn;
	}

	public String getStayIn() {
		return stayIn;
	}

	public String getHostelName() {
		return hostelName;
	}

	public String getPuc() {
		return puc;
	}

	public String getCombination() {
		return combination;
	}

	public String getPucPlace() {
		return pucPlace;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setVillage(String village) {
		this.village = village;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public void setBePlace(String bePlace) {
		this.bePlace = bePlace;
	}

	public void setCollegeArea(String collegeArea) {
		this.collegeArea = collegeArea;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public void setTravelIn(String travelIn) {
		this.travelIn = travelIn;
	}

	public void setStayIn(String stayIn) {
		this.stayIn = stayIn;
	}

	public void setHostelName(String hostelName) {
		this.hostelName = hostelName;
	}

	public void setPuc(String puc) {
		this.puc = puc;
	}

	public void setCombination(String combination) {
		this.combination = combination;
	}

	public void setPucPlace(String pucPlace) {
		this.pucPlace = pucPlace;
	}

	public double getPucScore() {
		return pucScore;
	}

	public double getBeScore() {
		return beScore;
	}

	public String getSchool() {
		return School;
	}

	public String getSchoolPlace() {
		return schoolPlace;
	}

	public String getUpTo() {
		return upTo;
	}

	public double getSslcScore() {
		return sslcScore;
	}

	public String getSchool2() {
		return school2;
	}

	public String getSchool2Place() {
		return school2Place;
	}

	public boolean isGraduate() {
		return graduate;
	}

	public boolean isFriends() {
		return friends;
	}

	public String getFriendsGang() {
		return friendsGang;
	}

	public String getFather() {
		return father;
	}

	public String getMother() {
		return mother;
	}

	public int getNoOfBrothers() {
		return noOfBrothers;
	}

	public String getBrother1() {
		return brother1;
	}

	public String getBrother2() {
		return brother2;
	}

	public String getBrother3() {
		return brother3;
	}

	public String getBrother4() {
		return brother4;
	}

	public boolean isCar() {
		return car;
	}

	public boolean isVan() {
		return van;
	}

	public boolean isBike() {
		return bike;
	}

	public int getNoOfBikes() {
		return noOfBikes;
	}

	public boolean isWorkExp() {
		return workExp;
	}

	public String getCompany() {
		return company;
	}

	public String getRole() {
		return role;
	}

	public String getDesignation() {
		return designation;
	}

	public int getSalary() {
		return salary;
	}

	public int getExperience() {
		return experience;
	}

	public String getCourse() {
		return course;
	}

	public String getInstitute() {
		return institute;
	}

	public boolean isLaptop() {
		return laptop;
	}

	public boolean isMobile() {
		return mobile;
	}

	public String getArea() {
		return area;
	}

	public String getComeFrom() {
		return comeFrom;
	}

	public void setPucScore(double pucScore) {
		this.pucScore = pucScore;
	}

	public void setBeScore(double beScore) {
		this.beScore = beScore;
	}

	public void setSchool(String school) {
		School = school;
	}

	public void setSchoolPlace(String schoolPlace) {
		this.schoolPlace = schoolPlace;
	}

	public void setUpTo(String upTo) {
		this.upTo = upTo;
	}

	public void setSslcScore(double sslcScore) {
		this.sslcScore = sslcScore;
	}

	public void setSchool2(String school2) {
		this.school2 = school2;
	}

	public void setSchool2Place(String school2Place) {
		this.school2Place = school2Place;
	}

	public void setGraduate(boolean graduate) {
		this.graduate = graduate;
	}

	public void setFriends(boolean friends) {
		this.friends = friends;
	}

	public void setFriendsGang(String friendsGang) {
		this.friendsGang = friendsGang;
	}

	public void setFather(String father) {
		this.father = father;
	}

	public void setMother(String mother) {
		this.mother = mother;
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

	public void setWorkExp(boolean workExp) {
		this.workExp = workExp;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public void setInstitute(String institute) {
		this.institute = institute;
	}

	public void setLaptop(boolean laptop) {
		this.laptop = laptop;
	}

	public void setMobile(boolean mobile) {
		this.mobile = mobile;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public void setComeFrom(String comeFrom) {
		this.comeFrom = comeFrom;
	}
	
	
	

}
