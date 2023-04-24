package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.StudentRepository;
import com.example.demo.model.Student;

@Service
public class StudentService {

	@Autowired
	StudentRepository studRepo;
	
	public List<Student> getAllStudent() {
		List<Student>stud_list=studRepo.findAll();
		return stud_list;
	}
	
	public Student saveStudent(Student s) {
		return studRepo.save(s);
	}
}
