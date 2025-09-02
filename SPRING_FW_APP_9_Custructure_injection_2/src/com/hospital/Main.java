package com.hospital;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.rahul.Address;

public class Main {
	
	public static void main(String[] args) {
		
		ApplicationContext container = new FileSystemXmlApplicationContext("/spring.xml");
		
		Patient Patient = (Patient) container.getBean("patient");

		String Name = Patient.getName();
		
		System.out.println(Name);
		
		List<String> medicine = Patient.getMedicine();
		
		System.out.println(medicine);
		
		
		
		
	}


}

