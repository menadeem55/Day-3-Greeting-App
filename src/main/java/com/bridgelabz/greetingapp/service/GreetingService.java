package com.bridgelabz.greetingapp.service;

import com.bridgelabz.greetingapp.model.UserModel;
import com.bridgelabz.greetingapp.repository.IrepoGreet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class GreetingService {
    @Autowired
    IrepoGreet irepoGreet;

    public String getSimpleGreet() {
        return "Hello World!!";
    }

    public String user(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    public UserModel saveUser(UserModel userModel) {
        return irepoGreet.save(userModel);
    }
    public UserModel getById(int id){
        UserModel userModel =irepoGreet.findById(id).get();
        return userModel;
    }
}
