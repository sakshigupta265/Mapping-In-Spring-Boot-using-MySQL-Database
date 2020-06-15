package com.ravionics.quotation_product_quantity.controller;

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

import com.ravionics.quotation_product_quantity.entity.Quotation_Product_Quantity;
import com.ravionics.quotation_product_quantity.service.Quotation_Product_QuantityService;

@RestController
public class Quotation_Product_QuantityController {

	@Autowired
	private Quotation_Product_QuantityService quotationService;

	@PostMapping(path = "/addQuotation_Product_Quantity")
	public ResponseEntity<String> createQuotation_Product_Quantity(@RequestBody Quotation_Product_Quantity quot)
			throws Exception {
		return new ResponseEntity<>(quotationService.createQuotation_Product_Quantity(quot), HttpStatus.CREATED);
	}

	@GetMapping(path = "/getQuotation_Product_Quantity/{quotId}")
	public ResponseEntity<Quotation_Product_Quantity> getQuotation_Product_Quantity(
			@PathVariable(value = "quotId") int quotId) {
		return new ResponseEntity<>(quotationService.getQuotation_Product_Quantity(quotId), HttpStatus.OK);
	}

	@GetMapping(path = "/getAllQuotation_Product_Quantity")
	public ResponseEntity<List<Quotation_Product_Quantity>> getAllQuotation_Product_Quantity() {
		return new ResponseEntity<>(quotationService.getAllQuotation_Product_Quantity(), HttpStatus.OK);
	}

	@PutMapping(path = "/updateQuotation_Product_Quantity")
	public ResponseEntity<Quotation_Product_Quantity> updateQuotation_Product_Quantity(
			@RequestBody Quotation_Product_Quantity quot) {
		return new ResponseEntity<>(quotationService.updateQuotation_Product_Quantity(quot), HttpStatus.CREATED);
	}

	@DeleteMapping(path = "/deleteQuotation_Product_Quantity/{quotId}")
	public ResponseEntity<String> deleteQuotation_Product_Quantity(@PathVariable(value = "quotId") int quotId) {
		quotationService.deleteQuotation_Product_Quantity(quotId);
		return new ResponseEntity<>(
				"Quotation_Product_Quantity with Quat_QuantityId : " + quotId + " deleted successfully", HttpStatus.OK);
	}

}
