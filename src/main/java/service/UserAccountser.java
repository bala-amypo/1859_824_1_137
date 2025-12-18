package com.example.demo.service;
import java.util.List;
import com.example.demo.entity.UserAccount;

public interface UserAccountser
{
   public UserAccount createUser(UserAccount user);
   public UserAccount updateUser(Long id,UserAccount user);
   public UserAccount getUserById(Long id);
   public List<UserAccount>getAllUsers();
   public void deactivateUser(Long id);
}