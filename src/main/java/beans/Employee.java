package beans;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Employee")
public class Employee  extends  Person{

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "Employee_Id",nullable = false)
    private int id;

    @Column(name = "Employee_Job",nullable = false,length = 40)
    private String  job;

    @Column(name ="Employee_sal",nullable = false)
    private double sal;
}
