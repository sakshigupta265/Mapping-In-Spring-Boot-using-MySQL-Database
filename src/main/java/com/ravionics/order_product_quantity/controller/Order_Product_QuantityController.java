package com.ravionics.order_product_quantity.controller;

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

import com.ravionics.order_product_quantity.entity.Order_Product_Quantity;
import com.ravionics.order_product_quantity.service.Order_Product_QuantityService;

@RestController
public class Order_Product_QuantityController {

	@Autowired
	private Order_Product_QuantityService order_product_quantityService;

	@PostMapping(path = "/addOrder_Product_Quantity")
	public ResponseEntity<String> createOrder_Product_Quantity(@RequestBody Order_Product_Quantity opq)
			throws Exception {
		return new ResponseEntity<>(order_product_quantityService.createOrder_Product_Quantity(opq),
				HttpStatus.CREATED);
	}

	@GetMapping(path = "/getOrder_Product_Quantity/{opqId}")
	public ResponseEntity<Order_Product_Quantity> getOrder_Product_Quantity(@PathVariable(value = "opqId") int opqId) {
		return new ResponseEntity<>(order_product_quantityService.getOrder_Product_Quantity(opqId), HttpStatus.OK);
	}

	@GetMapping(path = "/getAllOrder_Product_Quantity")
	public ResponseEntity<List<Order_Product_Quantity>> getAllOrder_Product_Quantity() {
		return new ResponseEntity<>(order_product_quantityService.getAllOrder_Product_Quantity(), HttpStatus.OK);
	}

	@PutMapping(path = "/updateOrder_Product_Quantity")
	public ResponseEntity<Order_Product_Quantity> updateOrder_Product_Quantity(
			@RequestBody Order_Product_Quantity opq) {
		return new ResponseEntity<>(order_product_quantityService.updateOrder_Product_Quantity(opq),
				HttpStatus.CREATED);
	}

	@DeleteMapping(path = "/deleteOrder_Product_Quantity/{opqId}")
	public ResponseEntity<String> deleteOrder_Product_Quantity(@PathVariable(value = "opqId") int opqId) {
		order_product_quantityService.deleteOrder_Product_Quantity(opqId);
		return new ResponseEntity<>(
				"Order_Product_Quantity with Order_Product_QuantityId : " + opqId + " deleted successfully",
				HttpStatus.OK);
	}

}