package com.ravionics.supplier.service;

import java.util.List;

import com.ravionics.supplier.entity.Supplier;

public interface SupplierService {
	public String createSupplier(Supplier supplier);

	public Supplier getSupplier(int supplierId);

	public List<Supplier> getAllSuppliers();

	public Supplier updateSupplier(Supplier supplier);

	public void deleteSupplier(int supplierId);

}
