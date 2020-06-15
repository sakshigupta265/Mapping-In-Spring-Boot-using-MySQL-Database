package com.ravionics.quotation_product_quantity.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ravionics.quotation_product_quantity.entity.Quotation_Product_Quantity;
import com.ravionics.quotation_product_quantity.repository.Quotation_Product_QuantityRepository;

@Service
public class Quotation_Product_QuantityServiceImpl implements Quotation_Product_QuantityService {

	@Autowired
	private Quotation_Product_QuantityRepository quotation_product_quantityRepository;

	@Override
	public String createQuotation_Product_Quantity(Quotation_Product_Quantity quot) throws Exception {

		quotation_product_quantityRepository.save(quot);

		int quotId = quot.getQuot_quantity_id();

		return "Quotation_Product_Quantity with Quotation_Product_Quantity Id " + quotId + " Created!";
	}

	@Override
	public Quotation_Product_Quantity getQuotation_Product_Quantity(int quotId) {
		Optional<Quotation_Product_Quantity> optionalQuotation = quotation_product_quantityRepository.findById(quotId);
		if (optionalQuotation.isPresent()) {
			return optionalQuotation.get();
		}
		return null;
	}

	@Override
	public List<Quotation_Product_Quantity> getAllQuotation_Product_Quantity() {
		return quotation_product_quantityRepository.findAll();
	}

	@Override
	public Quotation_Product_Quantity updateQuotation_Product_Quantity(Quotation_Product_Quantity quot) {
		return quotation_product_quantityRepository.save(quot);
	}

	@Override
	public void deleteQuotation_Product_Quantity(int quotId) {
		quotation_product_quantityRepository.deleteById(quotId);
	}
}