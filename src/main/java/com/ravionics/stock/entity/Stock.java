package com.ravionics.stock.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.ravionics.brand.entity.Brand;
import com.ravionics.product.entity.Product;

@Entity
@Table(name = "stock")
public class Stock {

	@Id
	@Column(name = "quantity")
	private int quantity;

	@ManyToOne(targetEntity = Product.class)
	@JoinColumn(name = "product_id")
	private Product product;

	@ManyToOne(targetEntity = Brand.class)
	@JoinColumn(name = "brand_id")
	private Brand brand;

	public Stock() {
	}

	public Stock(int quantity, Product product, Brand brand) {
		super();
		this.quantity = quantity;
		this.product = product;
		this.brand = brand;
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
