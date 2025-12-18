package com.example.demo.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.UserAccount;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.collectiondb.entity.studentity;


@RestController
public class studentController {
    @Autowired
    studentservice stuser;
    @PostMapping("/studentpost")
    public studentity studatas(@RequestBody studentity student) {
        return stuser.saveData(student);
    }
    

}