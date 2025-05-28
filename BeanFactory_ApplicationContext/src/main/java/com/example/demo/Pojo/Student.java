package com.example.demo.Pojo;

public class Student {
	public String Name;
	public int age;

	public Student() {
	}

	public Student(String name, int age) {
		this.Name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [Name : " + Name + ", age : " + age + "]";
	}

}
