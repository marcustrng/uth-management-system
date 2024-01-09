package com.uth.ums.enrollment.feignclient.service;

import com.uth.ums.enrollment.feignclient.dto.CareerDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "UMS-SERVICE-CAREER", url = "http://localhost:8080")
public interface CareerApiClient {
  @GetMapping(value = "/ums-service-career/careers/{careerId}")
  CareerDto getCareerById(@PathVariable("careerId") Long careerId);
}
