package com.shopping.happygo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.shopping.happygo.Database;
import com.shopping.happygo.User;
import com.shopping.happygo.UserProfile;

@RestController
public class UserProfileController {


    @GetMapping("/users/{username}/profile")
    public ResponseEntity<UserProfile> getUserProfile(@PathVariable("username") String username) {
        UserProfile userProfile = Database.getUserProfileByUsername(username);
        if (userProfile != null) {
            return ResponseEntity.ok(userProfile);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }
}
