package com.bridgelabz.greetingapp.repository;

import com.bridgelabz.greetingapp.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IrepoGreet extends JpaRepository<UserModel, Integer> {
}
