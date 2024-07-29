package com.integra.aspect.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.integra.aspect.model.Product;
import com.integra.aspect.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	public List<Product> findAll(){
		return productRepository.findAll();
	}
	public Product saveProduct(Product products) {
		return productRepository.save(products);
	}
	public Optional<Product> findById(int id){
		return productRepository.findById(id);
	}

}
