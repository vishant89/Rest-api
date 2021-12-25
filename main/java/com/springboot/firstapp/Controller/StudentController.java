package com.springboot.firstapp.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.firstapp.Student;

@RestController
public class StudentController {
	@GetMapping(value = "/student")
	public Student getsStudent() {
		return new Student("Ramesh" , "Kumar");
	}
   
	@GetMapping( value = "/Students")
	public List<Student> getStudents(){
		List<Student> students = new ArrayList<>();
		students.add(new Student("Akash " , "Kumar"));
		students.add(new Student("Akash1 " , "Kumar1"));
		students.add(new Student("Akash2 " , "Kumar2"));
	  return students;
	}
		
	
		
	
	
	
}
