package com.ravionics.quotation_product_quantity.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.ravionics.brand.entity.Brand;
import com.ravionics.product.entity.Product;

@Entity
@Table(name = "quotation_product_quantity")
public class Quotation_Product_Quantity {

	@Id
	@Column(name = "quot_quantity_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int quot_quantity_id;

	@Column(name = "quantity")
	private int quantity;

	@ManyToOne(targetEntity = Product.class)
	@JoinColumn(name = "product_id")
	private Product product;

	@ManyToOne(targetEntity = Brand.class)
	@JoinColumn(name = "brand_id")
	private Brand brand;

	public Quotation_Product_Quantity() {

	}

	public Quotation_Product_Quantity(int quot_quantity_id, int quantity, Product product, Brand brand) {
		super();
		this.quot_quantity_id = quot_quantity_id;
		this.quantity = quantity;
		this.product = product;
		this.brand = brand;
	}

	public int getQuot_quantity_id() {
		return quot_quantity_id;
	}

	public void setQuot_quantity_id(int quot_quantity_id) {
		this.quot_quantity_id = quot_quantity_id;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

}
