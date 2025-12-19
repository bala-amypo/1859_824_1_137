//  import jakarta.persistence.Entity;
//  import jakarta.persistence.Id;
//  import jakarta.persistence.Column;
//  @Entity
//  public class Role{
//     @Id
//     private Long id;
//      @Column (unique=true)
//      private string roleName;
//      private string description;
//      private Boolean active;
//      public Long getid()
//  {
//      return id;
//  }
//  public void setid(Long id)
//  {
//      this.id=id;
//  } 
//  public String getroleName()
//  {
//      return roleName;
//  }
//  public void setroleName(string roleName)
//  {
//      this.roleName=roleName;
//  }
//  public string getdescription()
//  {
//      return description;
//  }
//  public void setdescription(string description )
//  {
//      this.description=description;
//  }
//  public string getactive()
//  {
//      return active;
//  }
//  public void setactive(Boolean active)
//  {
//      this.active=active;
//  }



//  }
package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(
    name = "role",
    uniqueConstraints = {
        @UniqueConstraint(columnNames = "role_name")
    }
)
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "role_name", nullable = false, unique = true)
    private String roleName;

    private String description;

    private Boolean active = true;

    public Role() {
    }

    public Role(String roleName, String description, Boolean active) {
        this.roleName = roleName;
        this.description = description;
        this.active = active;
    }

    // Getters & Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
}
