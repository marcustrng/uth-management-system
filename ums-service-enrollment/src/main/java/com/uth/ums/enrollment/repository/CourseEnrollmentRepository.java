package com.uth.ums.enrollment.repository;

import com.uth.ums.enrollment.model.entity.CourseEnrollment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseEnrollmentRepository extends JpaRepository<CourseEnrollment, Long> {
}
