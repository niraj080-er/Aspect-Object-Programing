package com.integra.aspect.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.integra.aspect.model.Product;
import com.integra.aspect.service.ProductService;


@RestController
@RequestMapping("/product")
public class Producctcontroller {
		
	@Autowired 
	private ProductService productService;
	
	@PostMapping()
	public Product saveProduct(@RequestBody Product products){
		return productService.saveProduct(products);
		
	}
	@GetMapping("/findbyid/{id}")
	public Optional<Product> findById(@PathVariable int id){
		return productService.findById(id);
	}
	@GetMapping("/findall")
	public List<Product> findAll(){
		return productService.findAll();
	}

}
