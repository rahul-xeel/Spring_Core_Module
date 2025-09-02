package com.rahul;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		
	
        // Object creation from xml 
		
		ApplicationContext container = new FileSystemXmlApplicationContext("/spring.xml");
		
		
		

		
		//	 GETTING ADDRESS OBJECT FROM BEAN 	
		Address address = (Address) container.getBean("address");	
		System.out.println();
		System.out.println("------------ Calling Methos from Adress Object ------------");
		System.out.println();
		System.out.println("My city is :- "+address.getCity());
		System.out.println("My State is :- "+address.getState());
		System.out.println("My Post is :- "+address.getPost());
		System.out.println("Memory Adress of Adress Object is :- " + address);
		
		
		
		
		//   GETTING EDUCATION OBJECT FROM BEAN 	
		Education education = (Education) container.getBean("education");	
		System.out.println();
		System.out.println("------------ Calling Methos from Education Object ------------");
		System.out.println();
		System.out.println("My Enter Marks  is :- "+education.getEnter_marks());
		System.out.println("My Mtric Marks is :- "+education.getMatric_marks());
		System.out.println("My Graduation is :- "+education.getGraduation_marks());
		System.out.println("Memory Adress of Education Object is :- " + education);
		System.out.println("Memory Adress of Adress Object is :- " + education.getAddress());
		System.out.println("Adress.city :- " + education.getAddress().getCity());
		
		
			

	}
}
