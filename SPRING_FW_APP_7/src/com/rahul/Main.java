package com.rahul;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {
	public static void main(String[] args) {

		ApplicationContext container = new FileSystemXmlApplicationContext("/spring.xml");

		Address address = (Address) container.getBean("address");

		List<String> city = address.getCity();

		System.out.println("*************** USED LIST COLLETION  ***************");

		city.forEach(System.out::println);
		System.out.println("Total Number Of Element is " + city.size());

		System.out.println();
		
		
		
		
		

		System.out.println("*************** USED SET COLLETION  ***************");

		Set<String> book = address.getBooks();
		book.forEach(System.out::println);
		System.out.println("Total Number Of Element is " + book.size());

		System.out.println();
		
		


		System.out.println("*************** USED MAP COLLETION  ***************");
		

		Map<String, Integer> hobies = address.getHobbies();
		System.out.println("Total Number Of Element is " + hobies.size());

		System.out.println();
		
		
		

	}
}
