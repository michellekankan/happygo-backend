package com.shopping.happygo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.shopping.happygo.Cart;
import com.shopping.happygo.Database;
import com.shopping.happygo.Product;
import com.shopping.happygo.User;

import utils.Pair;

@RestController
public class CartController {
	@PostMapping("/shoppingcart/products")
    public ResponseEntity<List<Pair<Product, Integer>>> getCart(@RequestBody User user) {
		Cart cart = Database.getCartByUser(user.getUserName());
		if (Database.isUserExisted(user.getUserName())) {
			 return ResponseEntity.ok(cart.getProducts2());     
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }
}

