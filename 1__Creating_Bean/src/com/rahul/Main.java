package com.rahul;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext container =
                new ClassPathXmlApplicationContext("spring.xml");
        
        

    		Object obj = container.getBean("student");
    	
        Student sdt = (Student)obj;
        
        sdt.setName("Rahul kumar");
        System.out.println("Name is " + sdt.getName());
        
        sdt.setAge(20);
        System.out.println("Age is " + sdt.getAge());
        
        sdt.setRoll(41);
        System.out.println("Roll is " + sdt.getRoll());

        
    }
}
