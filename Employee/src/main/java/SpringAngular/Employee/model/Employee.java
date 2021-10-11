package SpringAngular.Employee.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;

@Getter
@Setter
@EntityScan
@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "emailId")
    private String emailId;

    public Employee(){

    }
    public Employee(String firstName, String lastName, String emailId){
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailId = emailId;
    }


}
