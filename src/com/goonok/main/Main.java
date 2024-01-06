package com.goonok.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.goonok.beans.Student;
import com.goonok.resources.SpringConfigFile;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Annotation Base config for beans.xml
		//ApplicationContext context = new ClassPathXmlApplicationContext("/com/goonok/resources/Beans.xml");
		
		
		//Annotation Base config for java config file
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
		Student std = context.getBean("student", Student.class);
		
		System.out.println(std);
		
		
		
	}

}
