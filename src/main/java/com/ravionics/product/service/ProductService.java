package com.ravionics.product.service;

import java.util.List;

import com.ravionics.product.entity.Product;

public interface ProductService {

	public String createProduct(Product prod) throws Exception;

	public Product updateProduct(Product prod);

	public Product getProduct(int prodId);

	public void deleteProduct(int prodId);

	public List<Product> getAllProducts();

}