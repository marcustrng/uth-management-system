package com.uth.ums.career.model.entity;

import jakarta.persistence.*;
import java.util.Set;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "courses")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "course_id")
	private Long courseId;

	@Column(name = "course_name", nullable = false)
	private String courseName;

	@Column(name = "course_code", nullable = false)
	private String courseCode;

	@ManyToOne
	@JoinColumn(name = "career_id")
	private Career career;

	@Column(name = "year")
	private Integer year;

	@Column(name = "semester")
	private Integer semester;

    @ManyToOne
    @JoinColumn(name="professor_id", nullable=false)
	private Professor professor;
}
