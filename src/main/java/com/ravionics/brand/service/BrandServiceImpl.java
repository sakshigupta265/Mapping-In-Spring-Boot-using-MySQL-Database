package com.ravionics.brand.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ravionics.brand.entity.Brand;
import com.ravionics.brand.repository.BrandRepository;

@Service
public class BrandServiceImpl implements BrandService {

	@Autowired
	private BrandRepository brandRepository;

	@Override
	public String createBrand(Brand brand) throws Exception {

		brandRepository.save(brand);

		int brandId = brand.getBrand_id();

		return "Brand with brand Id " + brandId + " Created!";
	}

	@Override
	public Brand getBrand(int brandId) {
		Optional<Brand> optionalBrand = brandRepository.findById(brandId);
		if (optionalBrand.isPresent()) {
			return optionalBrand.get();
		}
		return null;
	}

	@Override
	public List<Brand> getAllBrands() {
		return brandRepository.findAll();
	}

	@Override
	public Brand updateBrand(Brand brand) {
		return brandRepository.save(brand);
	}

	@Override
	public void deleteBrand(int brandId) {
		brandRepository.deleteById(brandId);

	}

//	@Override
//	public String getBrandDetails(int brandId) {
//
//		Brand tempBrand = brandRepository.getOne(brandId);
//		String brandName = tempBrand.getBrand_name();
//		int sectorId = tempBrand.getSector().getSector_id();
//		String sectorName = tempBrand.getSector().getSector_name();
//
//		return "{\n brand_name: " + brandName + " \n sector_id: " + sectorId + " \n sector_name: " + sectorName + "\n}";
//	}
}