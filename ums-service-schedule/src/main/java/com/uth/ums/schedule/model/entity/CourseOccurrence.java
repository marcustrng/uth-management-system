package com.uth.ums.schedule.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "course_occurrence")
public class CourseOccurrence {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "course_occurrence_id", nullable = false)
    private Long courseOccurrenceId;

    private Long courseId;
    private Long professorId;
    private String courseOccurrenceCode;
    private String classCode;
    private LocalDate startDate;
    private LocalDate endDate;
    private Long capacity;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "course_occurrence_id")
    private Set<Schedule> schedules;
}
