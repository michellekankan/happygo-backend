package com.shopping.happygo.controller;

import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.shopping.happygo.Cart;
import com.shopping.happygo.CartUpdateParam;
import com.shopping.happygo.Database;
import com.shopping.happygo.Product;
import com.shopping.happygo.User;

@RestController
public class CartUpdateController {
	@PostMapping("/cart")
    public ResponseEntity<String> updateCart(@RequestBody CartUpdateParam cartUpdateParam) {
		System.out.println("!!");
		String username = cartUpdateParam.getUserName();
		String prodcutId = cartUpdateParam.getProductId();
		String method = cartUpdateParam.getMethod();
		int quantity = cartUpdateParam.getQuantity();
		Cart cart = Database.getCartByUser(username);
		if (method.equals("add")) {
			cart.addProduct(prodcutId, quantity);
			System.out.println(cart.getProducts());
		} else {
			cart.removeProduct(prodcutId, quantity);
			System.out.println(cart.getProducts());
		}
		String productName = Database.getProductById(prodcutId).getProductName().toLowerCase();
		String sentance = String.valueOf(quantity) + " " + productName + " added in the cart!";
		return ResponseEntity.ok(sentance);
    }
}
