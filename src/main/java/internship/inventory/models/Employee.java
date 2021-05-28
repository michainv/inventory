package internship.inventory.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.sun.istack.NotNull;
import lombok.*;
import org.hibernate.annotations.NaturalId;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.util.List;


@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table (name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",updatable = false ,nullable = false)
    private Integer id;

    @NotNull
    @Column(name = "name",updatable = true ,nullable = false,length = 255)
    private String name;
    @NotNull
    private String email;

    @Column(name ="company_id",insertable = false,updatable = false)
    private Integer company_id;

    @ManyToOne
    @JoinColumn(name = "company_id",referencedColumnName = "id")
    @OnDelete(action= OnDeleteAction.NO_ACTION)
    @JsonBackReference
    private Company company;



    @OneToMany(mappedBy="employee",orphanRemoval = true)
    private List<Device> devices;

//   @PreRemove
//    public void preRemove() {
//       for(Device d : devices){
//           System.out.println("test");
//           d.setEmployee_id(null);
//       }
//   }
//


}
