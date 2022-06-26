package com.latihan.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.latihan.spring.model.Users; 

@Repository
public interface UsersRepository extends JpaRepository<Users, Integer> {

}
