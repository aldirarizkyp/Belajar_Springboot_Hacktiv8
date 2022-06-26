package com.learning.jpabook.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learning.jpabook.entity.BookCategory;

public interface BookCategoryRepository extends JpaRepository<BookCategory, Long> {

}
