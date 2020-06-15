package com.ravionics.quotation.controller;

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

import com.ravionics.quotation.entity.Quotation;
import com.ravionics.quotation.service.QuotationService;

@RestController
public class QuotationController {

	@Autowired
	private QuotationService quotationService;

	@PostMapping(path = "/addQuotation")
	public ResponseEntity<String> createQuotation(@RequestBody Quotation quot) throws Exception {
		return new ResponseEntity<>(quotationService.createQuotation(quot), HttpStatus.CREATED);
	}

	@GetMapping(path = "/getQuotation/{quotId}")
	public ResponseEntity<Quotation> getQuotation(@PathVariable(value = "quotId") int quotId) {
		return new ResponseEntity<>(quotationService.getQuotation(quotId), HttpStatus.OK);
	}

	@GetMapping(path = "/getAllQuotations")
	public ResponseEntity<List<Quotation>> getAllQuotations() {
		return new ResponseEntity<>(quotationService.getAllQuotations(), HttpStatus.OK);
	}

	@PutMapping(path = "/updateQuotation")
	public ResponseEntity<Quotation> updateQuotation(@RequestBody Quotation quot) {
		return new ResponseEntity<>(quotationService.updateQuotation(quot), HttpStatus.CREATED);
	}

	@DeleteMapping(path = "/deleteQuotation/{quotId}")
	public ResponseEntity<String> deleteQuotation(@PathVariable(value = "quotId") int quotId) {
		quotationService.deleteQuotation(quotId);
		return new ResponseEntity<>("Quotation with quotId : " + quotId + " deleted successfully", HttpStatus.OK);
	}

}
