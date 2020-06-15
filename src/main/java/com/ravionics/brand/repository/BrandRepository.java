package com.ravionics.brand.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ravionics.brand.entity.Brand;

public interface BrandRepository extends JpaRepository<Brand, Integer>{

}
