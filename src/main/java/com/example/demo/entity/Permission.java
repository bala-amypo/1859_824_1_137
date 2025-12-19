// import jakarta.persistence.Entity;
// import jakarta.persistence.Id;
// import jakarta.persistence.Column;
// @Entity
// public class Permission{
//     @Id
//     private Long id;
//      @Column (unique=true)
//     private string PermissionKey;
//     private String description;
//     private Boolean active;
//      public Long getid()
// {
//     return id;
// }
// public void setid(Long id)
// {
//     this.id=id;
// } 
// public String getpermissionKey()
// {
//     return PermissionKey;
// }
// public void setpermissionKey(string PermissionKey)
// {
//     this.PermissionKey=PermissionKey;
// }
// public string getdescription()
// {
//     return description;
// }
// public void setdescription(string description )
// {
//     this.description=description;
// }
// public string getactive()
// {
//     return active;
// }
// public void setactive(Boolean active)
// {
//     this.active=active;
// }    
package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(
    name = "permission",
    uniqueConstraints = {
        @UniqueConstraint(columnNames = "permission_name")
    }
)
public class Permission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "permission_name", nullable = false, unique = true)
    private String permissionName;

    private String description;

    private Boolean active = true;

    public Permission() {}

    // Getters & Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getPermissionName() { return permissionName; }
    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }

    public String getDescription() { return description; }
    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getActive() { return active; }
    public void setActive(Boolean active) { this.active = active; }
}
