package com.xworkz.dtoconcept.dto;

import java.io.Serializable;

public class XworkzDTO implements Serializable {
	
	private String name;
	private String owner;
	private String course;
	private boolean html;
	private boolean css;
	private boolean js;
	private boolean bootstrap;
	private boolean python;
	private boolean c;
	private boolean springs;
	private boolean jdbc;
	private boolean sql;
	private String courseType;
	private String hrName;
	private String hrName2;
	private int noOfBatches;
	private int noOfBranch;
	private boolean placement;
	private boolean presentation;
	private String branch1;
	private String branch2;
	private boolean webTechnology;
	private String webTrainer;
	private String javaTrainer;
	private int years;
	private boolean ganeshaFest;
	private boolean lunch;
	private int batch1;
	private int batch2;
	private int batch3;
	private int courseFee;
	private boolean tasks;
	private double highestPackage;
	private double openTime;
	private double closeTime;
	
	
	public XworkzDTO() {
		System.out.println("Default constructor");
	}
	
	@Override
	public int hashCode() {
		return 7984;
	}
	
	public String getName() {
		return name;
	}

	public String getOwner() {
		return owner;
	}

	public String getCourse() {
		return course;
	}

	public boolean isHtml() {
		return html;
	}

	public boolean isCss() {
		return css;
	}

	public boolean isJs() {
		return js;
	}

	public boolean isBootstrap() {
		return bootstrap;
	}

	public boolean isPython() {
		return python;
	}

	public boolean isC() {
		return c;
	}

	public boolean isSprings() {
		return springs;
	}

	public boolean isJdbc() {
		return jdbc;
	}

	public boolean isSql() {
		return sql;
	}

	public String getCourseType() {
		return courseType;
	}

	public String getHrName() {
		return hrName;
	}

	public String getHrName2() {
		return hrName2;
	}

	public int getNoOfBatches() {
		return noOfBatches;
	}

	public int getNoOfBranch() {
		return noOfBranch;
	}

	public boolean isPlacement() {
		return placement;
	}

	public boolean isPresentation() {
		return presentation;
	}

	public String getBranch1() {
		return branch1;
	}

	public String getBranch2() {
		return branch2;
	}

	public boolean isWebTechnology() {
		return webTechnology;
	}

	public String getWebTrainer() {
		return webTrainer;
	}

	public String getJavaTrainer() {
		return javaTrainer;
	}

	public int getYears() {
		return years;
	}

	public boolean isGaneshaFest() {
		return ganeshaFest;
	}

	public boolean isLunch() {
		return lunch;
	}

	public int getBatch1() {
		return batch1;
	}

	public int getBatch2() {
		return batch2;
	}

	public int getBatch3() {
		return batch3;
	}

	public int getCourseFee() {
		return courseFee;
	}

	public boolean isTasks() {
		return tasks;
	}

	public double getHighestPackage() {
		return highestPackage;
	}

	public double getOpenTime() {
		return openTime;
	}

	public double getCloseTime() {
		return closeTime;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public void setHtml(boolean html) {
		this.html = html;
	}

	public void setCss(boolean css) {
		this.css = css;
	}

	public void setJs(boolean js) {
		this.js = js;
	}

	public void setBootstrap(boolean bootstrap) {
		this.bootstrap = bootstrap;
	}

	public void setPython(boolean python) {
		this.python = python;
	}

	public void setC(boolean c) {
		this.c = c;
	}

	public void setSprings(boolean springs) {
		this.springs = springs;
	}

	public void setJdbc(boolean jdbc) {
		this.jdbc = jdbc;
	}

	public void setSql(boolean sql) {
		this.sql = sql;
	}

	public void setCourseType(String courseType) {
		this.courseType = courseType;
	}

	public void setHrName(String hrName) {
		this.hrName = hrName;
	}

	public void setHrName2(String hrName2) {
		this.hrName2 = hrName2;
	}

	public void setNoOfBatches(int noOfBatches) {
		this.noOfBatches = noOfBatches;
	}

	public void setNoOfBranch(int noOfBranch) {
		this.noOfBranch = noOfBranch;
	}

	public void setPlacement(boolean placement) {
		this.placement = placement;
	}

	public void setPresentation(boolean presentation) {
		this.presentation = presentation;
	}

	public void setBranch1(String branch1) {
		this.branch1 = branch1;
	}

	public void setBranch2(String branch2) {
		this.branch2 = branch2;
	}

	public void setWebTechnology(boolean webTechnology) {
		this.webTechnology = webTechnology;
	}

	public void setWebTrainer(String webTrainer) {
		this.webTrainer = webTrainer;
	}

	public void setJavaTrainer(String javaTrainer) {
		this.javaTrainer = javaTrainer;
	}

	public void setYears(int years) {
		this.years = years;
	}

	public void setGaneshaFest(boolean ganeshaFest) {
		this.ganeshaFest = ganeshaFest;
	}

	public void setLunch(boolean lunch) {
		this.lunch = lunch;
	}

	public void setBatch1(int batch1) {
		this.batch1 = batch1;
	}

	public void setBatch2(int batch2) {
		this.batch2 = batch2;
	}

	public void setBatch3(int batch3) {
		this.batch3 = batch3;
	}

	public void setCourseFee(int courseFee) {
		this.courseFee = courseFee;
	}

	public void setTasks(boolean tasks) {
		this.tasks = tasks;
	}

	public void setHighestPackage(double highestPackage) {
		this.highestPackage = highestPackage;
	}

	public void setOpenTime(double openTime) {
		this.openTime = openTime;
	}

	public void setCloseTime(double closeTime) {
		this.closeTime = closeTime;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
			System.out.println("Object is not a null");
			if(obj instanceof XworkzDTO) {
				XworkzDTO cast = (XworkzDTO)obj;
				if(cast.name.equals(this.name) && cast.owner.equals(this.owner)) {
					System.out.println("Both " +this.name +"&" +this.owner);
					return true;
				}
			}
		}
		else {
			System.out.println("Object is null");
		}
		return super.equals(obj);
	}

}
