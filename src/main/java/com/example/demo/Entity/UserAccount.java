import.jakarta.persistence.Entity;
import.jakarta.persistence.Id;
@Entity
public class UserAccount{
    @Id
    private Long id;
    @Column (unique=ture)
    private String emil;
    private String fullname;
    private Boolean active;
    private Timestamp createdAt;
    private Timestamp updatedAt;

}
public getid()
{
    return id;
}
public setid(Long id)
{
    this.id=id;
}
public getemail(){
    return email;
}
public