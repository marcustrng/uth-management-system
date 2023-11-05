package com.uth.ums.enrollment.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "course_enrollment")
public class CourseEnrollment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "course_enrollment_id", nullable = false)
    private Long courseEnrollmentId;

    private Long courseOccurrenceId;
    private Double attendanceScore;
    private Double progressScore;
    private Double midtermExamScore;
    private Double finalExamScore;
    private Double finalScore;

    @ManyToOne
    @JoinColumn(name="student_id", nullable=false)
    private Student student;
}
