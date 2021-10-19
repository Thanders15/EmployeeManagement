package SpringAngular.Employee.model;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Getter
@Setter
@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "firstName", nullable = false)
    @Size(min = 3, max = 40)
    private String firstName;

    @Column(name = "lastName", nullable = false)
    @Size(min = 3, max = 40)
    private String lastName;

    @Column(name = "email", nullable = false)
    @Email(message = "Please enter a valid e-mail address")
    @NotBlank
    private String email;


    @Column(name = "phoneNumber", nullable = false)
    @Pattern(regexp="\\d{9}|(?:\\d{3}-){2}\\d{3}|\\(\\d{3}\\)\\d{3}-?\\d{3}", message = "Please enter a valid number")
    private String phoneNumber;

    public Employee(){
    }
    public Employee(String firstName, String lastName, String email, String phoneNumber){
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }


}
