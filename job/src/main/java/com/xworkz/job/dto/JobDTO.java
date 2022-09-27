package com.xworkz.job.dto;

public class JobDTO {
	
	public JobDTO() {
		System.out.println("Default constructor");
	}
	
	private String name;
	private String email;
	private Long phone;
	private Long alternate;
	private String gender;
	private String qualification;
	private Integer passout;
	private String university;
	private String address;
	private String skills;
	private Integer salary;
	private String experience;
	private String proof;
	private Long number;
	
	public JobDTO(String name, String email, Long phone, Long alternate, String gender, String qualification,
			Integer passout, String university, String address, String skills, Integer salary, String experience,
			String proof, Long number) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.alternate = alternate;
		this.gender = gender;
		this.qualification = qualification;
		this.passout = passout;
		this.university = university;
		this.address = address;
		this.skills = skills;
		this.salary = salary;
		this.experience = experience;
		this.proof = proof;
		this.number = number;
	}
	@Override
	public String toString() {
		return "JobDTO [name=" + name + ", email=" + email + ", phone=" + phone + ", alternate=" + alternate
				+ ", gender=" + gender + ", qualification=" + qualification + ", passout=" + passout + ", university="
				+ university + ", address=" + address + ", skills=" + skills + ", salary=" + salary + ", experience="
				+ experience + ", proof=" + proof + ", number=" + number + "]";
	}
	
	
	
	

}
