package com.ravionics.order_product_quantity.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ravionics.order_product_quantity.entity.Order_Product_Quantity;
import com.ravionics.order_product_quantity.repository.Order_Product_QuantityRepository;

@Service
public class Order_Product_QuantityServiceImpl implements Order_Product_QuantityService {
	@Autowired
	private Order_Product_QuantityRepository order_product_quantityRepository;

	@Override
	public String createOrder_Product_Quantity(Order_Product_Quantity opq) throws Exception {
		order_product_quantityRepository.save(opq);

		int opqId = opq.getOrder_prod_quantity();

		return "Order_Product_Quantity" + opqId + " Created!";
	}

	@Override
	public Order_Product_Quantity getOrder_Product_Quantity(int opqId) {
		Optional<Order_Product_Quantity> optionalOrder_Product_Quantity = order_product_quantityRepository
				.findById(opqId);
		if (optionalOrder_Product_Quantity.isPresent()) {
			return optionalOrder_Product_Quantity.get();
		}
		return null;
	}

	@Override
	public List<Order_Product_Quantity> getAllOrder_Product_Quantity() {
		return order_product_quantityRepository.findAll();
	}

	@Override
	public Order_Product_Quantity updateOrder_Product_Quantity(Order_Product_Quantity opq) {
		return order_product_quantityRepository.save(opq);
	}

	@Override
	public void deleteOrder_Product_Quantity(int opqId) {
		order_product_quantityRepository.deleteById(opqId);
	}
}