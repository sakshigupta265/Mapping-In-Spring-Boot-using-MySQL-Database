package com.ravionics.quotation.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.ravionics.brand.entity.Brand;
import com.ravionics.product.entity.Product;
import com.ravionics.quotation_product_quantity.entity.Quotation_Product_Quantity;
import com.ravionics.supplier.entity.Supplier;

@Entity
@Table(name = "quotation")
public class Quotation {

	@Id
	@Column(name = "quotation_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int quotation_id;

	@Column(name = "buyer_id")
	private int buyer_id;

	@OneToOne(targetEntity = Supplier.class)
	@JoinColumn(name = "supplier_id")
	private Supplier supplier;

	@OneToOne(targetEntity = Quotation_Product_Quantity.class)
	@JoinColumn(name = "quot_quantity_id")
	private Quotation_Product_Quantity quotation_product_quantity;

	@ManyToOne(targetEntity = Brand.class)
	@JoinColumn(name = "brand_id")
	private Brand brand;

	@ManyToOne(targetEntity = Product.class)
	@JoinColumn(name = "product_id")
	private Product product;

	public Quotation() {

	}

	public Quotation(int quotation_id, int buyer_id, Supplier supplier,
			Quotation_Product_Quantity quotation_product_quantity, Brand brand, Product product) {
		super();
		this.quotation_id = quotation_id;
		this.buyer_id = buyer_id;
		this.supplier = supplier;
		this.quotation_product_quantity = quotation_product_quantity;
		this.brand = brand;
		this.product = product;
	}

	public int getQuotation_id() {
		return quotation_id;
	}

	public void setQuotation_id(int quotation_id) {
		this.quotation_id = quotation_id;
	}

	public int getBuyer_id() {
		return buyer_id;
	}

	public void setBuyer_id(int buyer_id) {
		this.buyer_id = buyer_id;
	}

	public Supplier getSupplier() {
		return supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Quotation_Product_Quantity getQuotation_product_quantity() {
		return quotation_product_quantity;
	}

	public void setQuotation_product_quantity(Quotation_Product_Quantity quotation_product_quantity) {
		this.quotation_product_quantity = quotation_product_quantity;
	}

}
