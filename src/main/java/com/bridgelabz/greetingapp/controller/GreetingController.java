package com.bridgelabz.greetingapp.controller;

import com.bridgelabz.greetingapp.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/start")
public class GreetingController{
    @Autowired
    //AutoWired to get the dependency of the other service layer
    GreetingService greetService;
    @GetMapping("/hello")
    public String get(@RequestBody String name){
        return greetService.getHello(name);
    }
    @GetMapping("/simplegreet")
    public String simplegreet(){
        return greetService.getSimpleGreet();
    }
}
