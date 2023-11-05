package com.uth.ums.career.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "semester_course")
public class SemesterCourse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "semester_course_id", nullable = false)
    private Long semesterCourseId;

    @ManyToOne
    @JoinColumn(name = "semester_id")
    Semester semester;

    @ManyToOne
    @JoinColumn(name = "course_id")
    Course course;
}
