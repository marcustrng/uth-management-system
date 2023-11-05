package com.uth.ums.career.repository;

import com.uth.ums.career.model.entity.Career;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CareerRepository extends JpaRepository<Career, Long> {
}
