package com.ravionics.supplier.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ravionics.supplier.entity.Supplier;

public interface SupplierRepository extends JpaRepository<Supplier, Integer> {

}
