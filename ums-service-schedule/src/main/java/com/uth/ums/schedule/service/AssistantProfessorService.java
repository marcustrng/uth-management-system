package com.uth.ums.schedule.service;

import com.uth.ums.schedule.model.dto.AssistantProfessorDto;
import java.util.List;

import com.uth.ums.schedule.model.entity.AssistantProfessor;

import java.util.List;

public interface AssistantProfessorService {
    List<AssistantProfessor> getAllAssistantProfessors();

    AssistantProfessor getAssistantProfessorById(AssistantProfessor.AssistantProfessorId id);

    AssistantProfessor createAssistantProfessor(AssistantProfessor assistantProfessor);

    AssistantProfessor updateAssistantProfessor(AssistantProfessor assistantProfessor);

    void deleteAssistantProfessor(AssistantProfessor.AssistantProfessorId id);
}
