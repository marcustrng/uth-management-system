package com.uth.ums.career.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping(value = "/api/v1/careers")
@RequiredArgsConstructor
public class CareerController {

    @GetMapping()
    @PreAuthorize("hasRole('STUDENT')")
    public ResponseEntity<String> ping() {
        return ResponseEntity.ok("pong");
    }


}
