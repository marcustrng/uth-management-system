package com.uth.ums.schedule.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "course_occurrence")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
public class CourseOccurrence {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "course_occurrence_id")
    private Long courseOccurrenceId;

    @Column(name = "course_id")
    private Integer courseId;

    @Column(name = "occurrence_year")
    private Integer occurrenceYear;

    @Column(name = "course_occurrence_code", length = 255)
    private String courseOccurrenceCode;

    @Column(name = "professor_id")
    private Integer professorId;

    @Column(name = "start_date")
    private LocalDate startDate;

    @Column(name = "end_date")
    private LocalDate endDate;

    @Column(name = "capacity")
    private Integer capacity;
}
