package com.ravionics.quotation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ravionics.quotation.entity.Quotation;

public interface QuotationRepository extends JpaRepository<Quotation, Integer> {

}
