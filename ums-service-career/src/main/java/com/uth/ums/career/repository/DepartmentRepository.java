package com.uth.ums.career.repository;

import com.uth.ums.career.model.entity.CareerLevel;
import com.uth.ums.career.model.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
