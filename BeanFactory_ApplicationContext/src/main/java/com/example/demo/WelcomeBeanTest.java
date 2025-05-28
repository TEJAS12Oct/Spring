package com.example.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.demo.Pojo.WelcomeBean;

public class WelcomeBeanTest {
	public static void main(String[] args) {

		// Load the Spring context from XML
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		System.out.println("Before getBean() method");

		// Retrieve the bean 
		WelcomeBean welcome = (WelcomeBean) context.getBean("welcomeBean");

		// Call method
		System.out.println(welcome.welcomeMsg());

		// Close context to trigger destroy method
		context.close();

	}
}
