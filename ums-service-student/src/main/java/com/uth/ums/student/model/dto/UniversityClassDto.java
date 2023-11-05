package com.uth.ums.student.model.dto;

import lombok.Value;

import java.io.Serializable;
import java.util.Set;

/**
 * DTO for {@link com.uth.ums.student.model.entity.UniversityClass}
 */
@Value
public class UniversityClassDto implements Serializable {
    Long universityClassId;
    Long careerId;
    String classCode;
    String className;
    int classYear;
    String classStatus;
    Set<StudentDto> students;
}
