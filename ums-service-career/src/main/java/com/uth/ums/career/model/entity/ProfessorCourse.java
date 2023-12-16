package com.uth.ums.career.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.util.Objects;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.proxy.HibernateProxy;

@Entity
@Table(name = "professor_course")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class ProfessorCourse {
	@EmbeddedId
	private ProfessorCourseId id;

	@ManyToOne
	@MapsId("professorId")
	@JoinColumn(name = "professor_id")
	private Professor professor;

	@ManyToOne
	@MapsId("courseId")
	@JoinColumn(name = "course_id")
	private Course course;

	@Embeddable
	@Data
	public static class ProfessorCourseId implements Serializable {
		@Column(name = "professor_id")
		private Long professorId;

		@Column(name = "course_id")
		private Long courseId;
	}
}
