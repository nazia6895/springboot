package com.example.springdatajpa;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.springdatajpa.model.Student;
import com.example.springdatajpa.repositories.StudentRepository;


@SpringBootTest
class SpringdatajpaApplicationTests {

	@Autowired
	private StudentRepository repository;
	
	@Test
	public void testStuden() {
		Student s = new Student(1l, "Nazia", 100);
		repository.save(s);
		Student s1 = repository.findById(1l).get();
		System.out.println(s1.toString());
		s.setTestScore(99);
		repository.save(s);
		s1 = repository.findById(1l).get();
		System.out.println(s1.toString());
		repository.delete(s1);
	}

}
