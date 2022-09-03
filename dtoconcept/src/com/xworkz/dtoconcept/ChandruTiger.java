package com.xworkz.dtoconcept;

import com.xworkz.dtoconcept.dto.ChandruDTO;

public class ChandruTiger {

	public static void main(String[] args) {
		
		ChandruDTO cd = new ChandruDTO();
		
		cd.setName("Chandrashekhar");
		cd.setVillage("Aralikatte");
		cd.setCollege("EWIT");
		cd.setBePlace("Bengaluru");
		cd.setCollegeArea("Anjananagara");
		cd.setBranch("Mechanical");
		cd.setStayIn("Hostel");
		cd.setHostelName("RBDGTC");
		cd.setPuc("DVS");
		cd.setCombination("PCMB");
		cd.setPucPlace("Shimogga");
		cd.setPucScore(70);
		cd.setBeScore(6.9);
		cd.setSchool("AVN");
		cd.setSchoolPlace("Chickjajur");
		cd.setUpTo("Tenth");
		cd.setSslcScore(75);
		cd.setSchool2("Swamy Vivekananda");
		cd.setSchool2Place("Kakanur");
		cd.setGraduate(true);
		cd.setFriends(true);
		cd.setFriendsGang("BUD'S");
		cd.setFather("Suresh");
		cd.setMother("Usha");
		cd.setNoOfBrothers(4);
		cd.setBrother1("Vishwanath");
		cd.setBrother2("Vijay");
		cd.setBrother3("Vinay");
		cd.setBrother4("Ravi");
		cd.setCar(true);
		cd.setVan(true);
		cd.setBike(true);
		cd.setNoOfBikes(3);
		cd.setWorkExp(true);
		cd.setCompany("DAIKIN");
		cd.setRole("Project Engineer");
		cd.setDesignation("Designing");
		cd.setSalary(18000);
		cd.setExperience(1);
		cd.setCourse("Java");
		cd.setInstitute("Xworkz");
		cd.setLaptop(true);
		cd.setMobile(true);
		cd.setArea("BTM");
		cd.setComeFrom("Basavanagudi");
		
		System.out.println(cd.hashCode());
		
		ChandruDTO cd1 = new ChandruDTO();
		cd1.setName("Chandrashekhar");
		cd1.setVillage("Aralikatte");
		cd1.setCollege("EWIT");
		cd1.setBePlace("Bengaluru");
		cd1.setCollegeArea("Anjananagara");
		cd1.setBranch("Mechanical");
		cd1.setStayIn("Hostel");
		cd1.setHostelName("RBDGTC");
		cd1.setPuc("DVS");
		cd1.setCombination("PCMB");
		cd1.setPucPlace("Shimogga");
		cd1.setPucScore(70);
		cd1.setBeScore(6.9);
		cd1.setSchool("AVN");
		cd1.setSchoolPlace("Chickjajur");
		cd1.setUpTo("Tenth");
		cd1.setSslcScore(75);
		cd1.setSchool2("Swamy Vivekananda");
		cd1.setSchool2Place("Kakanur");
		cd1.setGraduate(true);
		cd1.setFriends(true);
		cd1.setFriendsGang("BUD'S");
		cd1.setFather("Suresh");
		cd1.setMother("Usha");
		cd1.setNoOfBrothers(4);
		cd1.setBrother1("Vishwanath");
		cd1.setBrother2("Vijay");
		cd1.setBrother3("Vinay");
		cd1.setBrother4("Ravi");
		cd1.setCar(true);
		cd1.setVan(true);
		cd1.setBike(true);
		cd1.setNoOfBikes(3);
		cd1.setWorkExp(true);
		cd1.setCompany("DAIKIN");
		cd1.setRole("Project Engineer");
		cd1.setDesignation("Designing");
		cd1.setSalary(18000);
		cd1.setExperience(1);
		cd1.setCourse("Java");
		cd1.setInstitute("Xworkz");
		cd1.setLaptop(true);
		cd1.setMobile(true);
		cd1.setArea("BTM");
		cd1.setComeFrom("Basavanagudi");
		
		
		System.out.println(cd1.hashCode());
		if (cd.hashCode() == cd1.hashCode()){
			
			System.out.println(cd.equals(cd1));
		}
		else {
			System.err.println("It is not equal");
		}
		
	}

}
