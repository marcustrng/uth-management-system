//package com.uth.ums.schedule.feignclient;
//
//import com.uth.ums.schedule.model.dto.CourseDto;
//import org.springframework.cloud.openfeign.FeignClient;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//
//@FeignClient(value = "UMS-SERVICE-CAREER", url = "http://localhost:8080")
//public interface CareerApiClient {
//	@GetMapping(value = "/api/careers/{classCode}/courses")
//	CourseDto getAllCourseById(@PathVariable("classCode") String classCode);
//
//}
