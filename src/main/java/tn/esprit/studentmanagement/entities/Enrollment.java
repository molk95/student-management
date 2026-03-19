package tn.esprit.studentmanagement.entities;

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
    @JsonIgnore
    @ManyToOne
    private Student student;

    @ToString.Exclude
    @JsonIgnore
    @ManyToOne
    private Course course;





}
