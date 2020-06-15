package com.ravionics.order_product_quantity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ravionics.order_product_quantity.entity.Order_Product_Quantity;

public interface Order_Product_QuantityRepository extends JpaRepository<Order_Product_Quantity, Integer> {

}
