import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.PrePersist;
@Entity
public class UserAccount{
    @Id
    private Long id;
    @Column (unique=ture)
    private String email;
    private String fullname;
    private Boolean active;
    @PrePersist
    private Timestamp createdAt;
    @PrePersist
    private Timestamp updatedAt;


public Long getid()
{
    return id;
}
public void setid(Long id)
{
    this.id=id;
}
public  String getemail(){
    return email;
}
public void setemail(String email){
    this.email=email;
}
public  string getfullName(){
    return fullName;
}
public void setfullName(string fullName){
    this.fullName=fullName;
}
public Boolean getactive(){
    return active;
}
public  void setactive(Boolean active){
    this.active=active;
}
public Timestamp getcreatedAt(){
    return createdAt;
}
public  void setcreatedAt(Timestamp createdAt){
    this.createdAt=createdAt;
}
public Timestamp getupdatedAt(){
    return updatedAt ;
}
public void setupdatedAt(Timestamp updatedAt){
    this.updatedAt=updatedAt;
}
}
