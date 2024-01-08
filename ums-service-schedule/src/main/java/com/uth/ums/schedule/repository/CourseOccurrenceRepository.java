package com.uth.ums.schedule.repository;

import com.uth.ums.schedule.model.entity.CourseOccurrence;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseOccurrenceRepository extends JpaRepository<CourseOccurrence, Long> {

	Optional<CourseOccurrence> findByCourseId(Long id);
}
