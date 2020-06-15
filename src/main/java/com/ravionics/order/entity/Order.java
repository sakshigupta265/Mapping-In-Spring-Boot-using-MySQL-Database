package com.ravionics.order.entity;

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
import com.ravionics.quotation.entity.Quotation;

@Entity
@Table(name = "orders")
public class Order {

	@Id
	@Column(name = "order_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int order_id;

	@Column(name = "order_quantity_id")
	private int order_quantity_id;

	@ManyToOne(targetEntity = Product.class)
	@JoinColumn(name = "product_id")
	private Product product;

	@ManyToOne(targetEntity = Brand.class)
	@JoinColumn(name = "brand_id")
	private Brand brand;

	@ManyToOne(targetEntity = Quotation.class)
	@JoinColumn(name = "quotation_id")
	private Quotation quotation;

	public Order() {

	}

	public Order(int order_id, int order_quantity_id, Product product, Brand brand, Quotation quotation) {
		super();
		this.order_id = order_id;
		this.order_quantity_id = order_quantity_id;
		this.product = product;
		this.brand = brand;
		this.quotation = quotation;
	}

	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}

	public int getOrder_quantity_id() {
		return order_quantity_id;
	}

	public void setOrder_quantity_id(int order_quantity_id) {
		this.order_quantity_id = order_quantity_id;
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

	public Quotation getQuotation() {
		return quotation;
	}

	public void setQuotation(Quotation quotation) {
		this.quotation = quotation;
	}

}
