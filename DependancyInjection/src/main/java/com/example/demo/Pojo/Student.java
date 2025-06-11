package com.example.demo.Pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

	// Class data members
	private int id;
	private MathCheat mathCheat;

	// Constructor for Dependency Injection
	public Student(@Value("101") int id, MathCheat mathCheat) {
		this.id = id;
		this.mathCheat = mathCheat;
	}

	// Method to demonstrate functionality
	public void cheating() {
		System.out.println("My ID is: " + id);
		mathCheat.mathCheating();
	}
}
