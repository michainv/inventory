package internship.inventory.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.sun.istack.NotNull;
import lombok.*;
import org.hibernate.annotations.NaturalId;

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



    @ManyToOne
    @JoinColumn(name = "company_id",nullable = false)
    @JsonBackReference
    private Company company;



}
