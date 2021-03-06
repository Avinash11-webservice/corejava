package com.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Product;
import com.demoserviceimp.ProductServiceImpl;

@RestController
public class ProductController {
  //injecting the dependencies of product implementation
	@Autowired
	ProductServiceImpl service;

	//inserting product details like id ,name,manufacturer
	
	@PostMapping("/addproductdetails")
	Product addProductDetails(@RequestBody Product product) {

		Product prod = service.addProductDetails(product);

		return prod;

	}

}


