package com.ravionics.stock.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ravionics.stock.entity.Stock;

public interface StockRepository extends JpaRepository<Stock, Integer> {

}
