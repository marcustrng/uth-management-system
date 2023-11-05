package com.uth.ums.career.model.dto;

import lombok.Value;

import java.io.Serializable;
import java.util.Set;

/**
 * DTO for {@link com.uth.ums.career.model.entity.Semester}
 */
@Value
public class SemesterDto implements Serializable {
    Long semesterId;
    Integer semesterNo;
    transient Set<SemesterCourseDto> semesterCourses;
}
