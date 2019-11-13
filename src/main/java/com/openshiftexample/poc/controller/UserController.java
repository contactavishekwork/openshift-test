package com.openshiftexample.poc.controller;

import com.openshiftexample.poc.entity.UserEntity;
import com.openshiftexample.poc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<UserEntity> getAllUsers() {
        return userService.getAllUsers();
    }

    @RequestMapping(value = "/adduser", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody()
    public UserEntity addNewUser(@RequestBody UserEntity user) {
        return this.userService.addUser(user);
    }
}
