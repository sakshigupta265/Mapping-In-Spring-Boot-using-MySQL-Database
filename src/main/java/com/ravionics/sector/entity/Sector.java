package com.ravionics.sector.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sector")
public class Sector {

	@Id
	@Column(name = "sector_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int sector_id;

	@Column(name = "sector_name")
	private String sector_name;

	public int getSector_id() {
		return sector_id;
	}

	public void setSector_id(int sector_id) {
		this.sector_id = sector_id;
	}

	public String getSector_name() {
		return sector_name;
	}

	public void setSector_name(String sector_name) {
		this.sector_name = sector_name;
	}

	public Sector() {

	}

	public Sector(int sector_id, String sector_name) {
		super();
		this.sector_id = sector_id;
		this.sector_name = sector_name;
	}

}
