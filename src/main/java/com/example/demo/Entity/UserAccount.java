import.jakarta.persistence.Entity;
import.jakarta.persistence.Id;
import.jakarta.persistence.Column;

@Entity
public class UserAccount{
    @Id
    private Long id;
    @Column (unique=ture)
    private String email;
    private String fullname;
    private Boolean active;
    private Timestamp createdAt;
    private Timestamp updatedAt;

}
public Float getid()
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
public setactive(Boolean active){
    this.active=active;
}
public getcreatedAt(){
    return createdAt;
}
public setcreatedAt(Timestamp createdAt){
    this.createdAt=createdAt;
}
public getupdatedAt(){
    return updatedAt ;
}
public setupdatedAt(Timestamp updatedAt){
    this.updatedAt=updatedAt;
}

