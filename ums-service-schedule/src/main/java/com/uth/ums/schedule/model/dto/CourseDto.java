package com.uth.ums.schedule.model.dto;

import com.uth.ums.schedule.model.dto.ProfessorCourseDto;
import lombok.Value;

import java.io.Serializable;
import java.util.Set;

@Value
public class CourseDto implements Serializable {
    Long courseId;
    String courseName;
    String courseCode;
    Integer credits;
    transient Set<ProfessorCourseDto> professorCourses;
}
