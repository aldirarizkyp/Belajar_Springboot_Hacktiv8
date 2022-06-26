package com.latihan.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.latihan.spring.model.Addresses;
import com.latihan.spring.model.Users;
import com.latihan.spring.repository.AddressesRepository;
import com.latihan.spring.repository.UsersRepository;

@SpringBootApplication
public class LatihanSpringHibernateApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(LatihanSpringHibernateApplication.class, args);
	}
	
	//Inject repository addressses dan users
	@Autowired
	private AddressesRepository addressesRepository;
	
	@Autowired
	private UsersRepository usersRepository;
	
	@Override
	public void run(String...args) throws Exception {
		
		Addresses address = new Addresses("Jakarta", "Indonesia", "Indonesia", "Senayan", "12980");
//	    address.setCity("Jakarta");
//	    address.setCountry("Indonesia");
//	    address.setState("Indonesia");
//	    address.setStreet("Senayan");
//	    address.setZipCode("12980");
	    
		Users users = new Users("aaa@gmail.com", "Aldira", "12345");
//		users.setEmail("aaa@gmail.com");
//		users.setName("Aldira");
//		users.setPassword("12345");
		
		
		// parent set ke child 
		address.setUsers(users);
		// child set  ke parent
		users.setAddresses(address);
		
		addressesRepository.save(address);
	}
	

}
