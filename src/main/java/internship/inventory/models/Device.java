package internship.inventory.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "device")
public class Device {
    @Id
    @Column(name ="serial_number")
    private String serial_number;

    @Column(name = "name")
    private String name;

    @Column(name = "type")
    private String type;

//    @Column(name = "company_id",insertable = false , updatable = false)
//    private int company_id;
//
//    @Column(name = "employee_id",insertable = false , updatable = false)
//    private int employee_id;

    @ManyToOne
    @JoinColumn(name = "company_id",referencedColumnName = "id",nullable = false)
    @JsonBackReference
    private Company company;

    @ManyToOne
    @JoinColumn(name = "employee_id",referencedColumnName = "id",nullable = false)
    @JsonBackReference
    private Employee employee;


}
