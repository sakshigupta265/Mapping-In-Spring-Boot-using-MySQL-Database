package com.ravionics.brand.service;

import java.util.List;

import com.ravionics.brand.entity.Brand;

public interface BrandService {

	public String createBrand(Brand brand) throws Exception;

	public Brand getBrand(int brandId);

	public List<Brand> getAllBrands();

	public Brand updateBrand(Brand brand);

	public void deleteBrand(int brandId);

//	public String getBrandDetails(int brandId);
}
