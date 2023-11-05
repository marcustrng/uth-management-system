package com.uth.ums.enrollment.model.dto;

import com.uth.ums.enrollment.model.entity.Student;
import lombok.Value;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;

/**
 * DTO for {@link Student}
 */
@Value
public class StudentDto implements Serializable {
    Long studentId;
    int classId;
    String firstName;
    String lastName;
    LocalDate dateOfBirth;
    String gender;
    String phoneNumber;
    String email;
    String careerStatusName;
    LocalDate careerStatusDate;
    UniversityClassDto universityClass;
    Set<CourseEnrollmentDto> courseEnrollments;
}
