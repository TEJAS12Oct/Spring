package com.example.demo;

//Java Program to Illustrate Mobile Class
public class Mobile {

	// Main driver method
	public static void main(String[] args) {
		// Manually creating an instance of Jio

		Sim sim = new Jio();

		// Calling methods
		sim.calling();
		sim.data();

		Sim sim1 = new Airtel(); // Calling methods
		sim1.calling();
		sim1.data();

	}
}
