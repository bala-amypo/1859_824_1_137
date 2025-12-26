// src/main/java/com/example/demo/service/impl/AuthServiceImpl.java
package com.example.demo.service.impl;

import com.example.demo.dto.RegisterRequestDto;
import com.example.demo.entity.UserAccount;
import com.example.demo.repository.UserAccountRepository;
import com.example.demo.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

    @Autowired
    private UserAccountRepository userAccountRepository;

    @Override
    public void register(RegisterRequestDto request) {
        UserAccount user = new UserAccount();
        user.setEmail(request.getEmail());
        user.setFullName(request.getFullName());
        user.setPassword(request.getPassword()); // In real projects, encode password!
        userAccountRepository.save(user);
    }

    @Override
    public String login(String email, String password) {
        UserAccount user = userAccountRepository.findByEmail(email)
                .orElseThrow(() -> new RuntimeException("User not found"));
        if (!user.getPassword().equals(password)) {
            throw new RuntimeException("Invalid credentials");
        }
        return "Login successful"; // Later you can return JWT token
    }
}
