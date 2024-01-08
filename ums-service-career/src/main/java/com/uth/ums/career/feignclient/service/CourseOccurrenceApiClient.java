package com.uth.ums.career.feignclient.service;

import com.uth.ums.career.feignclient.dto.CourseOccurrenceDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "UMS-SERVICE-SCHEDULE", url = "http://localhost:8080")
public interface CourseOccurrenceApiClient {
  @RequestMapping(value = "/schedules/course-occurrences/courses")
  CourseOccurrenceDto getCourseOccurrenceByCourseId(@RequestParam("courseId") Long courseId);
}
