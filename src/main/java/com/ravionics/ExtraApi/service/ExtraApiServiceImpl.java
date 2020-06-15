package com.ravionics.ExtraApi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ravionics.brand.entity.Brand;
import com.ravionics.brand.repository.BrandRepository;
import com.ravionics.product.entity.Product;
import com.ravionics.product.repository.ProductRepository;

@Service
public class ExtraApiServiceImpl implements ExtraApiService {

	@Autowired
	private BrandRepository brandRepository;

	@Autowired
	private ProductRepository productRepository;

	@Override
	public String getBrandDetails(int brandId) {

		Brand tempBrand = brandRepository.getOne(brandId);
		String brandName = tempBrand.getBrand_name();
		int sectorId = tempBrand.getSector().getSector_id();
		String sectorName = tempBrand.getSector().getSector_name();

		return "{\n brand_name: " + brandName + " \n sector_id: " + sectorId + " \n sector_name: " + sectorName + "\n}";
	}

	@Override
	public String getProductDetails(int productId) {

		Product tempProd = productRepository.getOne(productId);
		String prodName = tempProd.getProduct_name();
		int brandId = tempProd.getBrand().getBrand_id();
		String brandName = tempProd.getBrand().getBrand_name();

		return "{\n product_name: " + prodName + " \n brand_id: " + brandId + " \n brand_name: " + brandName + "\n}";
	}

	@Override
	public String getProduct_Brand_SectorDetails(int productId) {

		Product tempProd = productRepository.getOne(productId);
		String prodName = tempProd.getProduct_name();
		int brandId = tempProd.getBrand().getBrand_id();
		String brandName = tempProd.getBrand().getBrand_name();
		int sectorId = tempProd.getBrand().getSector().getSector_id();
		String sectorName = tempProd.getBrand().getSector().getSector_name();

		return "{\n product_name: " + prodName + " \n brand_id: " + brandId + " \n brand_name: " + brandName
				+ " \n sector_id: " + sectorId + " \n sector_name: " + sectorName + "\n}";
	}
}
