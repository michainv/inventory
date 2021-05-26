package internship.inventory.models;

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

    @Column(name ="type")
    private String type;

    @ManyToOne
    @JoinColumn(name = "company_id",nullable = false)
    private Company company;

    @ManyToOne
    @JoinColumn(name = "employee_id",nullable = false)
    private Employee employee;


}
