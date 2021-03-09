package com.xworkz.xworkzapp.service;

import com.xworkz.xworkzapp.dto.HospitalDto;

public interface HospitalService {
	
	public void validateHospitalDetails(HospitalDto dto);
	public void display();
	public void display(String name,String licenceNo);
	public void validationForUpdate(String licenceNo,String phoneNo);
	public void validateForDelete(String name);

}
