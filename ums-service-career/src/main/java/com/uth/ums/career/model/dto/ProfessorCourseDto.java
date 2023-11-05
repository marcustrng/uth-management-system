package com.uth.ums.career.model.dto;

import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link com.uth.ums.career.model.entity.ProfessorCourse}
 */
@Value
public class ProfessorCourseDto implements Serializable {
    Long professorCourseId;
    ProfessorDto professor;
}