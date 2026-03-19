package tn.esprit.studentmanagement.entities;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.time.LocalDate;
import java.util.List;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idStudent;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private LocalDate dateOfBirth;
    private String address;

    @ToString.Exclude
    @ManyToOne
    @JoinColumn(name = "department_id_department")
    private Department department;
    
    @ToString.Exclude
    @JsonIgnore
    @OneToMany(mappedBy = "student")
    private List<Enrollment> enrollments;
}
