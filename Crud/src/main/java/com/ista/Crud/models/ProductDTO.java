package com.ista.Crud.models;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "products")
public class ProductDTO {

	@Id
	private String id;
	
	private String name;
	
	private Double price;
	
	private LocalDate expiry_date;

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


	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public LocalDate getExpiry_date() {
		return expiry_date;
	}

	public void setExpiry_date(LocalDate expiry_date) {
		this.expiry_date = expiry_date;
	}

	
}
