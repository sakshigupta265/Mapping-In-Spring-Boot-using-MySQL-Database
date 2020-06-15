package com.ravionics.stock.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ravionics.stock.entity.Stock;
import com.ravionics.stock.repository.StockRepository;

@Service
public class StockServiceImpl implements StockService {

	@Autowired
	private StockRepository stockRepository;

	@Override
	public String createStock(Stock quot) throws Exception {

		stockRepository.save(quot);

		return "Stock Created!";
	}

	@Override
	public Stock getStock(int orderId) {
		Optional<Stock> optionalOrder = stockRepository.findById(orderId);
		if (optionalOrder.isPresent()) {
			return optionalOrder.get();
		}
		return null;
	}

	@Override
	public List<Stock> getAllStocks() {
		return stockRepository.findAll();
	}

	@Override
	public Stock updateStock(Stock order) {
		return stockRepository.save(order);
	}

	@Override
	public void deleteStock(int stockId) {
		stockRepository.deleteById(stockId);
	}
}