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
     account.setUser(user)


   }
   public UserAccount getUserById(Long id){

   }
   public List<UserAccount>getAllUsers()
   {
       return uar.findAll();
   }
   public UserAccount deactivateUser(Long id){}

}