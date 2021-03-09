package com.xworkz.xworkzapp.dao;

import com.xworkz.xworkzapp.dto.HospitalDto;

public interface HospitalDao {
	
	public void addHospitalDetails(HospitalDto dto);
	public void addDisplay();
	public void addDisplay(String name,String licenceNo);
	public void updateusing(String licenceNo,String phoneNo);
	public void delete(String name);


}
