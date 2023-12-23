package com.uth.ums.enrollment.model.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "course_enrollment")
public class CourseEnrollment {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "course_enrollment_id")
    private Long courseEnrollmentId;
    
    @Column(name = "student_id")
    private Long studentId;
    
    @Column(name = "course_occurrence_id")
    private Long courseOccurrenceId;
    
    @Column(name = "final_score")
    private Double finalScore;
}
