package com.uth.ums.enrollment.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id", nullable = false)
    private Long studentId;

    private int classId;
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String gender;
    private String phoneNumber;
    private String email;
    private String careerStatusName;
    private LocalDate careerStatusDate;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "university_class_id")
    private UniversityClass universityClass;

    @OneToMany(mappedBy="student")
    private Set<CourseEnrollment> courseEnrollments;
}
