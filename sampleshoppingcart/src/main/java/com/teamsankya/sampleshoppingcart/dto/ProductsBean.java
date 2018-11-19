package com.teamsankya.sampleshoppingcart.dto;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.Table;

import org.apache.log4j.Logger;

@Entity
@Table(name="ProductsBean")
public class ProductsBean implements Serializable {
	final static Logger LOGGER = Logger.getLogger(ProductsBean.class);

	@Id
	@Column
	private String id;

	@Column
	private String name;
	
	@Column
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "ProductsBean [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

	


}
