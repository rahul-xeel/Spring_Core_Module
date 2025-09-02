package com.hospital;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		
		ApplicationContext container = new FileSystemXmlApplicationContext("/spring.xml");
		
		
		Building Building = (Building) container.getBean("Building");
		
		System.out.println(Building);
		Building.setName("Samarpan");
		System.out.println(Building.getHospital_details());	
		System.out.println(Building.getHospital_details_2());	
	}


}

