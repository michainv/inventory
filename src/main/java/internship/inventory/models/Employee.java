package internship.inventory.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.sun.istack.NotNull;
import lombok.*;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

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
    @Column(name = "id",updatable = false )
    private Integer id;


    @Column(name = "name",updatable = true ,nullable = false,length = 45)
    private String name;

    @Column(name = "email",updatable = true ,nullable = false,length = 45)
    private String email;

    @Column(name = "company_id",updatable = true ,nullable = false,length = 45)
    private Integer company_id;

    @ManyToOne
    @JsonBackReference(value="work_company")
    private Company work_company;



    @OneToMany(mappedBy="owner_employee")
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
