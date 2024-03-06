package com.shopping.happygo.controller;

import java.util.ArrayList;
import java.util.List;

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
import com.shopping.happygo.Order;
import com.shopping.happygo.Product;
import com.shopping.happygo.User;

import utils.Pair;

@RestController
public class checkOutController {
	@PostMapping("/checkout")
    public ResponseEntity<String> checkOut(@RequestBody Order order) {
		System.out.println("direct to order page!");
		String username = order.getUserName();
		order.setCarts(Database.getCartByUser(username).getProducts2());
		order.setAddress(Database.getUserAddressByUsername(username));
		if (order.getCarts() != null) {
			Database.setOrders(order);
			return ResponseEntity.ok("Check out!");
		}
		return null;
    }
}
