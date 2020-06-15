package com.ravionics.brand.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ravionics.brand.entity.Brand;
import com.ravionics.brand.service.BrandService;

@RestController
public class BrandController {

	@Autowired
	private BrandService brandService;

	@PostMapping(path = "/addBrand")
	public ResponseEntity<String> createBrand(@RequestBody Brand brand) throws Exception {
		return new ResponseEntity<>(brandService.createBrand(brand), HttpStatus.CREATED);
	}

	@GetMapping(path = "/getBrand/{brandId}")
	public ResponseEntity<Brand> getBrand(@PathVariable(value = "brandId") int brandId) {
		return new ResponseEntity<>(brandService.getBrand(brandId), HttpStatus.OK);
	}

	@GetMapping(path = "/getAllBrands")
	public ResponseEntity<List<Brand>> getAllBrands() {
		return new ResponseEntity<>(brandService.getAllBrands(), HttpStatus.OK);
	}

	@PutMapping(path = "/updateBrand")
	public ResponseEntity<Brand> updateBrand(@RequestBody Brand brand) {
		return new ResponseEntity<>(brandService.updateBrand(brand), HttpStatus.CREATED);
	}

	@DeleteMapping(path = "/deleteBrand/{brandId}")
	public ResponseEntity<String> deleteBrand(@PathVariable(value = "brandId") int brandId) {
		brandService.deleteBrand(brandId);
		return new ResponseEntity<>("Brand with BrandId : " + brandId + " deleted successfully", HttpStatus.OK);
	}

////	Extra API
//	@GetMapping(path = "getBrandDetails/{brandId}")
//	public ResponseEntity<String> getBrandDetails(@PathVariable(value = "brandId") int brandId) {
//		return new ResponseEntity<>(brandService.getBrandDetails(brandId), HttpStatus.CREATED);
//
//	}

}
