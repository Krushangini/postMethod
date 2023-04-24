package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService student;

	@GetMapping(value="/fetchstudent")
	public List<Student> getAllStudent(){
		List<Student> stud_list = student.getAllStudent();
		return stud_list;
	}
	
	@PostMapping(value="/save-student")
	public Student saveStudent(@RequestBody Student st){
		return student.saveStudent(st);
	}
	
}
