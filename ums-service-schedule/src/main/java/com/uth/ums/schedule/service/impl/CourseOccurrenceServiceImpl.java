package com.uth.ums.schedule.service.impl;

import com.uth.ums.schedule.model.entity.CourseOccurrence;
import com.uth.ums.schedule.repository.CourseOccurrenceRepository;
import com.uth.ums.schedule.service.CourseOccurrenceService;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class CourseOccurrenceServiceImpl implements CourseOccurrenceService {
    private final CourseOccurrenceRepository courseOccurrenceRepository;

    public CourseOccurrenceServiceImpl(CourseOccurrenceRepository courseOccurrenceRepository) {
        this.courseOccurrenceRepository = courseOccurrenceRepository;
    }

    @Override
    public List<CourseOccurrence> getAllCourseOccurrences() {
        return courseOccurrenceRepository.findAll();
    }

    @Override
    public CourseOccurrence getCourseOccurrenceById(Long courseOccurrenceId) {
        Optional<CourseOccurrence> optionalCourseOccurrence = courseOccurrenceRepository.findById(courseOccurrenceId);
        return optionalCourseOccurrence.orElse(null);
    }

    @Override
    public CourseOccurrence createCourseOccurrence(CourseOccurrence courseOccurrence) {
        return courseOccurrenceRepository.save(courseOccurrence);
    }

    @Override
    public CourseOccurrence updateCourseOccurrence(CourseOccurrence courseOccurrence) {
        return courseOccurrenceRepository.save(courseOccurrence);
    }

    @Override
    public void deleteCourseOccurrence(Long courseOccurrenceId) {
        courseOccurrenceRepository.deleteById(courseOccurrenceId);
    }
}
