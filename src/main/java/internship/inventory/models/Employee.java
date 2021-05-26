package internship.inventory.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@Table (name = "employee")
public class Employee {
    @Id
    @Column(name = "id")
    private int id;
    private String name;
    private String email;
    private int company_ID;



    public Employee(){

    }

    public Employee(@JsonProperty("id") int id,
                    @JsonProperty("name")String name,
                    @JsonProperty("email")String email,
                    @JsonProperty("company_id")int company_ID) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.company_ID = company_ID;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", company_ID=" + company_ID +
                '}';
    }

    public void updateInfo(String name,String email,int companyId){
        this.name = name;
        this.email = email;
        this.company_ID = companyId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCompany_ID() {
        return company_ID;
    }

    public void setCompany_ID(int company_ID) {
        this.company_ID = company_ID;
    }
}
