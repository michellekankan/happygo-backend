package com.shopping.happygo;

import java.util.UUID;

public class Product {
	private String productId;
	private String image;
	private String productName;
	private double price;
	private String category;
	private String description;
	
	public Product() {
		this.productId = UUID.randomUUID().toString();
	}
	
	public String getProductId() {
		return productId;
	}
	
	public String getImage() {
		return image;
	}
	
	public void setImage(String image) {
		this.image = image;
	}
	
	public String getProductName() {
		return productName;
	}

	public void setProductName(String product) {
		this.productName = product;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	    
	    


}
