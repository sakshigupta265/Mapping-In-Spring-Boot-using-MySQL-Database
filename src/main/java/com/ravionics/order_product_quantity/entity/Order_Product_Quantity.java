package com.ravionics.order_product_quantity.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.ravionics.product.entity.Product;

@Entity
@Table(name = "order_product_quantity")
public class Order_Product_Quantity {

	@Id
	@Column(name = "order_prod_quantity")
	private int order_prod_quantity;

	@Column(name = "quantity")
	private int quantity;

	@ManyToOne(targetEntity = Product.class)
	@JoinColumn(name = "product_id")
	private Product product;

	public Order_Product_Quantity() {

	}

	public Order_Product_Quantity(int order_prod_quantity, int quantity, Product product) {
		super();
		this.order_prod_quantity = order_prod_quantity;
		this.quantity = quantity;
		this.product = product;
	}

	public int getOrder_prod_quantity() {
		return order_prod_quantity;
	}

	public void setOrder_prod_quantity(int order_prod_quantity) {
		this.order_prod_quantity = order_prod_quantity;
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

}
