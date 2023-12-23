package com.uth.ums.enrollment.repository;

import com.uth.ums.enrollment.model.entity.CourseEnrollment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseEnrollmentRepository extends JpaRepository<CourseEnrollment, Long> {
    // You can define custom query methods or use the existing methods provided by JpaRepository
}
