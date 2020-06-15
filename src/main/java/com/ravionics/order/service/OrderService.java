package com.ravionics.order.service;

import java.util.List;

import com.ravionics.order.entity.Order;

public interface OrderService {

	public String createOrder(Order order) throws Exception;

	public Order getOrder(int orderId);

	public List<Order> getAllOrders();

	public Order updateOrder(Order order);

	public void deleteOrder(int orderId);

}