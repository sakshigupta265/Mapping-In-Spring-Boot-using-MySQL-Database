package com.ravionics.ExtraApi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ravionics.ExtraApi.service.ExtraApiService;

@RestController
public class ExtraApiController {

	@Autowired
	private ExtraApiService extraapiService;

//	Extra API (brand_name, sector_id, sector_name)

	@GetMapping(path = "getBrand-SectorDetails/{brandId}")
	public ResponseEntity<String> getBrandDetails(@PathVariable(value = "brandId") int brandId) {
		return new ResponseEntity<>(extraapiService.getBrandDetails(brandId), HttpStatus.FOUND);
	}

// Extra API (product_name, brand_name, brand_id)

	@GetMapping(path = "getProduct-BrandDetails/{productId}")
	public ResponseEntity<String> getProductDetails(@PathVariable(value = "productId") int productId) {
		return new ResponseEntity<>(extraapiService.getProductDetails(productId), HttpStatus.FOUND);
	}

//Extra API (product_name, brand_id, brand_name, sector_id, sector_name)

	@GetMapping(path = "getProduct-Brand-SectorDetails/{productId}")
	public ResponseEntity<String> getProduct_Brand_SectorDetails(@PathVariable(value = "productId") int productId) {
		return new ResponseEntity<>(extraapiService.getProduct_Brand_SectorDetails(productId), HttpStatus.FOUND);
	}
}
