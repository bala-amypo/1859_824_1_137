// package com.example.demo.controller;



// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.RestController;

// import com.example.demo.service.UserAccount;

// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestBody;

// import com.example.demo.entity.UserName;


// @RestController
// public class UserAccountControllers {
//     @Autowired
//     UserAccount userobj;
//     @PostMapping("/api/users")
//     public UserAccount Create_user(@RequestBody UserAccount user) {
//         return userobj.Createuser(user);
//     }
//     @PutMapping("/{id}")
//     public UserAccount Update_user(@PathVariable Long id,@Valid @RequestBody UserAccount user){
//         return userobj.Update_user(id,user);
//     }
//     @GetMapping("/{id}")
//     public UserName getuser(@PathVariable Long id){
//         return userobj.getViewByID(id);
//     }
//     @GetMapping
//     public List<UserAccount> get()
//     {
//         return userobj.getAllUsers();
//     }
//     @PutMapping("/{id}")
//     public UserAccount 

// }
package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.Entity.UserAccount;
import com.example.demo.service.UserAccountService;

@RestController
@RequestMapping("/users")
public class UserAccountController {

    @Autowired
    private UserAccountService service;

    @PostMapping
    public UserAccount createUser(@RequestBody UserAccount user) {
        return service.createUser(user);
    }

    @PutMapping("/{id}")
    public UserAccount updateUser(@PathVariable Long id,
                                  @RequestBody UserAccount user) {
        return service.updateUser(id, user);
    }

    @GetMapping("/{id}")
    public UserAccount getUserById(@PathVariable Long id) {
        return service.getUserById(id);
    }

    @GetMapping
    public List<UserAccount> getAllUsers() {
        return service.getAllUsers();
    }

    @PutMapping("/{id}/deactivate")
    public UserAccount deactivateUser(@PathVariable Long id) {
        return service.deactivateUser(id);
    }
}
