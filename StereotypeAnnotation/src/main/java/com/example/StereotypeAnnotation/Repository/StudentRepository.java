package com.example.StereotypeAnnotation.Repository;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.example.StereotypeAnnotation.Entity.Student;

@Repository
public class StudentRepository implements RepositoryInteface<Student> {

	// Using an in-memory Map
	// to store the object data
	private Map<Long, Student> repository;

	public StudentRepository() {
		this.repository = new HashMap<>();
	}

	// Implementation for save method
	@Override
	public void save(Student student) {
		repository.put(student.getId(), student);
	}

	// Implementation for findStudentById method
	@Override
	public Student findStudentById(Long id) {
		return repository.get(id);
	}
}