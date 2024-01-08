package com.uth.ums.career.feignclient.service;

import com.uth.ums.career.feignclient.dto.CourseOccurrenceDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "UMS-SERVICE-SCHEDULE", url = "http://localhost:8080")
public interface CourseOccurrenceApiClient {
  @GetMapping(value = "/schedules/course-occurrences?courseId={courseId}")
  CourseOccurrenceDto getCourseOccurrenceByCourseId(@PathVariable("courseId") Long courseId);
}
