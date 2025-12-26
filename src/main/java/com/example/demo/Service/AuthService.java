// src/main/java/com/example/demo/service/AuthService.java
package com.example.demo.service;

import com.example.demo.dto.RegisterRequestDto;

public interface AuthService {
    void register(RegisterRequestDto request);
    String login(String email, String password);
}
