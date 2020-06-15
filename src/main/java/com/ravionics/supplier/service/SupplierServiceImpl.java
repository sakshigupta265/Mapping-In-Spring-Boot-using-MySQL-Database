package com.ravionics.supplier.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ravionics.supplier.entity.Supplier;
import com.ravionics.supplier.repository.SupplierRepository;

@Service
public class SupplierServiceImpl implements SupplierService {

	@Autowired
	private SupplierRepository supplierRepository;

	@Override
	public String createSupplier(Supplier supplier) {

		supplierRepository.save(supplier);
		int supplierId = supplier.getSupplier_id();
		return "Supplier with supplierId" + supplierId + " created!";
	}

	@Override
	public Supplier updateSupplier(Supplier supplier) {
		return supplierRepository.save(supplier);

	}

	@Override
	public Supplier getSupplier(int supplierId) {
		Optional<Supplier> optionalSupplier = supplierRepository.findById(supplierId);
		if (optionalSupplier.isPresent()) {
			return optionalSupplier.get();
		}
		return null;
	}

	@Override
	public void deleteSupplier(int supplierId) {
		supplierRepository.deleteById(supplierId);

	}

	@Override
	public List<Supplier> getAllSuppliers() {
		return supplierRepository.findAll();

	}

}
