package com.uth.ums.career.model.dto;

import lombok.Value;

import java.io.Serializable;
import java.util.Set;

/**
 * DTO for {@link com.uth.ums.career.model.entity.Career}
 */
@Value
public class CareerDto implements Serializable {
    Long careerId;
    String careerName;
    CareerLevelDto careerLevel;
    FacultyDto faculty;
    transient Set<SemesterDto> semesters;
}
