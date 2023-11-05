package com.uth.ums.enrollment.repository;

import com.uth.ums.enrollment.model.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
