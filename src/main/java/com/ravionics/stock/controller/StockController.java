package com.ravionics.stock.controller;

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

import com.ravionics.stock.entity.Stock;
import com.ravionics.stock.service.StockService;

@RestController
public class StockController {

	@Autowired
	private StockService stockService;

	@PostMapping(path = "/addStock")
	public ResponseEntity<String> createStock(@RequestBody Stock stock) throws Exception {
		return new ResponseEntity<>(stockService.createStock(stock), HttpStatus.CREATED);
	}

	@GetMapping(path = "/getStock/{stockId}")
	public ResponseEntity<Stock> getStock(@PathVariable(value = "stockId") int stockId) {
		return new ResponseEntity<>(stockService.getStock(stockId), HttpStatus.OK);
	}

	@GetMapping(path = "/getAllStocks")
	public ResponseEntity<List<Stock>> getAllStocks() {
		return new ResponseEntity<>(stockService.getAllStocks(), HttpStatus.OK);
	}

	@PutMapping(path = "/updateStock")
	public ResponseEntity<Stock> updateStock(@RequestBody Stock stock) {
		return new ResponseEntity<>(stockService.updateStock(stock), HttpStatus.CREATED);
	}

	@DeleteMapping(path = "/deleteStock/{stockId}")
	public ResponseEntity<String> deleteStock(@PathVariable(value = "orderId") int stockId) {
		stockService.deleteStock(stockId);
		return new ResponseEntity<>("Stock with stockId : " + stockId + " deleted successfully", HttpStatus.OK);
	}

}