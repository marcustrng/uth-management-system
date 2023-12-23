package com.uth.ums.schedule.repository;

import com.uth.ums.schedule.model.entity.AssistantProfessor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AssistantProfessorRepository extends JpaRepository<AssistantProfessor, AssistantProfessor.AssistantProfessorId> {
}
