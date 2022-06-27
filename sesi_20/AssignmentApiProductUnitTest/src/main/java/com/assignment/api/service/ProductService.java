package com.assignment.api.service;

import java.util.List;

import com.assignment.api.model.Product;

public interface ProductService {
	 List<Product> findAllProduct() ;
	 Product saveorUpdateProduct(Product product);
	 Product findByIdProduct(Integer id);
	 void deleteProduct(Integer id);
}
