package internship.inventory.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "company")
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name= "name",length = 255,nullable = false,unique = true)
    private String name;

    @Column(name= "address",length = 255,nullable = false)
    private String address;

    @JsonManagedReference(value="work_company")
    @OneToMany(mappedBy="work_company")
    private List<Employee> employees;

    @JsonManagedReference(value="owner_company")
    @OneToMany(mappedBy="owner_company")
    private List<Device> devices;


}
