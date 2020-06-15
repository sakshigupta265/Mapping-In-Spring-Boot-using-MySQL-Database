package com.ravionics.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ravionics.order.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {

}
