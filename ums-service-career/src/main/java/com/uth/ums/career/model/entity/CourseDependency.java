package com.uth.ums.career.model.entity;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Entity
@Table(name = "course_dependency")
@Getter
@Setter
@ToString
public class CourseDependency {
	@EmbeddedId
	private CourseDependencyId id;

	@ManyToOne
	@MapsId("courseId")
	@JoinColumn(name = "course_id")
	private Course course;

	@ManyToOne
	@MapsId("requiredCourseId")
	@JoinColumn(name = "required_course_id")
	private Course requiredCourse;

	@Embeddable
	public static class CourseDependencyId implements Serializable {
		@Column(name = "course_id")
		private Long courseId;

		@Column(name = "required_course_id")
		private Long requiredCourseId;
	}
}
