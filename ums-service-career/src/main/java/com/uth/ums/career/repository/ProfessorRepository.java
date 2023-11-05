package com.uth.ums.career.repository;

import com.uth.ums.career.model.entity.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {
}
