package com.ravionics.product.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.ravionics.brand.entity.Brand;

@Entity

@Table(name = "product")
public class Product {

	@Id
	@Column(name = "product_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int product_id;

	@Column(name = "product_name")
	private String product_name;

	@ManyToOne(targetEntity = Brand.class)
	@JoinColumn(name = "brand_id")
	private Brand brand;

	public Product() {

	}

	public Product(int product_id, String product_name, Brand brand) {

		this.product_id = product_id;
		this.product_name = product_name;
		this.brand = brand;
	}

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

}