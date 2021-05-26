package internship.inventory.models;

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

    @Column(name= "name")
    private String name;

    @Column(name= "address")
    private String address;

    @OneToMany(mappedBy="company")
    private List<Employee> employees;

    @OneToMany(mappedBy="company")
    private List<Device> devices;


}
