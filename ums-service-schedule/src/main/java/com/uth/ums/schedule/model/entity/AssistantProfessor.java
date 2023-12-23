package com.uth.ums.schedule.model.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.ToString.Exclude;

@Entity
@Table(name = "assistant_professor")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
public class AssistantProfessor {
  @EmbeddedId private AssistantProfessorId id;

  @ManyToOne(fetch = FetchType.LAZY)
  @MapsId("courseOccurrenceId")
  @JoinColumn(name = "course_occurrence_id")
  @Exclude
  private CourseOccurrence courseOccurrence;

  @Data
  @NoArgsConstructor
  @AllArgsConstructor
  public static class AssistantProfessorId implements Serializable {
    private Long courseOccurrenceId;
    private Long professorId;
  }
}
