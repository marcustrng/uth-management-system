package com.uth.ums.enrollment.repository;

import com.uth.ums.enrollment.model.entity.CareerEnrollment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CareerEnrollmentRepository extends JpaRepository<CareerEnrollment, Long> {
    // Add custom query methods or use the default methods provided by JpaRepository
}
