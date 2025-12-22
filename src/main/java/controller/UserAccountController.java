package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.UserAccount;
import com.example.demo.service.UserAccountService;

@RestController
@RequestMapping("/users")
public class UserAccountController {

    @Autowired
    private UserAccountService service;

    @PostMapping
    public UserAccount create(@RequestBody UserAccount user) {
        return service.createUser(user);
    }

    @PutMapping("/{id}")
    public UserAccount update(@PathVariable Long id,
                              @RequestBody UserAccount user) {
        return service.updateUser(id, user);
    }

    @GetMapping("/{id}")
    public UserAccount getById(@PathVariable Long id) {
        return service.getUserById(id);
    }

    @GetMapping
    public List<UserAccount> getAll() {
        return service.getAllUsers();
    }

    @PutMapping("/{id}/deactivate")
    public UserAccount deactivate(@PathVariable Long id) {
        return service.deactivateUser(id);
    }
}
