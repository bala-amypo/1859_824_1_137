import.jakarta.persistence.Entity;
import.jakarta.persistence.Id;
import.jakarta.persistence.Column;
@Entity
public class Role{
    @Id
    private Long id;
    @Column (unique=true)
    private string roleName;
    private string description;
    private Boolean active;
    public Long getid()
{
    return id;
}
public void setid(Long id)
{
    this.id=id;
} 
public String getroleName()
{
    return roleName;
}
public void setroleName(string roleName)
{
    this.roleName=roleName;
}


}