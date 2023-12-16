package com.uth.ums.career.repository;

import com.uth.ums.career.model.entity.Career;
import com.uth.ums.career.model.entity.CareerLevel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CareerLevelRepository extends JpaRepository<CareerLevel, Long> {
}
