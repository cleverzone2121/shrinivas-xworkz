package com.xworkz.xworkzapp.dao;

import com.xworkz.xworkzapp.dto.HospitalDto;

public class HospitalDaoImpl implements HospitalDao {
	
		HospitalDto hosdto[] = new HospitalDto[2];
		int index = 0;

		public HospitalDaoImpl() {
			System.out.println("HospitalDaoImpl constructor is called");
		}

		@Override
		public void addHospitalDetails(HospitalDto dto) {
			hosdto[index] = dto;
			index++;
			System.out.println("data added successfully" + "\n");

		}

		@Override
		public void addDisplay() {
			System.out.println("Inside display method ");
			
			for (int i = 0; i < index; i++) {
				if(hosdto[i]!=null) {
				System.out.println("Hospital licenceNo is " + hosdto[i].getLicenceNo());
				System.out.println("Hospital name is " + hosdto[i].getName());
				System.out.println("Hospital location is " + hosdto[i].getLocation());
				System.out.println("Hospital founder is " + hosdto[i].getFounder());
				System.out.println("Hospital Specialisation is " + hosdto[i].getSpecialisation());
				System.out.println("Hospital phoneNo is " + hosdto[i].getPhoneNo() + "\n");

			}
			}
		}

		@Override
		public void addDisplay(String name, String licenceNo) {
			System.out.println(" Inside display method using name and licenceNo");
			for (int i = 0; i < index; i++) {
				if (hosdto[i].getName().equals(name) && hosdto[i].getLicenceNo().equals(licenceNo)) {
					System.out.println("Hos licenceNo is " + hosdto[i].getLicenceNo());
					System.out.println("Hos name is " + hosdto[i].getName());
					System.out.println("Hos location is " + hosdto[i].getLocation());
					System.out.println("Hos founder is " + hosdto[i].getFounder());
					System.out.println("Hos Specialisation is " + hosdto[i].getSpecialisation());
					System.out.println("Hos phoneNo is " + hosdto[i].getPhoneNo() + "\n");

				}
			}

		}

		@Override
		public void updateusing(String licenceNo, String phoneNo) {
			System.out.println("Inside update method using licenceNo and phoneNo");
			for (int i = 0; i < hosdto.length; i++) {
				if (hosdto[i].getLicenceNo().equals(licenceNo)) {
					hosdto[i].setPhoneNo(phoneNo);
				}
			}
		}

		@Override
		public void delete(String name) {
			System.out.println("Inside Delete method ");
			for (int i = 0; i < hosdto.length; i++) {
				if(hosdto[i].getName()==name) {
					hosdto[i]=null;
				}else
					System.out.println("Invalid name");
					
			}
		}
	}


