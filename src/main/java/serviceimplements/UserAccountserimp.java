// package com.example.demo.service.impl;
// import java.util.List;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;
// import com.example.demo.Entity.UserAccount;
// import com.example.demo.repository.UserAccountRepository;
// import com.example.demo.service.UserAccountser;

// @Service
// public class UserAccountserimp implements UserAccountser{
//     @Autowired
//     UserAccountRepository uar;

//     public UserAccount createUser(UserAccount user)
//     {
//         return uar.save(user);
//     }

//    public UserAccount updateUser(Long id,UserAccount user){
//      UserAccount account=uar.findById(id).orElse(null);
//      if(account==null){
//         return null;
//      }
//      account.setUser(user);
//      uar.save(account);


//    }
//    public UserAccount getUserById(Long id){
//       uar.findById(id);

//    }
//    public List<UserAccount>getAllUsers()
//    {
//        uar.findAll();
//    }
//    public UserAccount deactivateUser(Long id){
//         UserAccount user=uar.findById(id).orElse(null);
//         if(user==null){
//             return null;
//         }
//         user.setactive(false);
//         uar.save(user)
//    }

// }

package com.example.demo.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.UserAccount;
import com.example.demo.repository.UserAccountRepository;
import com.example.demo.service.UserAccountService;

@Service
public class UserAccountServiceImpl implements UserAccountService {

    @Autowired
    private UserAccountRepository uar;

    @Override
    public UserAccount createUser(UserAccount user) {
        user.setActive(true);
        return uar.save(user);
    }

    @Override
    public UserAccount updateUser(Long id, UserAccount user) {
        UserAccount account = uar.findById(id).orElse(null);
        if (account == null) {
            return null;
        }

        account.setEmail(user.getEmail());
        account.setFullName(user.getFullName());

        return uar.save(account);
    }

    @Override
    public UserAccount getUserById(Long id) {
        return uar.findById(id).orElse(null);
    }

    @Override
    public List<UserAccount> getAllUsers() {
        return uar.findAll();
    }

    @Override
    public UserAccount deactivateUser(Long id) {
        UserAccount user = uar.findById(id).orElse(null);
        if (user == null) {
            return null;
        }

        user.setActive(false);
        return uar.save(user);
    }
}
