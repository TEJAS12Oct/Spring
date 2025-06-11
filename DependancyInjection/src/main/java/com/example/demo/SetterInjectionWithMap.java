package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.demo.Pojo.InfoBean;

public class SetterInjectionWithMap {
	public static void main(String[] args) {

		ApplicationContext con = new ClassPathXmlApplicationContext("beans.xml");
		InfoBean infoBean = (InfoBean) con.getBean("info");
		infoBean.display();
	}
}
