package com.uth.ums.schedule.model.dto;

import lombok.Value;

import java.io.Serializable;

@Value
public class ProfessorCourseDto implements Serializable {
    Long professorCourseId;
    ProfessorDto professor;
}
