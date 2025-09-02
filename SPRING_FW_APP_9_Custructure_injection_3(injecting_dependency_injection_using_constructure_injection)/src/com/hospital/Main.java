package com.hospital;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.rahul.Address;

public class Main {
	
	public static void main(String[] args) {
		
		ApplicationContext container = new FileSystemXmlApplicationContext("/spring.xml");
		
		
		Building Building = (Building) container.getBean("Building");
		
			

		System.out.println(Building.getName());
		System.out.println(Building.getHospital());
		
		
		
	}


}

