// import jakarta.persistence.Entity;
// import jakarta.persistence.Id;
// import jakarta.persistence.Column;
// import jakarta.persistence.PrePersist;
// import java.sql.Timestamp;
// @Entity
// public class UserAccount{
//     @Id
//     private Long id;
//     @Column (unique=true)
//     private String email;
//     private String fullName;
//     private Boolean active;
//    // @PrePersist
//     private Timestamp createdAt;
//   //  @PrePersist
//     private Timestamp updatedAt;


// public Long getid()
// {
//     return id;
// }
// public void setid(Long id)
// {
//     this.id=id;
// }
// public  String getemail(){
//     return email;
// }
// public void setemail(String email){
//     this.email=email;
// }
// public  String getfullName(){
//     return fullName;
// }
// public void setfullName(String fullName){
//     this.fullName=fullName;
// }
// public Boolean getactive(){
//     return active;
// }
// public  void setactive(Boolean active){
//     this.active=active;
// }
// public Timestamp getcreatedAt(){
//     return createdAt;
// }
// public  void setcreatedAt(Timestamp createdAt){
//     this.createdAt=createdAt;
// }
// public Timestamp getupdatedAt(){
//     return updatedAt ;
// }
// public void setupdatedAt(Timestamp updatedAt){
//     this.updatedAt=updatedAt;
// }
// public UserAccount()
// {}
// public UserAccount(Long id,String email,String fullName,Boolean active,Timestamp createdAt,Timestamp updatedAt){
//     this.id=id;
//     this.email=email;
//     this.fullName=fullName;
//     this.active=active;
//     this.createdAt=createdAt;
//     this.updatedAt=updatedAt;

// }
// }
package com.example.demo.Entity;

import jakarta.persistence.*;
import java.sql.Timestamp;

@Entity
public class UserAccount {

    @Id
    private Long id;

    @Column(unique = true)
    private String email;

    private String fullName;

    private Boolean active;

    private Timestamp createdAt;
    private Timestamp updatedAt;

    // Getters & Setters
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Boolean getActive() {
        return active;
    }
    public void setActive(Boolean active) {
        this.active = active;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    public UserAccount() {}

    public UserAccount(Long id, String email, String fullName,
                       Boolean active, Timestamp createdAt, Timestamp updatedAt) {
        this.id = id;
        this.email = email;
        this.fullName = fullName;
        this.active = active;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
}
