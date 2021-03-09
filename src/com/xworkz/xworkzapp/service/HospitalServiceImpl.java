package com.xworkz.xworkzapp.service;

import com.xworkz.xworkzapp.dao.HospitalDaoImpl;
import com.xworkz.xworkzapp.dto.HospitalDto;

public class HospitalServiceImpl implements HospitalService {
	
	private HospitalDaoImpl imp = new HospitalDaoImpl();

	@Override
	public void validateHospitalDetails(HospitalDto dto) {
		boolean isValidData = true;
		if (dto.getLicenceNo() == null || dto.getLicenceNo().length() != 6) {
			System.out.println("Invalid licenceNo");
			isValidData = false;
		}
	
		  if(dto.getName()==null || dto.getName().length()<6) {
		 System.out.println("Invalid Name");
		 isValidData = false; 
		 //return isValidData;
		  } 
		  if(dto.getLocation()==null || dto.getLocation().length()<4) {
		  System.out.println("Invalid location"); 
		  isValidData =false; 
		   } 
		  if(dto.getFounder()==null || dto.getFounder().length()<6) {
		  System.out.println("Invalid founder name"); 
		  isValidData=false; 
		  } 
		  if(dto.getSpecialisation()==null || dto.getSpecialisation().length()<7) {
		  System.out.println("Invalid Specialisation"); 
		  isValidData = false; 
		   } 
		  if(dto.getPhoneNo()==null || dto.getPhoneNo().length()<10 ) {
		  System.out.println("Invalid phoneNo"); 
		  isValidData = false; 
		  }
		 
		if (isValidData) {
			imp.addHospitalDetails(dto);
	}
	}

	@Override
	public void display() {
		imp.addDisplay();
	}

	

	@Override
	public void display(String name, String licenceNo) {
		imp.addDisplay(name, licenceNo);
	}

	@Override
	public void validationForUpdate(String licenceNo, String phoneNo) {
		if(licenceNo!=null && phoneNo!=null) {
			imp.updateusing(licenceNo, phoneNo);
		}else {
			System.out.println(" invalid input");
		}
	}

	@Override
	public void validateForDelete(String name) {
		if(name!=null) {
			imp.delete(name);
		}
		
	}

}



