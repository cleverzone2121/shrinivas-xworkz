package com.xworkz.xworkzapp.dto;

public class HospitalDto {
	
	private String licenceNo;
	private String name;
	private String location;
	private String founder;
	private String specialisation;
	private String phoneNo;
	
	public HospitalDto(String licenceNo, String name, String location, String founder, String specialisation,
			String phoneNo) {
		System.out.println("HospitalDto constructor is called");
		this.licenceNo = licenceNo;
		this.name = name;
		this.location = location;
		this.founder = founder;
		this.specialisation = specialisation;
		this.phoneNo = phoneNo;
	}

	public String getLicenceNo() {
		return licenceNo;
	}

	public void setLicenceNo(String licenceNo) {
		this.licenceNo = licenceNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getFounder() {
		return founder;
	}

	public void setFounder(String founder) {
		this.founder = founder;
	}

	public String getSpecialisation() {
		return specialisation;
	}

	public void setSpecialisation(String specialisation) {
		this.specialisation = specialisation;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	
}



