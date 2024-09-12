package com.course;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
@RestController
public class CourseServiceApplication {

	@GetMapping("/viewCourses")
	public List<Course> viewCourse(){
		return Stream.of(
			new Course("C001","Java Basics",100.0),
			new Course("C002","Spring Boot Mastery",200.0)

		).collect(Collectors.toList());

	}

	public static void main(String[] args) {
		SpringApplication.run(CourseServiceApplication.class, args);
	}

}
