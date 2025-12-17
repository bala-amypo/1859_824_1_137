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
public setemail(String email){
    this.email=email;
}
public getfullName(){
    return fullName;
}
public setfullName(string fullName){
    this.fullName=fullName;
}
public getactive(){
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

