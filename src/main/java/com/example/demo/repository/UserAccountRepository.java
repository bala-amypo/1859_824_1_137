// package com.example.demo.repository;
// import org.springframework.data.jpa.repository.JpaRepository;
// import com.example.demo.entity.UserAccount;
// public interface UserAccountRepository extends JpaRepository<UserAccount,Long>{

// }
package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.UserAccount;

@Repository
public interface UserAccountRepository extends JpaRepository<UserAccount, Long> {

    // Find user by email
    UserAccount findByEmail(String email);

    // Check if email already exists
    boolean existsByEmail(String email);
}
