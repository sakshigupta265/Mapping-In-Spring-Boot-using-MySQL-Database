package com.ravionics.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ravionics.product.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
