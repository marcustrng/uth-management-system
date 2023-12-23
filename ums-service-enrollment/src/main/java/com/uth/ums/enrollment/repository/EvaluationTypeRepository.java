package com.uth.ums.enrollment.repository;

import com.uth.ums.enrollment.model.entity.EvaluationType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EvaluationTypeRepository extends JpaRepository<EvaluationType, Long> {
}
