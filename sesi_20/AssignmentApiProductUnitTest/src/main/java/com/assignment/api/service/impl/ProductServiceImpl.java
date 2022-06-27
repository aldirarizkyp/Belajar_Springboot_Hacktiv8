package com.assignment.api.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.api.model.Product;
import com.assignment.api.repository.ProductRepository;
import com.assignment.api.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public List<Product> findAllProduct() {
		return productRepository.findAll();
	}

	@Override
	public Product saveorUpdateProduct(Product product) {
		return productRepository.save(product);
	}

	@Override
	public Product findByIdProduct(Integer id) {
		 Product product = productRepository.findById(id).orElse(new Product());
		return product;
	}

	@Override
	public void deleteProduct(Integer id) {
		 Product product = productRepository.findById(id).orElse(new Product());
		productRepository.delete(product);
	}

}
