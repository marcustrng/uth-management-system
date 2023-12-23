package com.uth.ums.enrollment.model.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

import lombok.Data;

@Data
@Entity
@Table(name = "course_enrollment_evaluation")
public class CourseEnrollmentEvaluation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "course_enrollment_evaluation_id")
    private Long courseEnrollmentEvaluationId;

    @ManyToOne
    @JoinColumn(name = "course_enrollment_id", referencedColumnName = "course_enrollment_id")
    private CourseEnrollment courseEnrollment;

    @ManyToOne
    @JoinColumn(name = "evaluation_type_id", referencedColumnName = "evaluation_type_id")
    private EvaluationType evaluationType;

    @Column(name = "evaluation_date")
    private LocalDate evaluationDate;

    @Column(name = "score")
    private BigDecimal score;
}
