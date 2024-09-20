package beans;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Student")
public class Student extends  Person {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "Student_Id",nullable = false)
    private int id;

    @Column(name = "Student_Course",nullable = false,length = 30)
    private String course;

    @Column(name = "Student_Fees",nullable = false)
    private double fees;
}
