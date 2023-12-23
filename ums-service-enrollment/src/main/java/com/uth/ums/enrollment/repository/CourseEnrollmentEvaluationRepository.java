package com.uth.ums.enrollment.repository;

import com.uth.ums.enrollment.model.entity.CourseEnrollmentEvaluation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseEnrollmentEvaluationRepository extends JpaRepository<CourseEnrollmentEvaluation, Long> {

    // Additional custom query methods can be defined here if needed

}
