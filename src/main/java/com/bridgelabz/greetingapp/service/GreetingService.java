package com.bridgelabz.greetingapp.service;

import com.bridgelabz.greetingapp.model.UserModel;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    public String getHello(String name) {
        return "Hello " + name;
    }
    public String getSimpleGreet() {
        return "Hello World!!";
    }
    public String getUserGreet(UserModel userModel){
        return "Hello "+userModel.getFirstName()+" "+userModel.getLastName();
    }
}
