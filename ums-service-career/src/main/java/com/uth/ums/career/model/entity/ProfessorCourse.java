package com.uth.ums.career.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "professor_course")
public class ProfessorCourse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "professor_course_id", nullable = false)
    private Long professorCourseId;

    @ManyToOne
    @JoinColumn(name = "professor_id")
    Professor professor;

    @ManyToOne
    @JoinColumn(name = "course_id")
    Course course;
}
