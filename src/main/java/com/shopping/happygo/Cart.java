package com.shopping.happygo;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import utils.Pair;

public class Cart {
	private Map<String, Integer> cart;
	
	public Cart() {
		cart = new HashMap<>();
	}
	
	public void addProduct(String productId, int quantity) {
		int originalQuantity = cart.getOrDefault(productId, 0);
		cart.put(productId, originalQuantity + quantity);
	}
	
	public void removeProduct(String productId, int quantity) {
//		int originalQuantity = cart.get(productId);
//		cart.put(productId, originalQuantity - quantity);
//		if(originalQuantity - quantity == 0) {
//			cart.remove(productId);
//		}
		cart.remove(productId);
	}
	
	public List<Pair<String, Integer>> getProducts() {
		List<Pair<String, Integer>> products = new ArrayList<>();
		for (Map.Entry<String, Integer> entry : cart.entrySet()) {
		    products.add(new Pair<String, Integer>(entry.getKey(), entry.getValue()));
		}
		return products;
		
	}
	
	
	
	public List<Pair<Product, Integer>> getProducts2() {
		List<Pair<Product, Integer>> products = new ArrayList<>();
		for (Map.Entry<String, Integer> entry : cart.entrySet()) {
			Product product = Database.getProductById(entry.getKey());
		    products.add(new Pair<Product, Integer>(product, entry.getValue()));
		}
		return products;
	}

}
