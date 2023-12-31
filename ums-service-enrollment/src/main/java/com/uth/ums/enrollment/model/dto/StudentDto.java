package com.uth.ums.enrollment.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.uth.ums.enrollment.model.entity.Student;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;

/** DTO for {@link Student} */
@JsonIgnoreProperties(ignoreUnknown = true)
public record StudentDto(
        int studentId,
        @Size(message = "Last name cannot exceed 50 characters", max = 50)
        @NotBlank(message = "Last name is required")
        String lastName,
        String firstName,
        LocalDate dateOfBirth,
        @Size(message = "Email cannot exceed 100 characters", max = 100)
        @Email(message = "Invalid email address")
        @NotBlank(message = "Email is required")
        String email,
        @Size(message = "Phone number cannot exceed 20 characters", max = 20)
        @NotBlank(message = "Phone number is required")
        String phoneNumber, Set<CareerEnrollmentDto> careerEnrollments, Set<CourseEnrollmentDto> courseEnrollments)
    implements Serializable {}
