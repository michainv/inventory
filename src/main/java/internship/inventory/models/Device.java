package internship.inventory.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

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
    @Column(name ="serial_number",length = 255,nullable = false)
    private String serial_number;

    @Column(name = "name",length = 255,nullable = false)
    private String name;

    @Column(name = "type",length = 255,nullable = false)
    private String type;


    @ManyToOne(fetch=FetchType.LAZY,optional=false)
    @JoinColumn(name = "company_id",referencedColumnName = "id",nullable = false)
    @JsonBackReference(value="owner_company")
    private Company owner_company;

    @ManyToOne(fetch=FetchType.LAZY,optional=true)
    @JoinColumn(name = "employee_id",referencedColumnName = "id",nullable = true)
    @JsonBackReference(value="owner_employee")
    private Employee owner_employee;



}
