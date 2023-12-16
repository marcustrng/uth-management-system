package com.uth.ums.career.model.dto;

import com.uth.ums.career.model.dto.CourseDto;
import com.uth.ums.career.model.dto.ProfessorDto;
import com.uth.ums.career.model.entity.ProfessorCourse;
import java.io.Serializable;

/**
 * DTO for {@link ProfessorCourse}
 */
public record ProfessorCourseDto(ProfessorDto professor, CourseDto course) implements Serializable {
}
