package com.ravionics.product.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.ravionics.brand.entity.Brand;
//import com.ravionics.brand.repository.BrandRepository;
import com.ravionics.product.entity.Product;
import com.ravionics.product.repository.ProductRepository;
//import com.ravionics.sector.entity.Sector;
//import com.ravionics.sector.repository.SectorRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;

	@Override
	public String createProduct(Product prod) throws Exception {
		productRepository.save(prod);
		int productId = prod.getProduct_id();
		return "Product with product Id " + productId + " Created!";

	}

	@Override
	public Product getProduct(int prodId) {
		Optional<Product> optionalProd = productRepository.findById(prodId);
		if (optionalProd.isPresent()) {
			return optionalProd.get();
		}
		return null;
	}

	@Override
	public List<Product> getAllProducts() {
		return productRepository.findAll();
	}

	@Override
	public Product updateProduct(Product prod) {
		return productRepository.save(prod);
	}

	@Override
	public void deleteProduct(int prodId) {
		productRepository.deleteById(prodId);
	}

}