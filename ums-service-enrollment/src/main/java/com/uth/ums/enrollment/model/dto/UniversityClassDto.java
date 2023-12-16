package com.uth.ums.enrollment.model.dto;

import com.uth.ums.enrollment.model.entity.UniversityClass;
import lombok.Value;

import java.io.Serializable;
import java.util.Set;

/**
 * DTO for {@link UniversityClass}
 */
@Value
public class UniversityClassDto implements Serializable {
    Long universityClassId;
    Long careerId;
    String classCode;
    String className;
    Long classYear;
    String classStatus;
    Set<StudentDto> students;
}
