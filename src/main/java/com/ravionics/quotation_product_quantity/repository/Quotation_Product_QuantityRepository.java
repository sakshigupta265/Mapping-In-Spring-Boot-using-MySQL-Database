package com.ravionics.quotation_product_quantity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ravionics.quotation_product_quantity.entity.Quotation_Product_Quantity;

public interface Quotation_Product_QuantityRepository extends JpaRepository<Quotation_Product_Quantity, Integer> {

}
