package com.example.demo.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.UserAccount;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.entity.UserName;


@RestController
public class UserAccountControllers {
    @Autowired
    UserAccount userobj;
    @PostMapping("/api/users")
    public UserAccount Create_user(@RequestBody UserAccount user) {
        return userobj.Createuser(user);
    }
    @PutMapping("/{id}")
    public UserName Update_user(@PathVariable Long id,@Valid @RequestBody UserAccount user){
        return userobj.Update_user(id,user);
    }
    @GetMapping("/{id}")
    public UserName getuser(@PathV)

}