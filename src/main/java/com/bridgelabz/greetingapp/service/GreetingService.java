package com.bridgelabz.greetingapp.service;

import com.bridgelabz.greetingapp.model.UserModel;
import com.bridgelabz.greetingapp.repository.IrepoGreet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

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

    public UserModel getById(int id) {
        UserModel userModel = irepoGreet.findById(id).get();
        return userModel;
    }

    public List<UserModel> getAll() {
        List<UserModel> userModel = irepoGreet.findAll();
        return userModel;
    }

    public UserModel updateUser(UserModel userModel, int id) {
        Optional<UserModel> userModel1;
        userModel1 = irepoGreet.findById(id);
        userModel1.get().setFirstName(userModel.getFirstName());
        userModel1.get().setLastName(userModel.getLastName());
        irepoGreet.save(userModel1.get());
        return userModel1.get();
    }
    public void deleteId(int id){
        irepoGreet.deleteById(id);
    }
}
