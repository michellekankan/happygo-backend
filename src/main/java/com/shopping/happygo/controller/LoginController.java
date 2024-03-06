package com.shopping.happygo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web

import com.shopping.happygo.Database;
import com.shopping.happygo.User;

import jakarta.servlet.http.HttpSession;

@RestController
public class LoginController {
	
    @PostMapping("/login")
    public ResponseEntity<String> loginUser(@RequestBody User user) {
    	for (User customer: Database.getUsers()) {
    		System.out.print(user.getUserName());
	    	System.out.print(user.getPassword());
	    	
    		if (customer.getUserName().equals(user.getUserName())  && customer.getPassword().equals(user.getPassword())) { 	        
    			return ResponseEntity.ok(user.getUserName());
    		} 
    	}
    	return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Login failed");
    }

}
