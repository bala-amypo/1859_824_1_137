import.jakarta.persistence.Entity;
import.jakarta.persistence.Id;
import.jakarta.persistence.Column;
@Entity
public class Permission{
    @Id
    private Long id;
     @Column (unique=true)
    private string PermissionKey;
    private String description;
    private Boolean active;
    
}