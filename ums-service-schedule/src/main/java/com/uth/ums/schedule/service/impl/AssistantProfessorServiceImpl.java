package com.uth.ums.schedule.service.impl;

import com.uth.ums.schedule.model.entity.AssistantProfessor;
import com.uth.ums.schedule.model.entity.AssistantProfessor.AssistantProfessorId;
import com.uth.ums.schedule.repository.AssistantProfessorRepository;
import com.uth.ums.schedule.service.AssistantProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssistantProfessorServiceImpl implements AssistantProfessorService {
    private final AssistantProfessorRepository assistantProfessorRepository;

    @Autowired
    public AssistantProfessorServiceImpl(AssistantProfessorRepository assistantProfessorRepository) {
        this.assistantProfessorRepository = assistantProfessorRepository;
    }

    @Override
    public List<AssistantProfessor> getAllAssistantProfessors() {
        return assistantProfessorRepository.findAll();
    }

    @Override
    public AssistantProfessor getAssistantProfessorById(AssistantProfessorId id) {
        return assistantProfessorRepository.findById(id).orElse(null);
    }

    @Override
    public AssistantProfessor createAssistantProfessor(AssistantProfessor assistantProfessor) {
        return assistantProfessorRepository.save(assistantProfessor);
    }

    @Override
    public AssistantProfessor updateAssistantProfessor(AssistantProfessor assistantProfessor) {
        return assistantProfessorRepository.save(assistantProfessor);
    }

    @Override
    public void deleteAssistantProfessor(AssistantProfessorId id) {
        assistantProfessorRepository.deleteById(id);
    }
}
