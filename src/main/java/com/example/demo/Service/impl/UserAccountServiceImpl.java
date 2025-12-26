package com.example.demo.service.impl;

import com.example.demo.entity.UserAccount;
import com.example.demo.exception.*;
import com.example.demo.repository.UserAccountRepository;
import com.example.demo.service.UserAccountService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserAccountServiceImpl implements UserAccountService {

    private final UserAccountRepository userRepo;

    public UserAccountServiceImpl(UserAccountRepository userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public UserAccount createUser(UserAccount user) {
        if (userRepo.existsByEmail(user.getEmail())) {
            throw new BadRequestException("Email already exists");
        }
        return userRepo.save(user);
    }

    @Override
    public UserAccount updateUser(Long id, UserAccount updated) {
        UserAccount user = getUserById(id);
        user.setEmail(updated.getEmail());
        user.setFullName(updated.getFullName());
        user.setActive(updated.getActive());
        return userRepo.save(user);
    }

    @Override
    public UserAccount getUserById(Long id) {
        return userRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("User not found"));
    }

    @Override
    public List<UserAccount> getAllUsers() {
        return userRepo.findAll();
    }

    @Override
    public void deactivateUser(Long id) {
        UserAccount user = getUserById(id);
        user.setActive(false);
        userRepo.save(user);
    }
}
