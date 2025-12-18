package com.example.demo.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.Entity.UserAccount;
import com.example.demo.repository.UserAccountRepository;
import com.example.demo.service.UserAccountser;

@Service
public class UserAccountserimp implements UserAccountser{
    @Autowired
    UserAccountRepository uar;
    public User

    UserAccount createUser(UserAccount user);
    UserAccount updateUser(Long id,UserAccount user);
    UserAccount getUserById(Long id);
    List<UserAccount>getAllUsers();
    void deactivateUser(Long id);
}

}