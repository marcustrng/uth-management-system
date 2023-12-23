package com.uth.ums.schedule.controller;

import com.uth.ums.schedule.model.entity.AssistantProfessor;
import com.uth.ums.schedule.model.entity.AssistantProfessor.AssistantProfessorId;
import com.uth.ums.schedule.service.AssistantProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/assistant-professors")
public class AssistantProfessorController {
    private final AssistantProfessorService assistantProfessorService;

    @Autowired
    public AssistantProfessorController(AssistantProfessorService assistantProfessorService) {
        this.assistantProfessorService = assistantProfessorService;
    }

    @GetMapping
    public ResponseEntity<List<AssistantProfessor>> getAllAssistantProfessors() {
        List<AssistantProfessor> assistantProfessors = assistantProfessorService.getAllAssistantProfessors();
        return ResponseEntity.ok(assistantProfessors);
    }

    @GetMapping("/{courseOccurrenceId}/{professorId}")
    public ResponseEntity<AssistantProfessor> getAssistantProfessorById(
            @PathVariable("courseOccurrenceId") Long courseOccurrenceId,
            @PathVariable("professorId") Long professorId) {
        AssistantProfessorId id = new AssistantProfessorId(courseOccurrenceId, professorId);
        AssistantProfessor assistantProfessor = assistantProfessorService.getAssistantProfessorById(id);
        if (assistantProfessor != null) {
            return ResponseEntity.ok(assistantProfessor);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<AssistantProfessor> createAssistantProfessor(
            @RequestBody AssistantProfessor assistantProfessor) {
        AssistantProfessor createdAssistantProfessor = assistantProfessorService.createAssistantProfessor(assistantProfessor);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdAssistantProfessor);
    }

    @PutMapping
    public ResponseEntity<AssistantProfessor> updateAssistantProfessor(
            @RequestBody AssistantProfessor assistantProfessor) {
        AssistantProfessor updatedAssistantProfessor = assistantProfessorService.updateAssistantProfessor(assistantProfessor);
        return ResponseEntity.ok(updatedAssistantProfessor);
    }

    @DeleteMapping("/{courseOccurrenceId}/{professorId}")
    public ResponseEntity<Void> deleteAssistantProfessor(
            @PathVariable("courseOccurrenceId") Long courseOccurrenceId,
            @PathVariable("professorId") Long professorId) {
        AssistantProfessorId id = new AssistantProfessorId(courseOccurrenceId, professorId);
        assistantProfessorService.deleteAssistantProfessor(id);
        return ResponseEntity.noContent().build();
    }
}
