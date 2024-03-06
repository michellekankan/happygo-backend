package com.shopping.happygo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.shopping.happygo.Database;
import com.shopping.happygo.Product;
import com.shopping.happygo.User;
import com.shopping.happygo.UserProfile;

@RestController
public class ProductController {


    @GetMapping("/products")
    public ResponseEntity<Product> getProduct(@RequestParam(name="product_id") String productId) {
        Product product = Database.getProductById(productId);
        if (product != null) {
            return ResponseEntity.ok(product);
            
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }
}
