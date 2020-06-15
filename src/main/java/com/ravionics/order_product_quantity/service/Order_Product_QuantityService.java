package com.ravionics.order_product_quantity.service;

import java.util.List;

import com.ravionics.order_product_quantity.entity.Order_Product_Quantity;

public interface Order_Product_QuantityService {

	public String createOrder_Product_Quantity(Order_Product_Quantity opq) throws Exception;

	public Order_Product_Quantity getOrder_Product_Quantity(int opqId);

	public List<Order_Product_Quantity> getAllOrder_Product_Quantity();

	public Order_Product_Quantity updateOrder_Product_Quantity(Order_Product_Quantity opq);

	public void deleteOrder_Product_Quantity(int opqId);

}