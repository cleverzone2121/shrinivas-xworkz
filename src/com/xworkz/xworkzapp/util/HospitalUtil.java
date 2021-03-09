package com.xworkz.xworkzapp.util;

import com.xworkz.xworkzapp.dto.HospitalDto;
import com.xworkz.xworkzapp.service.HospitalService;
import com.xworkz.xworkzapp.service.HospitalServiceImpl;

public class HospitalUtil {
	
	public static void main(String[] args) {
		
		
		HospitalDto hdto =new HospitalDto("MYS006", "APOLLO HEALTH", "AKSHAYA BHANDARA", "SHRINIVAS", "HEART AND NERVES", "8296456112");
		HospitalDto hdto1 =new HospitalDto("BLR654", "VICTORIA", "K R MARKET", "KRISHNA", "COVID 19", "9902714200");
		
		HospitalService himp = new HospitalServiceImpl();
		
		
		himp.validateHospitalDetails(hdto);
		himp.validateHospitalDetails(hdto1);
		himp.display();
		himp.display("VICTORIA","BLR654");
		himp.validationForUpdate("MYS006" , " 8861472988");
		himp.display();
		himp.validateForDelete("VICTORIA");
		himp.display();
		}
	}



