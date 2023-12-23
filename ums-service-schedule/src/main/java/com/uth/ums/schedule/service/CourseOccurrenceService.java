package com.uth.ums.schedule.service;

import com.uth.ums.schedule.model.entity.CourseOccurrence;

import java.util.List;

public interface CourseOccurrenceService {
    List<CourseOccurrence> getAllCourseOccurrences();

    CourseOccurrence getCourseOccurrenceById(Long courseOccurrenceId);

    CourseOccurrence createCourseOccurrence(CourseOccurrence courseOccurrence);

    CourseOccurrence updateCourseOccurrence(CourseOccurrence courseOccurrence);

    void deleteCourseOccurrence(Long courseOccurrenceId);
}
