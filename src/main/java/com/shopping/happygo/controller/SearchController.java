package com.shopping.happygo.controller;

import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.shopping.happygo.Database;
import com.shopping.happygo.Product;
import com.shopping.happygo.User;
import com.shopping.happygo.UserProfile;

@RestController
public class SearchController {


    @GetMapping("/products/category/{search}")
    public ResponseEntity<ArrayList<Product>> getUserSearch(@PathVariable("search") String search) {
    	ArrayList<Product> products = Database.getProductBySearch(search);
        if (products != null) {
            return ResponseEntity.ok(products);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }
}
