package com.uth.ums.career.repository;

import com.uth.ums.career.model.entity.CareerLevel;
import com.uth.ums.career.model.entity.ProfessorCourse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfessorCourseRepository extends JpaRepository<ProfessorCourse, Long> {
}
