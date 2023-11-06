package com.uth.ums.career.repository;

import com.uth.ums.career.model.entity.Career;
import com.uth.ums.career.model.entity.Course;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CareerRepository extends JpaRepository<Career, Long> {
}
