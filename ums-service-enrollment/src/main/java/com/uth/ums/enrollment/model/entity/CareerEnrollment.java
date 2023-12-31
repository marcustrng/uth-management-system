package com.uth.ums.enrollment.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "career_enrollment")
public class CareerEnrollment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "career_enrollment_id")
	private Long careerEnrollmentId;

	@Column(name = "student_id", insertable = false, updatable = false)
	private Long studentId;

	@Column(name = "career_id")
	private Long careerId;

	@Column(name = "enrollment_date")
	private Date enrollmentDate;

	@Column(name = "career_status_id", insertable = false, updatable = false)
	private Long careerStatusId;

	@Column(name = "career_status_date")
	private Date careerStatusDate;

	@ManyToOne
	@JoinColumn(name = "student_id", nullable = false)
	private Student student;

	@ManyToOne
	@JoinColumn(name = "career_status_id", nullable = false)
	private CareerStatus careerStatus;
}
