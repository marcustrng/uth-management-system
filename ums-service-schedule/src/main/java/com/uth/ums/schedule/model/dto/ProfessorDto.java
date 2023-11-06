package com.uth.ums.schedule.model.dto;

import lombok.Value;

import java.io.Serializable;
import java.time.LocalDate;

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
