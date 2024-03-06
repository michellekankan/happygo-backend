package com.shopping.happygo;

import java.util.List;

import utils.Pair;

public class Order {
	private String userName;
	private String time;
	private List<Pair<Product, Integer>> carts;
	private String address;
	
	Order() {}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getTime() {
		return time;
	}
	
	public void setTime(String time) {
		this.time = time;
	}
	
	public List<Pair<Product, Integer>> getCarts() {
		return carts;
	}
	
	public void setCarts(List<Pair<Product, Integer>> carts) {
		this.carts = carts;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	

	

}
