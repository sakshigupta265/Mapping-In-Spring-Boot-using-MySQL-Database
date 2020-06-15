package com.ravionics.order.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ravionics.order.entity.Order;
import com.ravionics.order.repository.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService {
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public String createOrder(Order quot) throws Exception {

		orderRepository.save(quot);

		int quotId = quot.getOrder_id();

		return "Order with Order Id " + quotId + " Created!";
	}

	@Override
	public Order getOrder(int orderId) {
		Optional<Order> optionalOrder = orderRepository.findById(orderId);
		if (optionalOrder.isPresent()) {
			return optionalOrder.get();
		}
		return null;
	}

	@Override
	public List<Order> getAllOrders() {
		return orderRepository.findAll();
	}

	@Override
	public Order updateOrder(Order order) {
		return orderRepository.save(order);
	}

	@Override
	public void deleteOrder(int orderId) {
		orderRepository.deleteById(orderId);
	}
}