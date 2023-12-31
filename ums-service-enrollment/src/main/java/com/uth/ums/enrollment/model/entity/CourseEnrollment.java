package com.uth.ums.enrollment.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.ToString.Exclude;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "course_enrollment")
public class CourseEnrollment {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "course_enrollment_id")
  private Long courseEnrollmentId;

  @Column(name = "student_id", insertable=false, updatable=false)
  private Long studentId;

  @Column(name = "course_occurrence_id")
  private Long courseOccurrenceId;

  @Column(name = "final_score")
  private Double finalScore;

  @ManyToOne
  @JoinColumn(name = "student_id")
  private Student student;

  @OneToMany(mappedBy = "courseEnrollment")
  @Exclude
  private Set<CourseEnrollmentEvaluation> courseEnrollmentEvaluations;
}
