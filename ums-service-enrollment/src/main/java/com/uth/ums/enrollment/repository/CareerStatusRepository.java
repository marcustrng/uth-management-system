package com.uth.ums.enrollment.repository;

import com.uth.ums.enrollment.model.entity.CareerStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CareerStatusRepository extends JpaRepository<CareerStatus, Integer> {
}
