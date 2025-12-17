import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
@Entity
public class Permission{
    @Id
    private Long id;
     @Column (unique=true)
    private string PermissionKey;
    private String description;
    private Boolean active;
     public Long getid()
{
    return id;
}
public void setid(Long id)
{
    this.id=id;
} 
public String getpermissionKey()
{
    return PermissionKey;
}
public void setpermissionKey(string PermissionKey)
{
    this.PermissionKey=PermissionKey;
}
public string getdescription()
{
    return description;
}
public void setdescription(string description )
{
    this.description=description;
}
public string getactive()
{
    return active;
}
public void setactive(Boolean active)
{
    this.active=active;
}    
}