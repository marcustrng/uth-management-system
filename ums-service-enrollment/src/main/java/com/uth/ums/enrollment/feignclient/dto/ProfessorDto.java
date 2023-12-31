package com.uth.ums.enrollment.feignclient.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import lombok.Value;

@Value
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProfessorDto implements Serializable {

	Long professorId;
	String firstName;
	String lastName;
	String email;
	String phoneNumber;
}
