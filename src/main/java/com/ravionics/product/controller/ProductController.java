package com.ravionics.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ravionics.product.entity.Product;
import com.ravionics.product.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService productService;

	@PostMapping(path = "/addProduct")
	public ResponseEntity<String> createProduct(@RequestBody Product prod) throws Exception {
		return new ResponseEntity<>(productService.createProduct(prod), HttpStatus.CREATED);
	}

	@GetMapping(path = "/getProduct/{prodId}")
	public ResponseEntity<Product> getProduct(@PathVariable(value = "prodId") int prodId) {
		return new ResponseEntity<>(productService.getProduct(prodId), HttpStatus.OK);
	}

	@GetMapping(path = "/getAllProducts")
	public ResponseEntity<List<Product>> getAllProducts() {
		return new ResponseEntity<>(productService.getAllProducts(), HttpStatus.OK);
	}

	@PutMapping(path = "/updateProduct")
	public ResponseEntity<Product> updateProduct(@RequestBody Product prod) {
		return new ResponseEntity<>(productService.updateProduct(prod), HttpStatus.CREATED);
	}

	@DeleteMapping(path = "/deleteProduct/{prodId}")
	public ResponseEntity<String> deleteProduct(@PathVariable(value = "prodId") int prodId) {
		productService.deleteProduct(prodId);
		return new ResponseEntity<>("Product with ProductId : " + prodId + " deleted successfully", HttpStatus.OK);
	}

}