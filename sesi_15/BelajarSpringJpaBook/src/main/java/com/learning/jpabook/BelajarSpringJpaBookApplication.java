package com.learning.jpabook;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.learning.jpabook.entity.Book;
import com.learning.jpabook.entity.BookCategory;
import com.learning.jpabook.repository.BookCategoryRepository;
import com.learning.jpabook.repository.BookRepository;



@SpringBootApplication
public class BelajarSpringJpaBookApplication implements CommandLineRunner {
	
	private final Logger LOG = LoggerFactory.getLogger(BelajarSpringJpaBookApplication.class);

    @Autowired
    private BookRepository bookRepository;
    
    @Autowired
    private BookCategoryRepository bookCategoryRepository;
    
	public static void main(String[] args) {
		SpringApplication.run(BelajarSpringJpaBookApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		BookCategory bookCategory = bookCategoryRepository.save(new BookCategory("Programming",
				new Book("Java1","Teten N.","SEI92002"), new Book("Java 2", "Teten N.","UEOEI829")));
		
		LOG.info("BookCategory : "+bookCategory);
		
	}

}
