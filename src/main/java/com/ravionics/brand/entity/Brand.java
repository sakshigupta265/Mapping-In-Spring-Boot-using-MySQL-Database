package com.ravionics.brand.entity;

//import javax.persistence.CascadeType;
//import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
//import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
//import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.ravionics.sector.entity.Sector;

@Entity
@Table(name = "brand")
public class Brand {

	@Id
	@Column(name = "brand_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int brand_id;

	@Column(name = "brand_name")
	private String brand_name;

	@Column(name = "image")
	private String image;

	@Column(name = "personality")
	private String personality;

	@Column(name = "equity")
	private String equity;

	@ManyToOne(targetEntity = Sector.class)
	@JoinColumn(name = "sector_id")
	private Sector sector;

	public Brand() {

	}

	public Brand(int brand_id, String brand_name, String image, String personality, String equity, Sector sector) {
		super();
		this.brand_id = brand_id;
		this.brand_name = brand_name;
		this.image = image;
		this.personality = personality;
		this.equity = equity;
		this.sector = sector;
	}

	public int getBrand_id() {
		return brand_id;
	}

	public void setBrand_id(int brand_id) {
		this.brand_id = brand_id;
	}

	public String getBrand_name() {
		return brand_name;
	}

	public void setBrand_name(String brand_name) {
		this.brand_name = brand_name;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Sector getSector() {
		return sector;
	}

	public void setSector(Sector sector) {
		this.sector = sector;
	}

	public String getPersonality() {
		return personality;
	}

	public void setPersonality(String personality) {
		this.personality = personality;
	}

	public String getEquity() {
		return equity;
	}

	public void setEquity(String equity) {
		this.equity = equity;
	}

}