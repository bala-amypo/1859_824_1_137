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

    public UserAccount createUser(UserAccount user)
    {
        return uar.save(user);
    }

   public UserAccount updateUser(Long id,UserAccount user){
     UserAccount account=uar.findById(id).orElse(null);
     if(account==null){
        return null;
     }
     account.setUser(user);
     uar.save(account);


   }
   public UserAccount getUserById(Long id){
      uar.findById(id);

   }
   public List<UserAccount>getAllUsers()
   {
       uar.findAll();
   }
   public UserAccount deactivateUser(Long id){
        UserAccount user=uar.findById(id).orElse(null);
        if(user==null){
            uar
        }
   }

}