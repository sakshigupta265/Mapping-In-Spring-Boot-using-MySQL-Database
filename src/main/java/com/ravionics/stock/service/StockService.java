package com.ravionics.stock.service;

import java.util.List;

import com.ravionics.stock.entity.Stock;

public interface StockService {

	public String createStock(Stock stock) throws Exception;

	public Stock getStock(int stockId);

	public List<Stock> getAllStocks();

	public Stock updateStock(Stock stock);

	public void deleteStock(int stockId);

}