package com.uth.ums.career.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.uth.ums.career.model.entity.Professor;
import java.io.Serializable;
import lombok.Value;

/**
 * DTO for {@link Professor}
 */
@Value
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProfessorDto implements Serializable {

	Long professorId;
	String firstName;
	String lastName;
	String email;
	String phoneNumber;
}
