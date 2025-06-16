package com.example.StereotypeAnnotation.Repository;

public interface RepositoryInteface<T> {

	// Save method
	public void save(T t);

	// Find a student by its id
	public T findStudentById(Long id);

}
