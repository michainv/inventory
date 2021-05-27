package internship.inventory.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.sun.istack.NotNull;
import lombok.*;
import org.hibernate.annotations.NaturalId;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
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
    @JsonBackReference
    private Company company;





}
