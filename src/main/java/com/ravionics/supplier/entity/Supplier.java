package com.ravionics.supplier.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "supplier")
public class Supplier {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "supplier_id")
	private int supplier_id;

	@Column(name = "supplier_name")
	private String supplier_name;

	@Column(name = "organisation")
	private String organisation;

	@Column(name = "address")
	private String address;

	@Column(name = "contact")
	private String contact;

	@Column(name = "Email")
	private String email;

//	@OneToMany(mappedBy = "supplier")

	public int getSupplier_id() {
		return supplier_id;
	}

	public void setSupplier_id(int supplier_id) {
		this.supplier_id = supplier_id;
	}

	public String getSupplier_name() {
		return supplier_name;
	}

	public void setSupplier_name(String supplier_name) {
		this.supplier_name = supplier_name;
	}

	public String getOrganisation() {
		return organisation;
	}

	public void setOrganisation(String organisation) {
		this.organisation = organisation;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public Supplier() {
	}

	public Supplier(int supplier_id, String supplier_name, String organisation, String address, String contact,
			String email) {
		super();
		this.supplier_id = supplier_id;
		this.supplier_name = supplier_name;
		this.organisation = organisation;
		this.address = address;
		this.contact = contact;
		this.email = email;
	}

}
