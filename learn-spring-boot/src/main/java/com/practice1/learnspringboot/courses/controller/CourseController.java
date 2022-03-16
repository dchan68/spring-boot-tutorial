package com.practice1.learnspringboot.courses.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice1.learnspringboot.courses.bean.Courses;

@RestController
public class CourseController {
	
	//http://localhost:8080/courses
	@GetMapping("/courses")
	public List<Courses> getAllCourses(){
		return Arrays.asList(new Courses(1, "Learn microservices", "in28minutes"),
							 new Courses(2, "Learn Full Stack", "in28minutes"));
	}
	
	//http://localhost:8080/courses/1
	@GetMapping("/courses/1")
	public Courses getCourseDetails(){
		return new Courses(1, "Learn microservices 1", "in28minutes");
	}

}
