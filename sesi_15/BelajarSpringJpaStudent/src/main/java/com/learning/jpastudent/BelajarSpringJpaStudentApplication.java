package com.learning.jpastudent;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.learning.jpastudent.entity.Course;
import com.learning.jpastudent.entity.Student;
import com.learning.jpastudent.repository.CourseRepository;
import com.learning.jpastudent.repository.StudentRepository;

@SpringBootApplication
public class BelajarSpringJpaStudentApplication implements CommandLineRunner{

	private final Logger LOG = 
			LoggerFactory.getLogger(BelajarSpringJpaStudentApplication.class);
			
			@Autowired
			private StudentRepository studentRepository;
	
			@Autowired
			private CourseRepository courseRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(BelajarSpringJpaStudentApplication.class, args);
	}
			
			@Override
			public void run(String...args) throws Exception {
				//create a student
				Student student = new Student("Bagas Okta", 15);
				
				//save the student
				studentRepository.save(student);
				
				//create the course
				Course course1= new Course("Beginning Spring Boot", 12, 1500);
				Course course2= new Course("Spring Reactive", 8,800);
				Course course3= new Course("Basic Microservices",9,100);
				
				//save courses
				courseRepository.saveAll(Arrays.asList(course1, course2, course3));
				
				//add courses to the student
				student.getCourses().addAll(Arrays.asList(course1, course2, course3));			
				
				//update the student
				studentRepository.save(student);
			
			}
}
