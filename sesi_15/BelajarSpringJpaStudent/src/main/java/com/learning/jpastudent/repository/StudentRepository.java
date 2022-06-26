package com.learning.jpastudent.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learning.jpastudent.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
