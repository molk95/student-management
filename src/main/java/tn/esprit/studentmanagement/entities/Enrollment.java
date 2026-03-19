package tn.esprit.studentmanagement.entities;
import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Enrollment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEnrollment;
    private LocalDate enrollmentDate;
    private Double grade;
    @Enumerated(EnumType.STRING)
    private Status status;

    @ToString.Exclude
    @ManyToOne
    @JoinColumn(name = "student_id_student")
    private Student student;
    
    @ToString.Exclude
    @ManyToOne
    @JoinColumn(name = "course_id_course")
    private Course course;




}
