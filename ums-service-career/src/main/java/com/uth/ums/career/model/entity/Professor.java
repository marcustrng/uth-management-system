package com.uth.ums.career.model.entity;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Entity
@Table(name = "professors")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Professor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "professor_id")
	private Long professorId;

	@Column(name = "first_name", nullable = false)
	private String firstName;

	@Column(name = "last_name", nullable = false)
	private String lastName;

	@Column(name = "email")
	private String email;

	@Column(name = "phone_number")
	private String phoneNumber;
}
