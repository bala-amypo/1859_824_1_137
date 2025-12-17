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
    private Timestamp updatedAt

}