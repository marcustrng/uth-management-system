package com.uth.ums.career.repository;

import com.uth.ums.career.model.entity.Semester;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SemesterRepository extends JpaRepository<Semester, Long> {
}
