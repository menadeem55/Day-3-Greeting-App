package com.bridgelabz.greetingapp.controller;

import com.bridgelabz.greetingapp.model.UserModel;
import com.bridgelabz.greetingapp.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/start")
public class GreetingController {
    @Autowired
    GreetingService greetService;

    @GetMapping("/simplegreet")
    public String simplegreet() {
        return greetService.getSimpleGreet();
    }

    //displaying data in Request body
    @PostMapping
    public String getUsers(@RequestBody String firstName, String lastName) {
        return greetService.user(firstName, lastName);
    }

    //adding new user to database
    @PostMapping("/savedUser")
    public UserModel savedUser(@RequestBody UserModel userModel) {
        return greetService.saveUser(userModel);
    }

    @GetMapping("/getting/{id}")
    public UserModel gets(@PathVariable int id) {
        return greetService.getById(id);
    }

    @GetMapping("/getall")
    public List<UserModel> fetchingData() {
        return greetService.getAll();
    }

    @PutMapping("/update/{id}")
    public UserModel update(@PathVariable int id, @RequestBody UserModel userModel) {
        return greetService.updateUser(userModel, id);
    }
}
