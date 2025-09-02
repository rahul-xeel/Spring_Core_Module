package com.hospital;

import java.util.List;

public class Building {
	

	private Hospital_details Hospital;
	
	private String name;
	

	public Hospital_details getHospital() {
		return Hospital;
	}

	public void setHospital(Hospital_details hospital) {
		Hospital = hospital;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public Building(Hospital_details hospital, String name) {
		super();
		Hospital = hospital;
		this.name = name;
	}


	
	
	

}

