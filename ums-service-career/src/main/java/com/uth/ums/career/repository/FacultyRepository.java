package com.uth.ums.career.repository;

import com.uth.ums.career.model.entity.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacultyRepository extends JpaRepository<Faculty, Long> {
}
