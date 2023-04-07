package com.bridgelabz.greetingapp.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/start")
public class GreetingController {
    @GetMapping("/get")
    public String get(@RequestBody String name) {
        return "Hello" + name;
    }

    @PostMapping("/post")
    public String post(@RequestParam(value = "firstName") String firstName,
                       @RequestParam(value = "lastName") String lastName) {
        return "Welcome " + firstName + " " + lastName + " !!!!!";
    }

    @PutMapping("/put")
    public String put(@RequestParam(value = "msg") String msg) {
        return msg;
    }

    @DeleteMapping("/delete/{etc}")
    public String delete(@PathVariable String etc) {
        return "hello " + etc;
    }
}
