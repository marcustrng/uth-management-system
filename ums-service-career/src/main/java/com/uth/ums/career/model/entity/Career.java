package com.uth.ums.career.model.entity;

import jakarta.persistence.*;
import java.util.List;
import java.util.Set;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "careers")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Career {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "career_id")
	private Long careerId;

	@Column(name = "career_name", nullable = false)
	private String careerName;

	@ManyToOne
	@JoinColumn(name = "department_id")
	private Department department;

	@Column(name = "duration_years")
	private Integer durationYears;

	@Column(name = "required_optative_courses")
	private Integer requiredOptativeCourses;

	@ManyToOne
	@JoinColumn(name = "career_level_id")
	private CareerLevel careerLevel;

	@OneToMany(mappedBy = "career")
	private List<Course> courses;
}
