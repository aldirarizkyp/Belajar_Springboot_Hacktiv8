package com.learning.jpastudent.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learning.jpastudent.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Long>{
}
