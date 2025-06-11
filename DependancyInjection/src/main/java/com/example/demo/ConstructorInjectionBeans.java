package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.demo.Pojo.Student;

@SpringBootApplication
public class ConstructorInjectionBeans {

	public static void main(String[] args) {
		// Load the Spring application context
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		// Retrieve the Student bean
		Student student = context.getBean("student", Student.class);

		// Call the cheating() method
		student.cheating();
	}

}
