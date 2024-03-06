package com.shopping.happygo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shopping.happygo.Database;
import com.shopping.happygo.Order;
import com.shopping.happygo.User;

@RestController
public class OrderController {
	@PostMapping("/order")
    public ResponseEntity<Order> checkOut(@RequestBody User user) {
		System.out.println("It's order page!");
		Order order = Database.getOrderByUsername(user.getUserName());
		if (order != null) {
			Database.deleteCartByUser(user.getUserName());
			return ResponseEntity.ok(order);
		}
		return null;
    }
	


}
