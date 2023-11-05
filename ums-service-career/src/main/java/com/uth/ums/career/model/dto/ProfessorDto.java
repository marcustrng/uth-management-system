package com.uth.ums.career.model.dto;

import lombok.Value;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * DTO for {@link com.uth.ums.career.model.entity.Professor}
 */
@Value
public class ProfessorDto implements Serializable {
    Long professorId;
    String firstName;
    String lastName;
    LocalDate dateOfBirth;
    String gender;
    String phoneNumber;
    String email;
}