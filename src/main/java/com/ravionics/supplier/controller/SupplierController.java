package com.ravionics.supplier.controller;

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

import com.ravionics.supplier.entity.Supplier;
import com.ravionics.supplier.service.SupplierService;

@RestController
public class SupplierController {
	@Autowired
	private SupplierService supplierService;

	@PostMapping(path = "/addSupplier")
	public ResponseEntity<String> createSupplier(@RequestBody Supplier supplier) {
		return new ResponseEntity<>(supplierService.createSupplier(supplier), HttpStatus.CREATED);
	}

	@GetMapping(path = "/getSupplier/{supplierId}")
	public ResponseEntity<Supplier> getSupplier(@PathVariable(value = "supplierId") int supplierId) {
		return new ResponseEntity<>(supplierService.getSupplier(supplierId), HttpStatus.OK);
	}

	@GetMapping(path = "/getAllSuppliers")
	public ResponseEntity<List<Supplier>> getAllSuppliers() {
		return new ResponseEntity<>(supplierService.getAllSuppliers(), HttpStatus.OK);
	}

	@PutMapping(path = "/updateSupplier")
	public ResponseEntity<Supplier> updateSupplier(@RequestBody Supplier supplier) {
		return new ResponseEntity<>(supplierService.updateSupplier(supplier), HttpStatus.CREATED);
	}

	@DeleteMapping(path = "/deleteSupplier/{supplierId}")
	public ResponseEntity<String> deleteSupplier(@PathVariable(value = "supplierId") int supplierId) {
		supplierService.deleteSupplier(supplierId);
		return new ResponseEntity<>("Supplier with SupplierId : " + supplierId + " deleted successfully",
				HttpStatus.OK);
	}

}