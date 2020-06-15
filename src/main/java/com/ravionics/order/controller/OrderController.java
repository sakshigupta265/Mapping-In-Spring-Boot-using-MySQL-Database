package com.ravionics.order.controller;

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

import com.ravionics.order.entity.Order;
import com.ravionics.order.service.OrderService;

@RestController
public class OrderController {

	@Autowired
	private OrderService orderService;

	@PostMapping(path = "/addOrder")
	public ResponseEntity<String> createOrder(@RequestBody Order order) throws Exception {
		return new ResponseEntity<>(orderService.createOrder(order), HttpStatus.CREATED);
	}

	@GetMapping(path = "/getOrder/{orderId}")
	public ResponseEntity<Order> getOrder(@PathVariable(value = "orderId") int orderId) {
		return new ResponseEntity<>(orderService.getOrder(orderId), HttpStatus.OK);
	}

	@GetMapping(path = "/getAllOrders")
	public ResponseEntity<List<Order>> getAllOrders() {
		return new ResponseEntity<>(orderService.getAllOrders(), HttpStatus.OK);
	}

	@DeleteMapping(path = "/deleteOrder/{orderId}")
	public ResponseEntity<String> deleteOrder(@PathVariable(value = "orderId") int orderId) {
		orderService.deleteOrder(orderId);
		return new ResponseEntity<>("Order with OrderId : " + orderId + " deleted successfully", HttpStatus.OK);
	}

	@PutMapping(path = "/updateOrder")
	public ResponseEntity<Order> updateOrder(@RequestBody Order order) {
		return new ResponseEntity<>(orderService.updateOrder(order), HttpStatus.CREATED);
	}
}