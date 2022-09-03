package com.xworkz.dtoconcept;

import com.xworkz.dtoconcept.dto.XworkzDTO;

public class XworkzTiger {

	public static void name(String[] args) {

		XworkzDTO xd = new XworkzDTO();

		xd.setName("Xworkz");
		xd.setOwner("Omkar");
		xd.setCourse("Java");
		xd.setHtml(true);
		xd.setCss(true);
		xd.setJs(true);
		xd.setBootstrap(true);
		xd.setPython(false);
		xd.setC(false);
		xd.setSprings(true);
		xd.setJdbc(true);
		xd.setSql(true);
		xd.setCourseType("Development");
		xd.setHrName("Vinay");
		xd.setHrName2("Akshara");
		xd.setNoOfBatches(3);
		xd.setNoOfBranch(2);
		xd.setPlacement(true);
		xd.setPresentation(true);
		xd.setBranch1("Rajajinagar");
		xd.setBranch2("BTM");
		xd.setWebTechnology(true);
		xd.setWebTrainer("Lokesh");
		xd.setJavaTrainer("Omkar");
		xd.setYears(3);
		xd.setGaneshaFest(true);
		xd.setLunch(true);
		xd.setBatch1(20);
		xd.setBatch2(25);
		xd.setBatch3(18);
		xd.setCourseFee(24000);
		xd.setTasks(true);
		xd.setHighestPackage(7.0);
		xd.setOpenTime(9.00);
		xd.setCloseTime(7.00);

		System.out.println(xd.hashCode());

		XworkzDTO xd1 = new XworkzDTO();

		xd1.setName("Xworkz");
		xd1.setOwner("Omkar");
		xd1.setCourse("Java");
		xd1.setHtml(true);
		xd1.setCss(true);
		xd1.setJs(true);
		xd1.setBootstrap(true);
		xd1.setPython(false);
		xd1.setC(false);
		xd1.setSprings(true);
		xd1.setJdbc(true);
		xd1.setSql(true);
		xd1.setCourseType("Development");
		xd1.setHrName("Vinay");
		xd1.setHrName2("Akshara");
		xd1.setNoOfBatches(3);
		xd1.setNoOfBranch(2);
		xd1.setPlacement(true);
		xd1.setPresentation(true);
		xd1.setBranch1("Rajajinagar");
		xd1.setBranch2("BTM");
		xd1.setWebTechnology(true);
		xd1.setWebTrainer("Lokesh");
		xd1.setJavaTrainer("Omkar");
		xd1.setYears(3);
		xd1.setGaneshaFest(true);
		xd1.setLunch(true);
		xd1.setBatch1(20);
		xd1.setBatch2(25);
		xd1.setBatch3(18);
		xd1.setCourseFee(24000);
		xd1.setTasks(true);
		xd1.setHighestPackage(7.0);
		xd1.setOpenTime(9.00);
		xd1.setCloseTime(7.00);

		System.out.println(xd1.hashCode());

		if (xd.hashCode() == xd1.hashCode()) {

			System.out.println(xd.equals(xd1));
		} else {
			System.out.println("It is not equal");
		}
	}
}
