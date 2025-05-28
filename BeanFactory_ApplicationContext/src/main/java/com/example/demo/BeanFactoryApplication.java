package com.example.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.demo.Pojo.Student;

@SpringBootApplication
public class BeanFactoryApplication {

	public static void main(String[] args) {
		BeanFactory Factory = new ClassPathXmlApplicationContext("beans.xml");
		Student student = (Student) Factory.getBean("student");
		System.out.println("Data : " + student);

	}

}

//Refer beans.xml
