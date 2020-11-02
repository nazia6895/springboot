package com.example.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springrest.model.Product;
import com.example.springrest.repos.ProductRepository;

@RestController
public class ProductRESTController {
	
	@Autowired
	ProductRepository repo;
	
	@GetMapping(value="/products/")
	public List<Product> getProducts(){
		return repo.findAll();
	}
	
	@GetMapping(value="/products/{id}")
	public Product getProduct(@PathVariable (value="id") int id){
		return repo.findById(id).get();
	}
	
	@PostMapping(value="/products/")
	public Product create(@RequestBody Product p){
		return repo.save(p);
	}
	
	@PutMapping(value="/products/")
	public Product update(@RequestBody Product p){
		return repo.save(p);
	}
	
	@DeleteMapping(value="/products/{id}")
	public void delete(@PathVariable (value="id") int id){
		repo.deleteById(id);
		return;
	}

}
