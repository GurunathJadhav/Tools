package com.gurunath.controller;

import com.gurunath.payload.UserPersonRequest;
import com.gurunath.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/user")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public ResponseEntity<Map<String,String>> registerUser(@RequestBody UserPersonRequest userPersonRequest){
        return new ResponseEntity<>(userService.registerUser(userPersonRequest), HttpStatus.CREATED);
    }


}
