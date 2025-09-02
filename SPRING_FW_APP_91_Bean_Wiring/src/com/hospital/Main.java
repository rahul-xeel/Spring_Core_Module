package com.hospital;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.rahul.Address;

public class Main {
	
	public static void main(String[] args) {
		
		ApplicationContext container = new FileSystemXmlApplicationContext("/spring.xml");
		
		
		Area Area = (Area) container.getBean("Area");
		
			

		System.out.println(Area);
		System.out.println(Area.getBuilding());
		System.out.println(Area.getBuilding().getHospital());
		
		
		
	}


}

