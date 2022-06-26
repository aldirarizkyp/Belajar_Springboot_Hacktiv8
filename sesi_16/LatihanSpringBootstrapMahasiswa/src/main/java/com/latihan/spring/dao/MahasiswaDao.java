package com.latihan.spring.dao;

import org.springframework.data.repository.PagingAndSortingRepository;
import com.latihan.spring.entity.Mahasiswa;

public interface MahasiswaDao extends PagingAndSortingRepository<Mahasiswa, String> {
	
}
